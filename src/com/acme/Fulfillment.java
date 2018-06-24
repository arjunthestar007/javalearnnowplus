package com.acme;

public class Fulfillment {

	public void process(Order... orders) {

		for (Order order : orders) {
			System.out.println(order.getShippingInstructions());
			System.out.println(order);
			System.out.println();
		}

	}

}
