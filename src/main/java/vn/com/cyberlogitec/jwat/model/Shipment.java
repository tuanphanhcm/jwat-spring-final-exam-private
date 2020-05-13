package vn.com.cyberlogitec.jwat.model;

import java.util.Date;

public class Shipment {
	private String shipmentId;
	private String cargoContent;
	private int teqQuantity;
	private double totalCost;
	private Date shipRequestDate;
	private Date needByDate;
	private String status;
	private String insuranceFlag;
	private String insuranceAmount;
	
	public String getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}
	public String getCargoContent() {
		return cargoContent;
	}
	public void setCargoContent(String cargoContent) {
		this.cargoContent = cargoContent;
	}
	public int getTeqQuantity() {
		return teqQuantity;
	}
	public void setTeqQuantity(int teqQuantity) {
		this.teqQuantity = teqQuantity;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public Date getShipRequestDate() {
		return shipRequestDate;
	}
	public void setShipRequestDate(Date shipRequestDate) {
		this.shipRequestDate = shipRequestDate;
	}
	public Date getNeedByDate() {
		return needByDate;
	}
	public void setNeedByDate(Date needByDate) {
		this.needByDate = needByDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInsuranceFlag() {
		return insuranceFlag;
	}
	public void setInsuranceFlag(String insuranceFlag) {
		this.insuranceFlag = insuranceFlag;
	}
	public String getInsuranceAmount() {
		return insuranceAmount;
	}
	public void setInsuranceAmount(String insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}
	
	
}
