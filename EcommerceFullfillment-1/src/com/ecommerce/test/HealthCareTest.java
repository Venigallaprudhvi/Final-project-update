package com.ecommerce.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ecommerce.factory.HealthCare;

public class HealthCareTest {

	@Test
	public void createOrderYesTest() {
		HealthCare hc = new HealthCare();
		hc.createOrder("Yes");
		assertNotNull(hc);
	}
	
	@Test
	public void createOrderNoTest() {
		HealthCare hc = new HealthCare();
		hc.createOrder("No");
		assertNotNull(hc);
	}
}
