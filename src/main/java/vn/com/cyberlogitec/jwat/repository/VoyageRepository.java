package vn.com.cyberlogitec.jwat.repository;

import java.util.List;

import vn.com.cyberlogitec.jwat.model.Voyage;

public interface VoyageRepository {
	List<Voyage> selectAllVoyages();
	Voyage getVoyageById(String id);
}
