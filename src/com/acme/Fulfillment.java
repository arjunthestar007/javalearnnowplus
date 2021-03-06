package com.acme;

public class Fulfillment {

	public void process(Shipment... shipments) throws FullfillmentException{

		for (Shipment order : shipments) {
			if("".equals(order.getCustomerId())){
				throw new FullfillmentException("Cannot ship without customer id");	
			}	
		}
		
		for (Shipment shipment : shipments) {
			System.out.println(shipment.getShippingInstructions());
			System.out.println(shipment);
			System.out.println();
		}


	}

}
