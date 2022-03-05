package com.ecommerce.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ecommerce.factory.Apparel;
import com.ecommerce.factory.HealthCare;
import com.ecommerce.factory.ItemOrder;
import com.ecommerce.factory.ItemOrderFactory;

public class ItemFactoryTest 
{
	
	    @Test
	    public void ItemsByCategoryApparelTest() {
	    	ItemOrderFactory cof = new ItemOrderFactory();
	    	ItemOrder co = ItemOrderFactory.ItemsByCategory("apparels");
		 assertNotNull(co);
		 assertTrue(co instanceof Apparel);
	    }
	    
	    @Test
	    public void chooseCompanddyHealthCareTest() {
	    	ItemOrderFactory cof = new ItemOrderFactory();
	    	ItemOrder co = ItemOrderFactory.ItemsByCategory("healthCare");
		 assertNotNull(co);
		 assertTrue(co instanceof HealthCare);
	    }
	    
	    @Test
	    public void ItemsByCategorySportsTest() {
	    	ItemOrderFactory cof = new ItemOrderFactory();
	    	ItemOrder co = ItemOrderFactory.ItemsByCategory("Sports");
	    	assertNull(co);
	    }
	    
	    

	   
	
}
