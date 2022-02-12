package com.ecommerce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OrderProcessing extends EcommerceFullfillmentTemplate
{
	
    @Override
    public boolean inventory(String itemAvailable) {
         if("Yes".equalsIgnoreCase(itemAvailable)) {
        	 return true;
         }
         return false;
    	
    }
  
    @Override
    public void picking() {
    	timer();
    	System.out.println("Item is picked from the warehouse");
    }
 
    @Override
    public void packing() {
    	timer();
    	System.out.println("Item is packed and ready for shipping");
    }
	
    @Override
	public void shipping(String orderNumber){
    	timer();
    	System.out.println("The item is shipped for the order "+orderNumber);
	}
 
    @Override
	public void delivery(String orderNumber) {
    	timer();
    	System.out.println("The item is delivered for the order "+orderNumber);
	}
    
    @Override
	public void itemNotAvailable(String orderNumber) {
    	timer();
    	System.out.println("The item is not available for the order "+orderNumber);
	}
    
    private void timer() {
    	try {
    		Thread.sleep(1000);
        	}catch(Exception e) {
        		e.getMessage();
        	}
    }

}
