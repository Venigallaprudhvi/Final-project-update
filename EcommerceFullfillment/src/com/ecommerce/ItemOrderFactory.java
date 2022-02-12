package com.ecommerce;

public class ItemOrderFactory {

	public static ItemOrder ItemsByCategory(String category) {

		if ("apparels".equalsIgnoreCase(category)) {
			return new Apparel();
		} else if ("healthCare".equalsIgnoreCase(category)) {
			return new HealthCare();
		} else {
			System.out.println("Please select from the available Categories");
		}
		return null;
	}
}
