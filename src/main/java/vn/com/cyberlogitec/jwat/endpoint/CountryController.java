package vn.com.cyberlogitec.jwat.endpoint;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.com.cyberlogitec.jwat.model.Country;
import vn.com.cyberlogitec.jwat.model.Ship;
import vn.com.cyberlogitec.jwat.service.CountryService;

@RestController
@RequestMapping("/api/country")
public class CountryController {
	private CountryService countryService;
	
	public CountryController(CountryService countryService) {
		this.countryService = countryService;
	}
	
	@GetMapping("")
	public ResponseEntity<List<Country>> getAllCountries(){
		List<Country> results = countryService.getAllCountries();
		
		if(results.size() == 0)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		else return new ResponseEntity<List<Country>>(results,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Country> getCountryById(@PathVariable String id){
		Country result = countryService.getCountryById(id);
		
		return new ResponseEntity<Country>(result, HttpStatus.OK);
	}
	
	@PostMapping("")
	public Object insertCountry(@RequestBody Country country){
		int result = countryService.insertCountry(country);
		if(result == 1)
			return new ResponseEntity<>("Thêm thành công.", HttpStatus.OK);
		else
			return new ResponseEntity<>("Thêm thất bại.", HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("")
	public Object updateCountry(@RequestBody Country country) {
		int result = countryService.updateCountry(country);
		if(result == 1)
			return new ResponseEntity<>("Cập nhật thành công.", HttpStatus.OK);
		else
			return new ResponseEntity<>("Cập nhật thất bại.", HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/delete/{id}")
	public Object deleteCountry(@PathVariable String id) {
		int result = countryService.deleteCountry(id);
		if(result == 1)
			return new ResponseEntity<>("Xóa thành công.", HttpStatus.OK);
		else
			return new ResponseEntity<>("Xóa thất bại.", HttpStatus.BAD_REQUEST);
	}
}
