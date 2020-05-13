package vn.com.cyberlogitec.jwat.service;

import java.util.List;

import vn.com.cyberlogitec.jwat.model.Country;

public interface CountryService {
	List<Country> getAllCountries();
	Country getCountryById(String id);
	int insertCountry(Country country);
	int updateCountry(Country country);
	int deleteCountry(String id);
}
