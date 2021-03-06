package com.holler.planflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.holler.planflow.models.Location;
import com.holler.planflow.models.Pallet;
import com.holler.planflow.repos.PalletRepo;

@Service
public class PalletService {
	private final PalletRepo palletRepo;

	public PalletService(PalletRepo palletRepo) {
		this.palletRepo = palletRepo;
	}

	// generate a pallet using current time milli as the ID
	public String generatePallet(Integer qty) {
		for (Integer i = 1; i <= qty; i++) {
			Pallet p = new Pallet();
			Long palletid = System.currentTimeMillis();
			p.setPalletid(palletid);
			p.setPtype("PA");
			palletRepo.save(p);
		}
		return "Pallet created";
	}

	public List<Pallet> getAllPallets() {
		return (List<Pallet>) palletRepo.findAll();
	}

	public void deleteAllPallets() {
		palletRepo.deleteAll();
	}

	// select random pallet to be put away
	public Pallet findRandomPallet() {
		Long id = palletRepo.findRandomPalletId();

		Optional<Pallet> p = palletRepo.findById(id);

		if (p.isPresent()) {
			return p.get();
		}
		return null;
	}

	// perform putaway function on pallet by selecting a random location
	public Pallet storePallet(Pallet p, Location l) {
		p.getLocation();
		p.setLocation(l);
		return palletRepo.save(p);
	}

	public void shipPallets() {
		palletRepo.deleteStoredPallets();
	}

}
