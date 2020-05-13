package vn.com.cyberlogitec.jwat.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.cyberlogitec.jwat.model.Voyage;
import vn.com.cyberlogitec.jwat.model.dto.VoyageShipmentDto;
import vn.com.cyberlogitec.jwat.repository.VoyageRepository;
import vn.com.cyberlogitec.jwat.service.VoyageService;

@Service
public class VoyageServiceImpl implements VoyageService {
	
	private final VoyageRepository voyageRepository;

	@Autowired
	public VoyageServiceImpl(VoyageRepository voyageRepository) {
		this.voyageRepository = voyageRepository;
	}
	
	@Override
	public List<Voyage> getAllVoyages() {
		// TODO Auto-generated method stub
		return voyageRepository.selectAllVoyages();
	}

	@Override
	public Voyage getVoyageById(String id) {
		// TODO Auto-generated method stub
		return voyageRepository.getVoyageById(id);
	}

	@Override
	public List<VoyageShipmentDto> getFullyDataVoyages() {
		// TODO Auto-generated method stub
		return voyageRepository.selectFullyDataVoyages();
	}

}
