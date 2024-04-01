package com.immutability.otherclass.refe;

public class Course {
	public String cname;
	public Course() {
		
	}
	public Course(String cname) {
		super();
		this.cname = cname;
	}
	public String getCname() {
		return cname;
	}
	@Override
	public String toString() {
		return "Course [cname=" + cname + "]";
	}
	

}
