package com.immutability.otherclass.refe;

public final class Student {
	private final int sid;
	private final String sname;
	private final double sfee;
	private Course ccname;
	public Student(int sid, String sname, double sfee, Course ccnamee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		ccnamee=new Course(ccnamee.cname);
		this.ccname = ccnamee;
	}
	public int getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
	public double getSfee() {
		return sfee;
	}
	public Course getCcname() {
		return ccname;
	}
	@Override
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", ccname=" + ccname;
	}
	
	
	
	

}
