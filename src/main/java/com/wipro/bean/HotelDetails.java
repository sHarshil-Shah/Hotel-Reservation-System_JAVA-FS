package com.wipro.bean;

import javax.persistence.*;

@Entity
public class HotelDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String hName;
	@Column
	private int price;
	@Column
	private int GST;

	public HotelDetails() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
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

	@Override
	public String toString() {
		return "HotelDetails [id=" + id + ", hName=" + hName + ", price=" + price + ", GST=" + GST + "]";
	}

	public HotelDetails(int id, String city, String hName, int price, int gST) {
		super();
		this.id = id;
		this.hName = hName;
		this.price = price;
		GST = gST;
	}

}