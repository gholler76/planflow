package com.holler.planflow.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.holler.planflow.models.Location;
import com.holler.planflow.models.Pallet;
import com.holler.planflow.services.LocationService;
import com.holler.planflow.services.PalletService;

@Controller
public class MainController {
	private final PalletService palletService;
	private final LocationService locationService;

	public MainController(PalletService palletService, LocationService locationService) {
		this.palletService = palletService;
		this.locationService = locationService;
	}

	// home test screen
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pallets", palletService.getAllPallets());
		model.addAttribute("locations", locationService.getAllLocations());
		List<Location> locs = locationService.getAllLocations();
		return "home.jsp";
	}

	// basic redirect for creation posts
	@GetMapping("/success")
	public String success() {
		return "redirect:/";
	}

	// pallet generator
	@PostMapping("/pallets")
	public String makePallets(@RequestParam(value = "qty") Integer qty) {
		palletService.generatePallet(qty);
		return "redirect:/success";
	}

	// location generator
	@PostMapping("/locations")
	public String makeLocations(@RequestParam(value = "startRack") Integer startRack,
			@RequestParam(value = "rackCount") Integer rackCount, @RequestParam(value = "xcoors") Integer xcoors,
			@RequestParam(value = "ycoors") Integer ycoors) {
		locationService.generateLocation(startRack, rackCount, xcoors, ycoors);
		return "redirect:/success";
	}

	// delete all pallets
	@PostMapping("/deleteP")
	public String delPals() {
		palletService.deleteAllPallets();
		return "redirect:/success";
	}

	// delete all locations
	@PostMapping("/deleteL")
	public String delLocs() {
		locationService.deleteAllLocations();
		return "redirect:/success";
	}

	// store pallets
	@PostMapping("/move")
	public String findRandPal() {
		Pallet p = palletService.findRandomPallet();
		Location l = locationService.findRandomStorageLocation();

		palletService.storePallet(p, l);

		return "redirect:/success";
	}

	// ship pallets
	@PostMapping("/ship")
	public String shipPallets() {
		palletService.shipPallets();

		return "redirect:/success";
	}

	// page nav
	@GetMapping("/assumptions")
	public String assumptions() {

		return "assumptions.jsp";
	}

	@GetMapping("/opsvariables")
	public String opsvariables() {

		return "opsvariables.jsp";
	}

	@GetMapping("/planningtools")
	public String planningtools() {

		return "planningtools.jsp";
	}

	@GetMapping("/layout")
	public String layout() {

		return "layout.jsp";
	}

	@GetMapping("/reportdata")
	public String reportdata() {

		return "reportdata.jsp";
	}

	@GetMapping("/erd")
	public String erd() {

		return "erd.jsp";
	}

}
