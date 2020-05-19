package vn.com.cyberlogitec.jwat.endpoint;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
