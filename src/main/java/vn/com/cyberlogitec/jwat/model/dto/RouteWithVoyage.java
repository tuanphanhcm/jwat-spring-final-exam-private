package vn.com.cyberlogitec.jwat.model.dto;

import java.util.List;

import vn.com.cyberlogitec.jwat.model.Route;
import vn.com.cyberlogitec.jwat.model.Voyage;

public class RouteWithVoyage extends Route {
	private List<Voyage> voyages;

	public List<Voyage> getVoyages() {
		return voyages;
	}

	public void setVoyages(List<Voyage> voyages) {
		this.voyages = voyages;
	}
	
}
