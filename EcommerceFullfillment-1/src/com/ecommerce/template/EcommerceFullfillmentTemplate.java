package com.ecommerce.template;


public abstract class EcommerceFullfillmentTemplate {
    
	public abstract void picking();
 
    public abstract void packing();
 
    public abstract void shipping(String orderNumber);
	
	public abstract void delivery(String orderNumber);
 
	public abstract boolean inventory(String itemAvailable);
	
	public abstract void itemNotAvailable(String orderNumber);
 
    public final void orderProcess(String itemAvailable,String order)
    {
    	if(inventory(itemAvailable)){
    		if("sell".equalsIgnoreCase(order)) {
        		shipping(order);	
        		delivery(order);
    		}else {
	    		picking();
	    		packing();
	    		shipping(order);
	    		delivery(order);
    		}
    	}else {
    		itemNotAvailable(order);
    	}
    }
}