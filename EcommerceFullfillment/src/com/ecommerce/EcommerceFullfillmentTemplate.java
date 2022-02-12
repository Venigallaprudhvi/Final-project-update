package com.ecommerce;


public abstract class EcommerceFullfillmentTemplate {
    
	public abstract void picking();
 
    public abstract void packing();
 
    public abstract void shipping(String orderNumber);
	
	public abstract void delivery(String orderNumber);
 
	public abstract boolean inventory(String itemAvailable);
	
	public abstract void itemNotAvailable(String orderNumber);
 
    public final void orderProcess(String itemAvailable,String orderNumber)
    {
    	if(inventory(itemAvailable)){
    		picking();
    		packing();
    		shipping(orderNumber);
    		delivery(orderNumber);
    	}else {
    		itemNotAvailable(orderNumber);
    	}
    }
}