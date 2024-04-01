package com.immutability.userdefinedclass;

public final class Customer{
	private final int cid;
	private final String cname;
	private final int cage;
	public Customer(int cid, String cname, int cage) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cage = cage;
	}
	@Override
	public String toString() {
		return "cid=" + cid + ", cname=" + cname + ", cage=" + cage;
		
	}
	public int getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public int getCage() {
		return cage;
	}
	
	
	
}
