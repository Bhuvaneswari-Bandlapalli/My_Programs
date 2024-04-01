package com.immutability.otherclass.refe;

public class Main {
	public static void main(String[] args) {
		Course c=new Course("java");
		Student s=new Student(1,"bhuvana",3456.78,c);
		System.out.println("original: "+s.getSid()+"---"+s.getSname()+"---"+s.getSfee()+"---"+s.getCcname());
	    c.cname="spring";
	    System.out.println("after chaniging: "+s.getSid()+"--"+s.getSname()+"---"+s.getSfee()+s.getCcname());
	    
	
	}
	
	
}
