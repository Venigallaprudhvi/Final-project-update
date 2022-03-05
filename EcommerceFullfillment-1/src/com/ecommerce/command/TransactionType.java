package com.ecommerce.command;

public interface TransactionType {

	public void execute(String category, String itemAvailability);
	
}
