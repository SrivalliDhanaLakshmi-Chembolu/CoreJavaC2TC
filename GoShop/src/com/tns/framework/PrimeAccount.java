package com.tns.framework;

public class PrimeAccount extends ShopAccount {

	boolean isPrime;

	public PrimeAccount(int accNo, String accName, float charges, boolean isPrime) {
		super(accNo, accName, charges);
		this.isPrime = isPrime;
	}
	
	public void bookProduct(float charges) {
           
	}

	@Override
	public String toString() {
		return "PrimeAccount [isPrime=" + isPrime + "]";
	}
       
}
