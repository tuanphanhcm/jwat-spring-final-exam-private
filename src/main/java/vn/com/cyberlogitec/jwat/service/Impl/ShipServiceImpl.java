package vn.com.cyberlogitec.jwat.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.cyberlogitec.jwat.model.Ship;
import vn.com.cyberlogitec.jwat.repository.ShipRepository;
import vn.com.cyberlogitec.jwat.service.ShipService;

@Service
public class ShipServiceImpl implements ShipService {
	
	private final ShipRepository shipRepository;
	
	@Autowired
	public ShipServiceImpl(ShipRepository shipRepository) {
		this.shipRepository = shipRepository;
	}
	
	@Override
	public List<Ship> getAllShips() {
		// TODO Auto-generated method stub
		return shipRepository.selectAllShips();
	}

	@Override
	public Ship getShipById(String id) {
		// TODO Auto-generated method stub
		return shipRepository.selectShipById(id);
	}

}
