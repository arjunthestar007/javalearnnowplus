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
	
	// cannot be changeable in subclass
	public final String getShippingInstructions(){
		String shipping="Ship via standard freight ";
		
		if("coyote".equals(this.customerId)){
			shipping="ship via expedited freight";
		}
		if("tnt".equals(this.productId)){
			shipping+="\n notify authorites";
		}
		
		return shipping+"\nSpecial shipping : "+getSpecialShippingAddress();
	}
	
	// can changeable in subclass
	protected String getSpecialShippingAddress() {
		return "";
	}
	public void print(){
		System.out.println("customer id:"+this.customerId+" product id:" +this.productId);
	}

}
