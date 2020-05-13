package vn.com.cyberlogitec.jwat.repository;

import java.util.List;

import vn.com.cyberlogitec.jwat.model.Voyage;
import vn.com.cyberlogitec.jwat.model.dto.VoyageShipmentDto;

public interface VoyageRepository {
	List<Voyage> selectAllVoyages();
	Voyage getVoyageById(String id);
	List<VoyageShipmentDto> selectFullyDataVoyages();
}
