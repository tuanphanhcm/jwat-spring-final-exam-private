package vn.com.cyberlogitec.jwat.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.com.cyberlogitec.jwat.model.Ship;
import vn.com.cyberlogitec.jwat.model.Shipment;
import vn.com.cyberlogitec.jwat.model.Voyage;
import vn.com.cyberlogitec.jwat.model.dto.VoyageShipmentDto;
import vn.com.cyberlogitec.jwat.service.ShipService;
import vn.com.cyberlogitec.jwat.service.ShipmentService;
import vn.com.cyberlogitec.jwat.service.VoyageService;

@RestController
@RequestMapping("/api/endpoint")
public class EndPoint {
	
	@GetMapping("")
	public ResponseEntity<String> welcomeEndpoint() {
		return new ResponseEntity<String>("Welcome to JWAT Spring Final Exam.",HttpStatus.OK);
	}

	@GetMapping("/{name}")
	public ResponseEntity<String> welcomeYou(@PathVariable String name) {
		return new ResponseEntity<String>("Welcome " + name + " to JWAT Spring Final Exam.",HttpStatus.OK);
	}
}
