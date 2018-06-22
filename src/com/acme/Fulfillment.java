package com.acme;

public class Fulfillment {

	public void process(Order... orders) {

		for (Order order : orders) {
			System.out.println(order.getShippingInstructions());
			order.print();
			System.out.println();
		}

	}

}
