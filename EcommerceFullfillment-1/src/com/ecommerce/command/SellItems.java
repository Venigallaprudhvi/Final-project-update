package com.ecommerce.command;

import com.ecommerce.scanner.ApparelScanner;
import com.ecommerce.scanner.HealthCareScanner;
import com.ecommerce.template.EcommerceFullfillmentTemplate;
import com.ecommerce.template.OrderProcessing;

public class SellItems implements TransactionType {

	public void execute(String category, String itemAvailability) {
		ApparelScanner apparelScanner = new ApparelScanner();
		HealthCareScanner hcScanner = new HealthCareScanner();
		String order = "";
		if ("Apparel".equalsIgnoreCase(category)) {
			order = apparelScanner.getSellApparel(itemAvailability);
		} else if ("HealthCare".equalsIgnoreCase(category)) {
			order = hcScanner.getHealthCareSellProducts(itemAvailability);
		}

		EcommerceFullfillmentTemplate pl = new OrderProcessing();
		pl.orderProcess(itemAvailability, order);
	}
}
