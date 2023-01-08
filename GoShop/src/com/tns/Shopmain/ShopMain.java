package com.tns.Shopmain;

import com.tns.applicationframework.GSNormalAccount;
import com.tns.applicationframework.GSPrimeAccount;
import com.tns.applicationframework.GSShopFactory;

public class ShopMain {

	public static void main(String[] args) {
		GSShopFactory GSFactory = new GSShopFactory();
		//GSFactory.getNewPrimeAccount(1, "Vaheedha", 6768, true);
		//GSFactory.getNewNormalAccount(2, "Noorjahan", 75876, 50);
		
		GSPrimeAccount GSPrime = new GSPrimeAccount(1, "Vaheedha", 6768, true);
        GSPrime.bookProduct(8798);
        
        GSNormalAccount normal = new GSNormalAccount(2, "Noorjahan", 75876, 50);
	    normal.bookProduct(758750);
	    
	    
	    GSPrime.toString();
	    normal.toString();
	}
	

}
