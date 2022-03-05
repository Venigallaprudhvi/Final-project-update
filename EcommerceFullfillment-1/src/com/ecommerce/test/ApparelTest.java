package com.ecommerce.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ecommerce.factory.Apparel;

public class ApparelTest {

	@Test
	public void createOrderYesTest() {
		Apparel a = new Apparel();
		a.createOrder("Yes");
		assertNotNull(a);
	}
	
	@Test
	public void createOrderNoTest() {
		Apparel a = new Apparel();
		a.createOrder("No");
		assertNotNull(a);
	}
}
