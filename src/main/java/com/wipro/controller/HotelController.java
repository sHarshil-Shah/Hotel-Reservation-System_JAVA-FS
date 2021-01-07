package com.wipro.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.wipro.bean.*;
import com.wipro.dao.*;

@Controller
public class HotelController {
	@Autowired
	ReservationDao dao;

	@Autowired
	HotelDetailsDao detailsDao;

	@RequestMapping("PreInsertHotel")
	public ModelAndView preInsert() {
		return new ModelAndView("SearchHotel", "hotel", new Hotel());
	}

	@RequestMapping("GoToConfirmation")
	public String checkReservation(Model model, @ModelAttribute("hotel") Hotel hotel) throws ParseException {
		System.out.println("Go To confirmation\n " + hotel.toString());
		Date testDate = hotel.getStay_date();
		if (!(testDate.after(new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2020"))
				&& testDate.before(new SimpleDateFormat("dd/MM/yyyy").parse("31/12/2020")))) {
			model.addAttribute("error", "Invalid Date - It must be between 1/1/2020 to 31/12/2020");
			return "SearchHotel";
		}

		if (dao.searchHotel(hotel)) {
			return "Rejection";
		} else {
			model.addAttribute("hotel", hotel);
			int hotelDetail[] = detailsDao.getPriceGSTByHotelName(hotel.gethName());
			hotel.setPrice(hotelDetail[0]);
			hotel.setGST(hotelDetail[1]);
			System.out.println("Go To confirmation agian:\n " + hotel.toString());
			return "ConfirmReservation";
		}

	}

	@RequestMapping("CheckReservation")
	public String goGuestDetails(Model model, @ModelAttribute("hotel") Hotel hotel) {
		model.getAttribute("hotel");

		model.addAttribute("hotel", hotel);
		System.out.println("Check reservation again: \n" + hotel.toString());
		return "GuestDetails";
	}

	@RequestMapping("InsertGuest")
	public String goToConfirmation(Model model, @ModelAttribute("hotel") Hotel hotel) {
		System.out.println("Insert guest\n" + hotel.toString());
		model.getAttribute("hotel");
		dao.insertDepatment(hotel);
		model.addAttribute("hotel", hotel);
		return "confirmation";
	}

	@RequestMapping("GoBack")
	public ModelAndView goToSearchHotel(@ModelAttribute("hotel") Hotel hotel) {
		System.out.println("Go back\n" + hotel.toString());
		return new ModelAndView("SearchHotel", "hotel", hotel);
	}
}