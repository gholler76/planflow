package com.holler.planflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.holler.planflow.models.Location;
import com.holler.planflow.models.Pallet;
import com.holler.planflow.repos.LocationRepo;

@Service
public class LocationService {
	private final LocationRepo locationRepo;

	public LocationService(LocationRepo locationRepo) {
		this.locationRepo = locationRepo;
	}

	// generate span of rack locations given inputs by user
	public String generateLocation(Integer startRack, Integer rackCount, Integer xcoors, Integer ycoors) {
		String rack = "";
		String xcoor = "";
		String ycoor = "";
		// very inefficient triple for-loop for creating locations, just for the demo :)
		for (Integer r = 1; r <= rackCount; r++) {
			rack = String.format("%03d", startRack + r);
			for (Integer x = 1; x <= xcoors; x++) {
				xcoor = String.format("%03d", x);
				for (Integer y = 1; y <= ycoors; y++) {
					ycoor = String.format("%03d", y);

					Location l = new Location();
					l.setRack(rack);
					l.setXcoor(xcoor);
					l.setYcoor(ycoor);
					locationRepo.save(l);
				}
			}
		}
		return "Locations created";
	}

	public List<Location> getAllLocations() {
		return (List<Location>) locationRepo.findAll();
	}

	public void deleteAllLocations() {
		locationRepo.deleteAll();
	}

	// select a random location to place the pallet in
	public Location findRandomStorageLocation() {
		Long id = locationRepo.findRandomLocId();

		Optional<Location> l = locationRepo.findById(id);

		if (l.isPresent()) {
			return l.get();

		}
		return null;
	}

}
