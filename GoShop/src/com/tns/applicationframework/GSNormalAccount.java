package com.tns.applicationframework;

import com.tns.framework.NormalAccount;

public class GSNormalAccount extends NormalAccount {

	public GSNormalAccount(int accNo, String accName, float charges, float deliveryCharge) {
		super(accNo, accName, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}
    public void bookProduct(float charges) {
    	System.out.println("Dear normal user your product charges are:"+charges+"with delivery charges"+deliveryCharge);
    }
	@Override
	public String toString() {
		return "GSNormalAccount []";
	}
	

}
