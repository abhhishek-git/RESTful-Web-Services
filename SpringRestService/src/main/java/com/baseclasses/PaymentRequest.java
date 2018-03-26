package com.baseclasses;

//Payment request class which should be submitted by clients on 
//each payment request
public class PaymentRequest {
	private int userId;
	private String itemId;
	private double discont;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public double getDiscont() {
		return discont;
	}
	public void setDiscont(double discont) {
		this.discont = discont;
	}
	
}
