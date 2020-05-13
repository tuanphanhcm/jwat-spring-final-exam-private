package vn.com.cyberlogitec.jwat.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.com.cyberlogitec.jwat.model.Shipment;
import vn.com.cyberlogitec.jwat.service.ShipmentService;

@RestController
@RequestMapping("/api/shipment")
public class ShipmentController {
	private ShipmentService shipmentService;
	
	@Autowired
	public ShipmentController(ShipmentService shipmentService) {
		this.shipmentService = shipmentService;
	}
	
	@GetMapping("")
	public ResponseEntity<List<Shipment>> getAllShipments(){
		List<Shipment> results = shipmentService.getAllShipments();
		
		if(results.size() == 0)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		else return new ResponseEntity<List<Shipment>>(results,HttpStatus.OK);
	}
	
}
