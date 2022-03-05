package com.ecommerce.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import com.ecommerce.factory.Apparel;
import com.ecommerce.scanner.ApparelScanner;

public class ApparelScannerTest {

	@Test
	public void getBuyCategoryNamesTest() {
		ApparelScanner ascn = new ApparelScanner();
		List<String>  cnList = ascn.getBuyCategoryNames();
		assertNotNull(ascn);
		assertEquals(3, cnList.size());
	}
	
	@Test
	public void getSellCategoryNamesTest() {
		ApparelScanner ascn = new ApparelScanner();
		List<String>  cnList = ascn.getSellCategoryNames();
		assertNotNull(ascn);
		assertEquals(3, cnList.size());
	}
	
	@Test
	public void getTransactionTypesTest() {
		ApparelScanner ascn = new ApparelScanner();
		List<String>  cnList = ascn.getTransactionTypes();
		assertNotNull(ascn);
		assertEquals(2, cnList.size());
	}
	
	@Test
	public void getTransactionTypeTest() {
		ApparelScanner ascn = new ApparelScanner();
		Scanner typeScanner = ascn.getTransactionType();
		assertNotNull(ascn);
		assertNotNull(typeScanner);
	}
	
	@Test
	public void getSellApparelTest() {
		ApparelScanner ascn = new ApparelScanner();
		String type = ascn.getSellApparel("yes");
		assertNotNull(ascn);
		assertNotNull(type);
		assertEquals("sell", type);
	}
	
	@Test
	public void getBuyApparelTest() {
		ApparelScanner ascn = new ApparelScanner();
		String type = ascn.getBuyApparel();
		assertNotNull(ascn);
		assertNotNull(type);
	}
}
