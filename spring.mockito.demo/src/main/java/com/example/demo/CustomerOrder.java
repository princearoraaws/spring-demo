package com.example.demo;

public class CustomerOrder {

	String ID;
	String purchaseOrderNumber;
	String status;
	
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}
	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "CustomerOrder [" + (ID != null ? "ID=" + ID + ", " : "")
				+ (purchaseOrderNumber != null ? "purchaseOrderNumber=" + purchaseOrderNumber + ", " : "")
				+ (status != null ? "status=" + status : "") + "]";
	}
	
	
	
}
