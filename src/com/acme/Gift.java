package com.acme;

public class Gift  implements Shipment{
	
	private String customerId;
	private String giftId;
	
	
	public Gift(String customerId, String giftId) {
		super();
		this.customerId = customerId;
		this.giftId = giftId;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getGiftId() {
		return giftId;
	}
	public void setGiftId(String giftId) {
		this.giftId = giftId;
	}

	@Override
	public String getShippingInstructions() {
		// TODO Auto-generated method stub
		return "delivery by  personal  courier";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "customer id : "+this.customerId +"gift id :"+this.giftId;
	}

}
