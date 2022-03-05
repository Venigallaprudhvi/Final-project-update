package com.ecommerce.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.order.iterator.eCommerceIterator;

public class ApparelScanner {
	
	
	public String getBuyApparel() {
		String orderNumber ="";
		Scanner itemScanner = new Scanner(System.in);
		System.out.println("Please Select your Category ");
		int i = 1;

		eCommerceIterator temp = createIterator("Buy");
		while (temp.hasNext()) {
			String value = temp.next().toString();
			System.out.println(i + ")" + value);
			i = i + 1;
		}

		switch (itemScanner.nextInt()) {
		case 1:
			System.out.println("Mens formal Troursers XL");
			System.out.println("Order Placed on 18 February 2022");
			System.out.println("Quantity Ordered - 2");
			System.out.println("orderNumber 8975543");
			orderNumber="8975543";
			break;
		case 2:
			System.out.println("SERONA FABRICS Women's Assam Cotton Silk With Golden Border ");
			System.out.println("Order Placed on 10 February 2022");
			System.out.println("Quantity Ordered - 1");
			System.out.println("orderNumber 0546713");
			orderNumber="0546713";
			break;
		case 3:
			System.out.println("kids shoes size 13");
			System.out.println("Order Placed on 11 February 2022");
			System.out.println("Quantity Ordered - 1");
			System.out.println("orderNumber 3245551");
			orderNumber="3245551";
			break;	
		}
		return orderNumber;
	}
	
	public String getSellApparel(String itemAvailability) {
		String orderNumber ="";
		Scanner itemScanner = new Scanner(System.in);
		System.out.println("Please Select your Category ");
		int i = 1;

		eCommerceIterator temp = createIterator("Sell");
		while (temp.hasNext()) {
			String value = temp.next().toString();
			System.out.println(i + ")" + value);
			i = i + 1;
		}

		switch (itemScanner.nextInt()) {
		case 1:
			System.out.println("Mens formal Shirts XXL");
			if("yes".equalsIgnoreCase(itemAvailability)) {
				System.out.println("Quantity Available - 6");
			}
			orderNumber="sell";
			break;
		case 2:
			System.out.println("BEBA FABRICS Women's Party ware ");
			if("yes".equalsIgnoreCase(itemAvailability)) {
				System.out.println("Quantity Available - 8");
			}
			orderNumber="sell";
			break;
		case 3:
			System.out.println("kids T-shirts size 14");
			if("yes".equalsIgnoreCase(itemAvailability)) {
				System.out.println("Quantity Available - 10");
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
	
	private eCommerceIterator createIterator(String type) {
		if("Buy".equalsIgnoreCase(type)){
			return new eCommerceIterator(getBuyCategoryNames());
		}else if("Sell".equalsIgnoreCase(type)){
			return new eCommerceIterator(getSellCategoryNames());
		}else {
			return new eCommerceIterator(getTransactionTypes());
		}
	}
	
	public List<String> getBuyCategoryNames() {
		List<String> ccn = new ArrayList<String>();
		ccn.add("Mens Formal Troursers");
		ccn.add("Womens Silk Sarees");
		ccn.add("Kids Shoes");
		return ccn;
	}
	
	public List<String> getSellCategoryNames() {
		List<String> ccn = new ArrayList<String>();
		ccn.add("Mens Formal Shirts");
		ccn.add("Womens Party Wear");
		ccn.add("Kids T-shirts");
		return ccn;
	}
	
	public List<String> getTransactionTypes() {
		List<String> tt = new ArrayList<String>();
		tt.add("Buy");
		tt.add("Sell");
		return tt;
	}

}
