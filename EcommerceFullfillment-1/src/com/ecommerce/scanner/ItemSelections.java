package com.ecommerce.scanner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.order.iterator.eCommerceIterator;

public class ItemSelections {

	String selectItem = "";

	public String selectCategory() {
		Scanner itemScanner = new Scanner(System.in);
		System.out.println("Please Select your Category ");
		int i = 1;

		eCommerceIterator temp = createIterator();
		while (temp.hasNext()) {
			String value = temp.next().toString();
			System.out.println(i + ")" + value);
			i = i + 1;
		}

		switch (itemScanner.nextInt()) {
		case 1:
			selectItem = "apparels";
			break;
		case 2:
			selectItem = "healthCare";
			break;
		}
		return selectItem;
	}

	private eCommerceIterator createIterator() {
		return new eCommerceIterator(getCategoryNames());
	}

	private List<String> getCategoryNames() {
		List<String> ccn = new ArrayList<String>();
		ccn.add("Apparel");
		ccn.add("Health Care");
		return ccn;
	}

}
