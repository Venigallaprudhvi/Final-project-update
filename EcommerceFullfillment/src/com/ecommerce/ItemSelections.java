package com.ecommerce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ItemSelections {
	
	String selectItem = "";
	
	public String selectCategory() {
		Scanner itemScanner = new Scanner(System.in); 
        System.out.println("Please Select your Category ");
			int i =1;
			Iterator iterator = getCategoryNames().iterator();
			while(iterator.hasNext()) {
				String category = (String)iterator.next();
				System.out.println(i+" "+category);
				i = i+1;
			}
			
			switch(itemScanner.nextInt()) {
			case 1: selectItem = "apparels";
			        break;
			case 2: selectItem = "healthCare";
	        		break;
				
			}
		return selectItem;
	}
	
	private List<String> getCategoryNames() {
		List<String> ccn = new ArrayList<String>();
		ccn.add("Apparel");
		ccn.add("Health Care");
		return ccn;
	}
	
}
