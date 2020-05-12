package vn.com.cyberlogitec.jwat.model.dto;

import java.util.List;

import vn.com.cyberlogitec.jwat.model.Shipment;
import vn.com.cyberlogitec.jwat.model.Voyage;

public class VoyageShipmentDto {
	private String voyageId;
	private String shipId;
	private String shipName;
	private String routeId;
	private String routeName;
	private String sourcePortName;
	private String destPortName;
	private String startDate;
	private String endDate;
	private String voyageQuantity;
	private String costPerTeq;
	private List<Shipment> shipments;
	
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
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public String getRouteId() {
		return routeId;
	}
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public String getSourcePortName() {
		return sourcePortName;
	}
	public void setSourcePortName(String sourcePortName) {
		this.sourcePortName = sourcePortName;
	}
	public String getDestPortName() {
		return destPortName;
	}
	public void setDestPortName(String destPortName) {
		this.destPortName = destPortName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getVoyageQuantity() {
		return voyageQuantity;
	}
	public void setVoyageQuantity(String voyageQuantity) {
		this.voyageQuantity = voyageQuantity;
	}
	public String getCostPerTeq() {
		return costPerTeq;
	}
	public void setCostPerTeq(String costPerTeq) {
		this.costPerTeq = costPerTeq;
	}
	public List<Shipment> getShipments() {
		return shipments;
	}
	public void setShipments(List<Shipment> shipments) {
		this.shipments = shipments;
	}
}
