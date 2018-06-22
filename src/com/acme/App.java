package com.acme;

import com.acme.explovise.OrderIncendiary;
import com.acme.poisons.OrderPoison;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order1=new OrderIncendiary("arun", "tnt");
		Order order2=new OrderPoison("aravind", "arsenic");
		Order order3=new Order("rakesh", "stuff");

		Fulfillment fulfillment=new Fulfillment();
		fulfillment.process(order1,order2,order3);

	}

}
