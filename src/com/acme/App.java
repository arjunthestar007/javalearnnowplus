package com.acme;

import com.acme.explovise.OrderIncendiary;
import com.acme.poisons.OrderPoison;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order1=new OrderIncendiary("coyote", "tnt");
		Order order2=new OrderPoison("coyote", "arsenic");
		Order order3=new OrderPoison("coyote", "hydrazine");

		Order order4=new Order("roadrunner", "love");

		Fulfillment fulfillment=new Fulfillment();
		fulfillment.process(order1,order2,order3);

	}

}
