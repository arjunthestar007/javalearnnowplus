package com.acme;

public class Fulfillment {

	public void process(Order... orders) throws OrderFullfillmentException{

		for (Order order : orders) {
			if("".equals(order.getCustomerId())){
				throw new OrderFullfillmentException("Cannot ship without customer id");	
			}	
		}
		
		for (Order order : orders) {
			System.out.println(order.getShippingInstructions());
			System.out.println(order);
			System.out.println();
		}


	}

}
