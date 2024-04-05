package com.prowing.wirebeans;

public class Address {

	private int pin;
	private String city;
	private String state;
	private String country;
	
	
	public Address() {
		super();
		System.out.println(">>> Address initialized!!!");

 	}


	public Address(int pin, String city, String state, String country) {
		super();
		this.pin = pin;
		this.city = city;
		this.state = state;
		this.country = country;
	}


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	 
	public String toString() {
		return "Address[pin = " + pin + ",city= " + city + ",state= " + state + ",country= " + country + "]";
	
	}
	
	
	
}
