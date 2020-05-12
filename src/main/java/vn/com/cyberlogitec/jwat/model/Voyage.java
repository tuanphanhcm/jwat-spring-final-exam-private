package vn.com.cyberlogitec.jwat.model;

import java.util.Date;

public class Voyage {
	private String voyageId;
	private String shipId;
	private String routeId;
	private Date startDate;
	private Date endDate;
	private int voyageQuantity;
	private double costPerTeq;
	public String getVoyageId() {
		return voyageId;
	}
	public void setVoyageId(String voyageId) {
		this.voyageId = voyageId;
	}
	public String getShipId() {
		return shipId;
	}
	public void setShipId(String shipId) {
		this.shipId = shipId;
	}
	public String getRouteId() {
		return routeId;
	}
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getVoyageQuantity() {
		return voyageQuantity;
	}
	public void setVoyageQuantity(int voyageQuantity) {
		this.voyageQuantity = voyageQuantity;
	}
	public double getCostPerTeq() {
		return costPerTeq;
	}
	public void setCostPerTeq(double costPerTeq) {
		this.costPerTeq = costPerTeq;
	}
	
	
}
