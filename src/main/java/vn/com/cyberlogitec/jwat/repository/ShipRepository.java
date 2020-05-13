package vn.com.cyberlogitec.jwat.repository;

import java.util.List;

import vn.com.cyberlogitec.jwat.model.Ship;

public interface ShipRepository {
	
	List<Ship> selectAllShips();
	Ship selectShipById(String id);
	Ship insertShip(Ship ship);
	
}
