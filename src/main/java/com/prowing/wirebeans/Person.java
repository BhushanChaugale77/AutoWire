package com.prowing.wirebeans;

public class Person {

	private int id;
	private String name;
	private int mobno;
	private Address address;
	
	public Person() {
		super();
 
	}
	
	public Person( Address address) {
		super();
		this.address = address;
	}
	
   
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobno() {
		return mobno;
	}

	public void setMobno(int mobno) {
		this.mobno = mobno;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String toString() {
		return "Person[id= " + id + ",name= " + name + ",mobno= " + mobno + ",Address= " + address + "]";  
	}
}
