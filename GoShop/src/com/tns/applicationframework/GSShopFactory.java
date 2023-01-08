package com.tns.applicationframework;

import com.tns.framework.NormalAccount;
import com.tns.framework.PrimeAccount;
import com.tns.framework.ShopFactory;

public class GSShopFactory implements ShopFactory {

	@Override
	public GSPrimeAccount getNewPrimeAccount(int accNo, String accName, float charges, boolean isPrime) {
		GSPrimeAccount GSPrime = new GSPrimeAccount(accNo,accName,charges,isPrime); 
		return GSPrime;
	}

	@Override
	public GSNormalAccount getNewNormalAccount(int accNo, String accName, float charges, float deliveryCharge) {
		GSNormalAccount GSNormal = new GSNormalAccount(accNo,accName,charges,deliveryCharge);
		return GSNormal;
	}
    
	

}
