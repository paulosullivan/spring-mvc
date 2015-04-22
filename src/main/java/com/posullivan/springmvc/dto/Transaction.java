package com.posullivan.springmvc.dto;

import org.joda.time.LocalDate;

public class Transaction {

	private LocalDate date;
	
	private Integer price;
	
	private String type;
	
	private Vehicle vehicle;
	
	private Customer customer;
	
	private Employee salesPerson;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Employee getSalesPerson() {
		return salesPerson;
	}

	public void setSalesPerson(Employee salesPerson) {
		this.salesPerson = salesPerson;
	}
	
}
