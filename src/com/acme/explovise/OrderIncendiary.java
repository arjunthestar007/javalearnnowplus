package com.acme.explovise;

import com.acme.Order;

public class OrderIncendiary extends Order{

	public OrderIncendiary(String customerId, String productId) {
		super(customerId, productId);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getSpecialShippingAddress() {
		
		return "add special instructions for incedendary";
	}

}
