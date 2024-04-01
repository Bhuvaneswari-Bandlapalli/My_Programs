package com.deepcloning;

public class Address implements Cloneable{
	private String doorNum;
	private String street;
	private String city;
	
	public Address(String doorNum, String street, String city) {
		super();
		this.doorNum = doorNum;
		this.street = street;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [doorNum=" + doorNum + ", street=" + street + ", city=" + city + "]";
	}

	public String getDoorNum() {
		return doorNum;
	}

	public void setDoorNum(String doorNum) {
		this.doorNum = doorNum;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	 public Object clone() throws CloneNotSupportedException {
		 return super.clone();
	 }
}
