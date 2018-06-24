package com.acme;

import com.acme.explovise.OrderIncendiary;
import com.acme.poisons.OrderPoison;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order1=new OrderIncendiary("coyote", "tnt");
		Order order2=new OrderPoison("coyote", "arsenic");
		Order order3=new OrderPoison("coyote", "hydrazine");
        
		Fulfillment fulfillment=new Fulfillment();
		fulfillment.process(order1,order2,order3);
		
		Order order4=new Order("roadrunner", "love");
        Order order5=new Order("roadrunner", "love");
        
        // override equals and hashcode in the class and check equals
        
        System.out.println("(order4==order5) :"+(order4==order5));
        System.out.println("(order4==order5) :"+(order4.equals(order5)));
        System.out.println("order4.hashCode() :"+order4.hashCode());
        System.out.println("order5.hashCode() "+order5.hashCode());

	}

}
