package com.wipro.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wipro.bean.HotelDetails;

@Repository
@Transactional
public class HotelDetailsDao {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	HibernateTemplate hibernateTemplate;

	public int[] getPriceGSTByHotelName(String name) {
		Session session = sessionFactory.openSession();
		Query<HotelDetails> qry = session.createQuery("from HotelDetails where hName='" + name + "'");
		List<HotelDetails> l = qry.list();
		session.close();
		return new int[] { l.get(0).getPrice(), l.get(0).getGST() };
	}
}