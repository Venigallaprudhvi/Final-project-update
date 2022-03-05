package com.ecommerce.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import com.ecommerce.factory.Apparel;
import com.ecommerce.scanner.HealthCareScanner;

public class HealthCareScannerTest {

	@Test
	public void getBuyCategoryNamesTest() {
		HealthCareScanner ascn = new HealthCareScanner();
		List<String>  cnList = ascn.getHealthCareCategoryNames();
		assertNotNull(ascn);
		assertEquals(3, cnList.size());
	}
	
	
	@Test
	public void getTransactionTypesTest() {
		HealthCareScanner ascn = new HealthCareScanner();
		List<String>  cnList = ascn.getTransactionTypes();
		assertNotNull(ascn);
		assertEquals(2, cnList.size());
	}
	
	@Test
	public void getTransactionTypeTest() {
		HealthCareScanner ascn = new HealthCareScanner();
		Scanner typeScanner = ascn.getTransactionType();
		assertNotNull(ascn);
		assertNotNull(typeScanner);
	}
	
	@Test
	public void getHealthCareSellProductsTest() {
		HealthCareScanner ascn = new HealthCareScanner();
		String type = ascn.getHealthCareSellProducts("yes");
		assertNotNull(ascn);
		assertNotNull(type);
		assertEquals("sell", type);
	}
	
	@Test
	public void getHealthCareBuyProductsTest() {
		HealthCareScanner ascn = new HealthCareScanner();
		String type = ascn.getHealthCareBuyProducts();
		assertNotNull(ascn);
		assertNotNull(type);
	}
}
