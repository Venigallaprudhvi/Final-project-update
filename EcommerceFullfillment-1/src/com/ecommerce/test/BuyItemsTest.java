package com.ecommerce.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ecommerce.command.BuyItems;

public class BuyItemsTest {

	@Test
	public void executeApparelYesTest() {
		BuyItems bi = new BuyItems();
		bi.execute("Apparel","Yes");
		assertNotNull(bi);
	}
	
	@Test
	public void testHealthCareYesExecute() {
		BuyItems bi = new BuyItems();
		bi.execute("HealthCare","Yes");
		assertNotNull(bi);
	}
}
