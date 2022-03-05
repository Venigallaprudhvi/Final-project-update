package com.ecommerce.factory;

import java.util.Scanner;

import com.ecommerce.command.BuyItems;
import com.ecommerce.command.SellItems;
import com.ecommerce.command.TransactionType;
import com.ecommerce.scanner.ApparelScanner;

public class Apparel  implements ItemOrder {
	ApparelScanner apparelScanner = new ApparelScanner();
	public void createOrder(String itemAvailable) {
		String type = "";
		Scanner typeScanner = apparelScanner.getTransactionType();
		switch (typeScanner.nextInt()) {
			case 1:
				type = "buy";
				TransactionType bi = new BuyItems();
		        bi.execute("Apparel",itemAvailable);
				break;
			case 2:
				type = "sell";
				TransactionType si = new SellItems();
		        si.execute("Apparel",itemAvailable);
				break;
			}
	}
}     
