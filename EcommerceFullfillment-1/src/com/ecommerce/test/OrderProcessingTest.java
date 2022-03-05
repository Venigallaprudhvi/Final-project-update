package com.ecommerce.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ecommerce.factory.Apparel;
import com.ecommerce.template.OrderProcessing;

public class OrderProcessingTest {

	@Test
	public void inventoryYesTest() {
		OrderProcessing op = new OrderProcessing();
		boolean selected = op.inventory("Yes");
		assertNotNull(op);
		assertEquals(true, selected);
	}
	
	@Test
	public void inventoryNoTest() {
		OrderProcessing op = new OrderProcessing();
		boolean selected = op.inventory("No");
		assertNotNull(op);
		assertEquals(false, selected);
	}
	
	@Test
	public void pickingTest() {
		OrderProcessing op = new OrderProcessing();
		op.picking();
		assertNotNull(op);
	}
	
	@Test
	public void packingTest() {
		OrderProcessing op = new OrderProcessing();
		op.packing();
		assertNotNull(op);
	}
	
	@Test
	public void shippingTest() {
		OrderProcessing op = new OrderProcessing();
		op.shipping("sell");
		assertNotNull(op);
		
		OrderProcessing op1 = new OrderProcessing();
		op1.shipping("Buy");
		assertNotNull(op1);
	}
	
	@Test
	public void deliveryTest() {
		OrderProcessing op = new OrderProcessing();
		op.delivery("sell");
		assertNotNull(op);
		
		OrderProcessing op1 = new OrderProcessing();
		op1.delivery("Buy");
		assertNotNull(op1);
	}
	
	@Test
	public void itemNotAvailableTest() {
		OrderProcessing op = new OrderProcessing();
		op.itemNotAvailable("sell");
		assertNotNull(op);
		
		OrderProcessing op1 = new OrderProcessing();
		op1.itemNotAvailable("Buy");
		assertNotNull(op1);
	}
}
