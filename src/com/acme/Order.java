package com.acme;

public class Order {
	
	String customerId;
	String productId;
	
	public Order(String customerId, String productId) {
		super();
		this.customerId = customerId;
		this.productId = productId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getShippingInstructions(){
		return "Ship via standard freight";
	}
	
	public void print(){
		System.out.println("customer id:"+this.customerId+" product id:" +this.productId);
	}

}
