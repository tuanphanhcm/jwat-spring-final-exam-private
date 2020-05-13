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
import vn.com.cyberlogitec.jwat.service.ShipService;

@RestController
@RequestMapping("/api/ship")
public class ShipController {
	private ShipService shipService;
	
	@Autowired
	public ShipController(ShipService shipService) {
		this.shipService = shipService;
	}
	
	@GetMapping("")
	public ResponseEntity<List<Ship>> getAllShips(){
		List<Ship> results = shipService.getAllShips();
		
		if(results.size() == 0)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		else return new ResponseEntity<List<Ship>>(results,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Ship> getShipById(@PathVariable String id){
		Ship result = shipService.getShipById(id);
		if(result == null)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		else return new ResponseEntity<Ship>(result, HttpStatus.OK);
	}
}
