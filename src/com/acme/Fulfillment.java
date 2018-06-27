package com.acme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fulfillment {

	public void process(List<Shipment> shipments) throws FullfillmentException{

		for (Shipment order : shipments) {
			if("".equals(order.getCustomerId())){
				throw new FullfillmentException("Cannot ship without customer id");	
			}	
		}
		
		
		List<Shipment> shipmentForAuthorities=new ArrayList<Shipment>();
		
		for (Iterator<Shipment> iterator = shipments.iterator(); iterator.hasNext();) {
			Shipment shipment = (Shipment) iterator.next();
			if(shipment.getShippingInstructions().contains("notify authorites")){
				iterator.remove();
				shipmentForAuthorities.add(shipment);
			}
			
		}
		
		for (Shipment shipment : shipmentForAuthorities) {
			processShipment("pending authority", shipment);
		}
		
		
		for (Shipment shipment : shipments) {
			processShipment("regular",shipment);
		}


	}

	private void processShipment(String processname,Shipment shipment) {
		System.out.println("---------"+processname);
		System.out.println(shipment.getShippingInstructions());
		System.out.println(shipment);
		System.out.println();
	}

}
