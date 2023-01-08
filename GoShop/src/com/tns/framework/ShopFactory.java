package com.tns.framework;

public interface ShopFactory {
	
	public abstract PrimeAccount getNewPrimeAccount(int accNo,String accName,float charges,boolean isPrime);
	public abstract NormalAccount getNewNormalAccount(int accNo, String accName, float charges, float deliveryCharge);

}
