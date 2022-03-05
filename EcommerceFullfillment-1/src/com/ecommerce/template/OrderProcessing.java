package com.ecommerce.template;

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
	public void shipping(String order){
    	timer();
    	if("sell".equalsIgnoreCase(order)) {
    		System.out.println("Free Shipping, if ordered before March 31st 2022");
    	}else {
    		System.out.println("The item is shipped for the order "+order);
    	}
	}
 
    @Override
	public void delivery(String order) {
    	timer();
    	if("sell".equalsIgnoreCase(order)) {
    		System.out.println("This item will be delivered in 2 days from ordered date.");
    	}else {
    		System.out.println("The item is delivered for the order "+order);
    	}
	}
    
    @Override
	public void itemNotAvailable(String order) {
    	timer();
    	if("sell".equalsIgnoreCase(order)) {
    		System.out.println("This item is not currently available.");
    	}else {
    		System.out.println("The item is not available for the order "+order);
    	}
	}
    
    private void timer() {
    	try {
    		Thread.sleep(1000);
        	}catch(Exception e) {
        		e.getMessage();
        	}
    }

}
