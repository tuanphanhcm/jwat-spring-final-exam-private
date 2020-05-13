package vn.com.cyberlogitec.jwat.service;

import java.util.List;

import vn.com.cyberlogitec.jwat.model.Shipment;

public interface ShipmentService {
	List<Shipment> getAllShipments();
	List<Shipment> getShipmentsByVoyageId(String voyageId);
	List<Shipment> getShipmentsByStatus(String status);
}
