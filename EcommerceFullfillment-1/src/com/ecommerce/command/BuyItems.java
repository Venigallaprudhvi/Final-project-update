package com.ecommerce.command;

import com.ecommerce.scanner.ApparelScanner;
import com.ecommerce.scanner.HealthCareScanner;
import com.ecommerce.template.EcommerceFullfillmentTemplate;
import com.ecommerce.template.OrderProcessing;

public class BuyItems implements TransactionType {

	public void execute(String category, String itemAvailability) {
		ApparelScanner apparelScanner = new ApparelScanner();
		HealthCareScanner hcScanner = new HealthCareScanner();
		String orderNumber = "";
		if ("Apparel".equalsIgnoreCase(category)) {
			orderNumber = apparelScanner.getBuyApparel();
		} else if ("HealthCare".equalsIgnoreCase(category)) {
			orderNumber = hcScanner.getHealthCareBuyProducts();
		}

		EcommerceFullfillmentTemplate pl = new OrderProcessing();
		pl.orderProcess(itemAvailability, orderNumber);

	}
}
