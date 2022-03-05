package com.ecommerce.scanner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.order.iterator.eCommerceIterator;

public class HealthCareScanner {

	public String getHealthCareBuyProducts() {
		String orderNumber ="";
		Scanner itemScanner = new Scanner(System.in);
		System.out.println("Please Select your Items ");
		int i = 1;
		eCommerceIterator temp = createIterator("HealthCare");
		while (temp.hasNext()) {
			String value = temp.next().toString();
			System.out.println(i + ")" + value);
			i = i + 1;
		}

		switch (itemScanner.nextInt()) {
		case 1:
			System.out.println("Sugar Tablets");
			System.out.println("Order Placed on 22 February 2022");
			System.out.println("Quantity Ordered - 50");
			System.out.println("orderNumber 2423424");
			orderNumber="2423424";
			break;
		case 2:
			System.out.println("Hemoglobin Syrup ");
			System.out.println("Order Placed on 25 February 2022");
			System.out.println("Quantity Ordered - 2");
			System.out.println("orderNumber 9326713");
			orderNumber="9326713";
			break;
		case 3:
			System.out.println("Antibiotic Injection");
			System.out.println("Order Placed on 19 February 2022");
			System.out.println("Quantity Ordered - 5");
			System.out.println("orderNumber 4562723");
			orderNumber="4562723";
			break;	
		}
		return orderNumber;
	}
	
	public String getHealthCareSellProducts(String itemAvailability) {
		String orderNumber ="";
		Scanner itemScanner = new Scanner(System.in);
		System.out.println("Please Select your Items ");
		int i = 1;

		eCommerceIterator temp = createIterator("HealthCare");
		while (temp.hasNext()) {
			String value = temp.next().toString();
			System.out.println(i + ")" + value);
			i = i + 1;
		}

		switch (itemScanner.nextInt()) {
		case 1:
			System.out.println("Sugar Tables");
			if("yes".equalsIgnoreCase(itemAvailability)) {
				System.out.println("Quantity Available - 200 tablets");
			}
			orderNumber="sell";
			break;
		case 2:
			System.out.println("Hemoglobin syrup ");
			if("yes".equalsIgnoreCase(itemAvailability)) {
				System.out.println("Quantity Available - 35 syrups");
			}
			orderNumber="sell";
			break;
		case 3:
			System.out.println("Antibiotic Injection");
			if("yes".equalsIgnoreCase(itemAvailability)) {
				System.out.println("Quantity Available - 75 injections");
			}
			orderNumber="sell";
			break;	
		}
		return orderNumber;
	}
	
	public Scanner getTransactionType() {
		Scanner typeScanner = new Scanner(System.in);
		System.out.println("Please Select your Transaction Type ");
		int i = 1;
		eCommerceIterator temp = createIterator("");
		while (temp.hasNext()) {
			String value = temp.next().toString();
			System.out.println(i + ")" + value);
			i = i + 1;
		}
		return typeScanner;
	}
	
	private eCommerceIterator createIterator(String category) {
		if("HealthCare".equalsIgnoreCase(category)){
			return new eCommerceIterator(getHealthCareCategoryNames());
		}else {
			return new eCommerceIterator(getTransactionTypes());
		}
	}

	public List<String> getHealthCareCategoryNames() {
		List<String> ccn = new ArrayList<String>();
		ccn.add("Tablets");
		ccn.add("Syrup");
		ccn.add("Injections");
		return ccn;
	}
	
	public List<String> getTransactionTypes() {
		List<String> tt = new ArrayList<String>();
		tt.add("Buy");
		tt.add("Sell");
		return tt;
	}

}
