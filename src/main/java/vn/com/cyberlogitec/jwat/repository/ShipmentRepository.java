package vn.com.cyberlogitec.jwat.repository;

import java.util.List;

import vn.com.cyberlogitec.jwat.model.Shipment;

public interface ShipmentRepository {
	List<Shipment> getAllShipments();
	List<Shipment> getShipmentsByVoyageId(String voyageId);
	List<Shipment> getShipmentsByStatus(String status);
}
