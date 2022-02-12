package com.ecommerce;

import java.util.Iterator;
import java.util.Scanner;

public class HealthCare  implements ItemOrder {
	
public void createOrder(String itemAvailable) {
	String orderNumber="";	
	if("yes".equalsIgnoreCase(itemAvailable)) {
		System.out.println(" Chyawanprakash Sugarfree ");
		System.out.println("Order Placed on 12 February 2022");
		System.out.println("Quantity Ordered - 2");
		System.out.println("orderNumber 4655733");
		orderNumber="4655733";
	}else {
		System.out.println(" Glucose 500grams Jar ");
		System.out.println("Order Placed on 01 February 2022");
		System.out.println("Quantity Ordered - 1");
		System.out.println("orderNumber 8972632");
		orderNumber="8972632";
	}
		EcommerceFullfillmentTemplate pl = new OrderProcessing();
	        pl.orderProcess(itemAvailable,orderNumber);
	}
}     
