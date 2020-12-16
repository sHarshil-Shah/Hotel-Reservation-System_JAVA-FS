package com.wipro.controller;

import java.text.ParseException;

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

	@RequestMapping("PreInsertHotel")
	public ModelAndView preInsert() {
		Hotel hotel = new Hotel();
		hotel.setId(1);
		ModelAndView mv = new ModelAndView("SearchHotel", "hotel", hotel);
		System.out.println("Pre insert\n " + hotel.toString());
		return mv;
	}

	@RequestMapping("GoToConfirmation")
	public String checkReservation(Model model, @ModelAttribute("hotel") Hotel hotel) throws ParseException {
		System.out.println("Go To confirmation\n " + hotel.toString());

		if (dao.searchHotel(hotel)) {
			return "Rejection";
		} else {
			model.addAttribute("hotel", hotel);
			System.out.println("Go To confirmation agian:\n " + hotel.toString());
			return "ConfirmReservation";
		}

	}

	@RequestMapping("CheckReservation")
	public String goGuestDetails(Model model, @ModelAttribute("hotel") Hotel hotel) {
		System.out.println("Here");
		model.getAttribute("hotel");
		System.out.println("Check reservation\n" + hotel.toString());
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