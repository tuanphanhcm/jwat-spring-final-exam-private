package vn.com.cyberlogitec.jwat.service;

import java.util.List;

import vn.com.cyberlogitec.jwat.model.Ship;

public interface ShipService {
	List<Ship> getAllShips();
	Ship getShipById(String id);
}
