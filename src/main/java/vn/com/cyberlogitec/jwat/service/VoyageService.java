package vn.com.cyberlogitec.jwat.service;

import java.util.List;

import vn.com.cyberlogitec.jwat.model.Voyage;
import vn.com.cyberlogitec.jwat.model.dto.VoyageShipmentDto;

public interface VoyageService {
	List<Voyage> getAllVoyages();
	Voyage getVoyageById(String id);
	List<VoyageShipmentDto> getFullyDataVoyages();
}
