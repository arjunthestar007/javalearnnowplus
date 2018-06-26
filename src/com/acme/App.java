package com.acme;

import java.awt.List;
import java.util.ArrayList;

import com.acme.explovise.OrderIncendiary;
import com.acme.poisons.OrderPoison;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		java.util.List<Shipment> shipments=new ArrayList<Shipment>();
		
		shipments.add(new OrderIncendiary("coyote", "tnt"));
		shipments.add(new OrderPoison("coyote", "arsenic"));
		shipments.add(new OrderPoison("coyote", "hydrazine"));

	

        
		Fulfillment fulfillment=new Fulfillment();
		try {
			fulfillment.process(shipments);
		} catch (FullfillmentException e) {
			System.out.println("Fullfilment error:"+e.getMessage());
		
		}
	}

}
