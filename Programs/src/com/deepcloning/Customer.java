package com.deepcloning;

public class Customer implements Cloneable {
	private int cid;
	private String cName;
	private Address adds;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Address getAdds() {
		return adds;
	}
	public void setAdds(Address adds) {
		this.adds = adds;
	}
	public Customer(int cid, String cName, Address adds) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.adds = adds;
	}
	@Override
	public String toString() {
		return "cid=" + cid + ", cName=" + cName + ", adds=" + adds;
	}
	
	public Object clone() throws CloneNotSupportedException{
	    Customer s=(Customer)super.clone();
	    s.adds=(Address)adds.clone();
		
		return s;
	  }

}
