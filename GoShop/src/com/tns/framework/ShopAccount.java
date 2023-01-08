package com.tns.framework;

public class ShopAccount {
	int accNo;
	String accName;
	float charges;
	
	public ShopAccount(int accNo, String accName, float charges) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.charges = charges;
	}
	
	public void bookProduct(float charges) {
		
	}
	    
	public void items(float charges) {
		
	}

	@Override
	public String toString() {
		return "ShopAccount [accNo=" + accNo + ", accName=" + accName + ", charges=" + charges + "]";
	}
	 
	
	
	
}