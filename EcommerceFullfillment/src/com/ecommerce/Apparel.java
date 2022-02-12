package com.ecommerce;

import java.util.Iterator;
import java.util.Scanner;

public class Apparel  implements ItemOrder {
	
	public void createOrder(String itemAvailable) {
		String orderNumber="";
		if("yes".equalsIgnoreCase(itemAvailable)) {
			System.out.println("SERONA FABRICS Women's Assam Cotton Silk With Golden Border ");
			System.out.println("Order Placed on 10 February 2022");
			System.out.println("Quantity Ordered - 1");
			System.out.println("orderNumber 0546713");
			orderNumber="0546713";
		}else {
			System.out.println("kids shoes size 13");
			System.out.println("Order Placed on 11 February 2022");
			System.out.println("Quantity Ordered - 1");
			System.out.println("orderNumber 3245551");
			orderNumber="3245551";
		}
		
		
		EcommerceFullfillmentTemplate pl = new OrderProcessing();
	        pl.orderProcess(itemAvailable,orderNumber);
	}
}     
