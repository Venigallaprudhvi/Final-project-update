package com.ecommerce.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ecommerce.command.SellItems;

public class SellItemsTest {

	@Test
	public void executeApparelYesTest() {
		SellItems si = new SellItems();
		si.execute("Apparel","Yes");
		assertNotNull(si);
	}
	
	@Test
	public void testHealthCareYesExecute() {
		SellItems si = new SellItems();
		si.execute("HealthCare","Yes");
		assertNotNull(si);
	}
}
