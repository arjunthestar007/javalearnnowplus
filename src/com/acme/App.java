package com.acme;

import com.acme.explovise.OrderIncendiary;
import com.acme.poisons.OrderPoison;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shipment shipment1=new OrderIncendiary("coyote", "tnt");
		Shipment shipment2=new OrderPoison("coyote", "arsenic");
		Shipment shipment3=new OrderPoison("coyote", "hydrazine");

        
		Fulfillment fulfillment=new Fulfillment();
		try {
			fulfillment.process(shipment1,shipment2,shipment3);
		} catch (FullfillmentException e) {
			System.out.println("Fullfilment error:"+e.getMessage());
		
		}
	}

}
