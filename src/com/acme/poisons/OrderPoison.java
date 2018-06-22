package com.acme.poisons;

import com.acme.Order;

public class OrderPoison extends Order {

	public OrderPoison(String customerId, String productId) {
		super(customerId, productId);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String getShippingInstructions() {
		// TODO Auto-generated method stub
		return "add special instructions for poison";
	}

}
