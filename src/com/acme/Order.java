package com.acme;

public abstract class Order implements Comparable<Order>{
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
	
	// at the time of design dont know how to implement.it may be diff in subclass
	abstract protected String getSpecialShippingAddress();
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "customer id:"+this.customerId+" product id:" +this.productId;

	}


	@Override
	public int compareTo(Order order) {
		return getProductId().compareTo(order.getProductId());
	}
	


}
