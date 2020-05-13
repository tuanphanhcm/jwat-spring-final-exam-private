package vn.com.cyberlogitec.jwat.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.cyberlogitec.jwat.model.Country;
import vn.com.cyberlogitec.jwat.repository.CountryRepository;
import vn.com.cyberlogitec.jwat.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {
	private CountryRepository countryRepository;
	
	@Autowired
	public CountryServiceImpl(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}
	
	@Override
	public List<Country> getAllCountries() {
		// TODO Auto-generated method stub
		return countryRepository.getAllCountries();
	}

	@Override
	public Country getCountryById(String id) {
		// TODO Auto-generated method stub
		return countryRepository.getCountryById(id);
	}

	@Override
	public int insertCountry(Country country) {
		// TODO Auto-generated method stub
		return countryRepository.insertCountry(country);
	}

	@Override
	public int deleteCountry(String id) {
		Country existedCountry = countryRepository.getCountryById(id);
		if (existedCountry == null)
			return 0;
		return countryRepository.deleteCountry(id);
	}

	@Override
	public int updateCountry(Country country) {
		// TODO Auto-generated method stub
		return countryRepository.updateCountry(country);
	}

}
