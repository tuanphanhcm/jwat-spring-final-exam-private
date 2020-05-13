package vn.com.cyberlogitec.jwat.repository;

import java.util.List;

import vn.com.cyberlogitec.jwat.model.Country;

public interface CountryRepository {
	List<Country> getAllCountries();
	Country getCountryById(String id);
	int insertCountry(Country country);
	int updateCountry(Country country);
	int deleteCountry(String id);
}
