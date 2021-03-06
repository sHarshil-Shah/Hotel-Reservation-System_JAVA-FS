package com.wipro.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.wipro.bean.Hotel;

@Repository
@Transactional
public class ReservationDao {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	HibernateTemplate hibernateTemplate;

	public int getDepartmentId() {
		int id = 0;
		Session session = sessionFactory.openSession();
		Query<Hotel> qry = session.createQuery("Select max(d.id) from Hotel d");
		List l = qry.list();
		System.out.println("L value" + l + " : ");
		if (l != null && l.size() > 0) {
			Object b = l.get(0);
			if (b != null)
				id = (Integer) b;
		}
		session.close();
		return id + 10;
	}

	public boolean insertDepatment(Hotel hotel) {
		hibernateTemplate.persist(hotel);
		return true;
	}

	public boolean searchHotel(Hotel hotel) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");

		List<Hotel> l = (List<Hotel>) hibernateTemplate.find("from Hotel d where d.stay_date = '"
				+ formatter.format(hotel.getStay_date()) + "' and hname='" + hotel.gethName() + "'");
		System.out.println(l.size());

		return l.size() == 0 ? false : true;
	}
}