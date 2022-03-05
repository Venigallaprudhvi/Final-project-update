package com.ecommerce;

import com.ecommerce.factory.ItemOrder;
import com.ecommerce.factory.ItemOrderFactory;
import com.ecommerce.scanner.ItemSelections;

public class eCommerceFulfillmentDemo {

	public static void main(String[] args) {
		ItemSelections item = new ItemSelections();
		String category = item.selectCategory();
		try {
			ItemOrder io = ItemOrderFactory.ItemsByCategory(category);
			io.createOrder("Yes");
		} catch (NullPointerException e) {
		}
		System.out.println();
		ItemSelections item1 = new ItemSelections();
		String category1 = item1.selectCategory();
		try {
			ItemOrder io1 = ItemOrderFactory.ItemsByCategory(category1);
			io1.createOrder("Yes");
		} catch (NullPointerException e) {
		}
		System.out.println();
		ItemSelections item2 = new ItemSelections();
		String category2 = item2.selectCategory();
		try {
			ItemOrder io2 = ItemOrderFactory.ItemsByCategory(category2);
			io2.createOrder("No");
		} catch (NullPointerException e) {
		}
	}
}
