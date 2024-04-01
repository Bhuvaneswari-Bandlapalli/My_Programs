package com.deepcloning;

public class Main {

	public static void main(String[] args) {
		Address ad=new Address("13-23a","uvpalli","ananthapur");
		Customer c=new Customer(1,"bhuvana",ad);
		Customer cs=null;
		try {
			cs=(Customer)c.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("original"+c);
		ad.setDoorNum("45-98u");
		System.out.println("after change the clone object: "+cs);
		System.out.println("after change the original object: "+c);
	}

}
