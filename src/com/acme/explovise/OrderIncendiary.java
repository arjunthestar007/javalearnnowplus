package com.acme.explovise;

import com.acme.Order;

public class OrderIncendiary extends Order{

	public OrderIncendiary(String customerId, String productId) {
		super(customerId, productId);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getShippingInstructions() {
		// TODO Auto-generated method stub
		return super.getShippingInstructions()
				+"\nadd special incendiary instructiions";
	}

}
