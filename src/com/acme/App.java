package com.acme;

import com.acme.explovise.OrderIncendiary;
import com.acme.poisons.OrderPoison;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order1=new OrderIncendiary("coyote", "tnt");
		Order order2=new OrderPoison("coyote", "arsenic");
		Order order3=new OrderPoison("coyote", "hydrazine");
		
		System.out.println(order1.compareTo(order2));
		System.out.println(order2.compareTo(order3));
		System.out.println(order3.compareTo(order1));
		
        
		Fulfillment fulfillment=new Fulfillment();
		try {
			fulfillment.process(order1,order2,order3);
		} catch (OrderFullfillmentException e) {
			System.out.println("Fullfilment error:"+e.getMessage());
		
		}
	}

}
