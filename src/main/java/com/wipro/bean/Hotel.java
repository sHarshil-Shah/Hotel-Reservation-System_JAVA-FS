package com.wipro.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String city;
	@Column
	private String hName;

	@Basic
	@Temporal(TemporalType.DATE)
	private Date stay_date;
	@Column
	private String room_type;
	@Column
	private int price;
	@Column
	private int GST;

	@Column
	private String gName;
	@Column
	private String Gender;
	@Column
	private int Age;
	@Column
	private String email;
	@Column
	private String mobile;

	public Hotel() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	public Date getStay_date() {
		return stay_date;
	}

	public void setStay_date(String stay_date) throws ParseException {
		try {
			this.stay_date = new SimpleDateFormat("yyyy-MM-dd").parse(stay_date);
		} catch (ParseException p) {
			this.stay_date = (Date) new SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy").parse(stay_date);
		}
	}

	public String getRoom_type() {
		return room_type;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getGST() {
		return GST;
	}

	public void setGST(int gST) {
		GST = gST;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Hotel(int id, String city, String hName, Date stay_date, String room_type, int price, int gST, String gName,
			String gender, int age, String email, String mobile) {
		super();
		this.id = id;
		this.city = city;
		this.hName = hName;
		this.stay_date = stay_date;
		this.room_type = room_type;
		this.price = price;
		GST = gST;
		this.gName = gName;
		Gender = gender;
		Age = age;
		this.email = email;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", city=" + city + ", hName=" + hName + ", stay_date=" + stay_date + ", room_type="
				+ room_type + ", price=" + price + ", GST=" + GST + ", gName=" + gName + ", Gender=" + Gender + ", Age="
				+ Age + ", email=" + email + ", mobile=" + mobile + "]";
	}

}