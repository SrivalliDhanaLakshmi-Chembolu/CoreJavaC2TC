package com.tns.applicationframework;

import com.tns.framework.PrimeAccount;

public class GSPrimeAccount extends PrimeAccount {

	private final float charges=0;
	
	public GSPrimeAccount(int accNo, String accName, float charges, boolean isPrime) {
		super(accNo, accName, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float charges) {
		System.out.println("Dear Prime user your product charges are:"+charges);
		
	}

	@Override
	public String toString() {
		return "GSPrimeAccount [charges=" + charges + "]";
	}
	

}
