package vn.com.cyberlogitec.jwat.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.com.cyberlogitec.jwat.model.Ship;
import vn.com.cyberlogitec.jwat.model.Voyage;
import vn.com.cyberlogitec.jwat.service.ShipService;
import vn.com.cyberlogitec.jwat.service.VoyageService;

@RestController
@RequestMapping("/api/endpoint")
public class EndPoint {
	private final ShipService shipService;
	private final VoyageService voyageService;
	
	@Autowired
	public EndPoint(ShipService shipService, VoyageService voyageService) {
		this.shipService = shipService;
		this.voyageService = voyageService;
	}
	
	@GetMapping("")
	public ResponseEntity<String> welcomeEndpoint() {
		return new ResponseEntity<String>("Welcome to JWAT Spring Final Exam.",HttpStatus.OK);
	}
	
	@GetMapping("/ships")
	public ResponseEntity<List<Ship>> getAllShips(){
		List<Ship> results = shipService.getAllShips();
		
		if(results.size() == 0)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		else return new ResponseEntity<List<Ship>>(results,HttpStatus.OK);
	}
	
	@GetMapping("/ship/{id}")
	public ResponseEntity<Ship> getShipById(String id){
		Ship result = shipService.getShipById(id);
		if(result == null)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		else return new ResponseEntity<Ship>(result, HttpStatus.OK);
	}
	
	@GetMapping("/voyage")
	public ResponseEntity<List<Voyage>> getAllVoyages(){
		List<Voyage> results = voyageService.getAllVoyages();
		
		if(results.size() == 0)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		else return new ResponseEntity<List<Voyage>>(results,HttpStatus.OK);
	}
}