package vn.com.cyberlogitec.jwat.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.com.cyberlogitec.jwat.model.Voyage;
import vn.com.cyberlogitec.jwat.model.dto.VoyageShipmentDto;
import vn.com.cyberlogitec.jwat.service.VoyageService;

@RestController
@RequestMapping("/api/voyage")
public class VoyageController {

	private final VoyageService voyageService;
	
	@Autowired
	public VoyageController(VoyageService voyageService) {
		this.voyageService = voyageService;
	}
	
	@GetMapping("")
	public ResponseEntity<List<Voyage>> getAllVoyages(){
		List<Voyage> results = voyageService.getAllVoyages();
		
		if(results.size() == 0)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		else return new ResponseEntity<List<Voyage>>(results,HttpStatus.OK);
	}
	
	@GetMapping("/details")
	public ResponseEntity<List<VoyageShipmentDto>> getFullDataVoyage(){
		List<VoyageShipmentDto> results = voyageService.getFullyDataVoyages();
		
		if(results.size() == 0)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		else return new ResponseEntity<List<VoyageShipmentDto>>(results,HttpStatus.OK);
	}
}
