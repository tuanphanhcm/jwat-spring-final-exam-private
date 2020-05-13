package vn.com.cyberlogitec.jwat.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.cyberlogitec.jwat.model.Shipment;
import vn.com.cyberlogitec.jwat.repository.ShipmentRepository;
import vn.com.cyberlogitec.jwat.service.ShipmentService;

@Service
public class ShipmentServiceImpl implements ShipmentService {
	private final ShipmentRepository shipmentRepository;
	
	@Autowired
	public ShipmentServiceImpl(ShipmentRepository shipmentRepository) {
		this.shipmentRepository = shipmentRepository;
	}

	@Override
	public List<Shipment> getAllShipments() {
		// TODO Auto-generated method stub
		return shipmentRepository.getAllShipments();
	}

	@Override
	public List<Shipment> getShipmentsByVoyageId(String voyageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Shipment> getShipmentsByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

}
