package com.ecommerce.factory;

import java.util.Scanner;

import com.ecommerce.command.BuyItems;
import com.ecommerce.command.SellItems;
import com.ecommerce.command.TransactionType;
import com.ecommerce.scanner.HealthCareScanner;

public class HealthCare implements ItemOrder {
	HealthCareScanner hcs = new HealthCareScanner();

	public void createOrder(String itemAvailable) {
		String type = "";
		Scanner typeScanner = hcs.getTransactionType();
		switch (typeScanner.nextInt()) {
		case 1:
			type = "buy";
			TransactionType bi = new BuyItems();
			bi.execute("HealthCare", itemAvailable);
			break;
		case 2:
			type = "sell";
			TransactionType si = new SellItems();
			si.execute("HealthCare", itemAvailable);
			break;
		}
	}
}
