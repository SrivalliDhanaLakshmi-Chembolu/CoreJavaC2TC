package com.tns.framework;

public class NormalAccount extends ShopAccount {

	public float deliveryCharge;

	public NormalAccount(int accNo, String accName, float charges, float deliveryCharge) {
		super(accNo, accName, charges);
		this.deliveryCharge = deliveryCharge;
	}
	
	public void bookProduct(float charges) {
		
	}

	@Override
	public String toString() {
		return "NormalAccount [deliveryCharge=" + deliveryCharge + "]";
	}
	
	
	

}
