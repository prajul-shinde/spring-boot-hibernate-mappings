package com.csi.hibernatedemo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.csi.hibernatedemo.models.Location;
import com.csi.hibernatedemo.models.User;
import com.csi.hibernatedemo.services.LocationService;

@RestController
public class LocationController {

	@Autowired
	private LocationService locationService;

	@GetMapping("/locations")
	public List<Location> getAllLocations() {
		return locationService.findAll();
	}

	@GetMapping("/locations/{id}")
	public Optional<Location> getLocationById(@PathVariable Integer id) {
		return locationService.getById(id);
	}

	@GetMapping("/location/{id}/users")
	public List<User> getUsersByLocation(@PathVariable Integer id) {
		Optional<Location> location = locationService.getById(id);
		if (location.isPresent()) {
			return location.get().getUsers();
		} else {
			return null;
		}
	}
	@PostMapping("/locations/addnew")
	public void addLocation(@RequestBody Location location) {
		locationService.addLocation(location);
	}
	@PutMapping("/locations/{id}/update")
	public void updateLocation(@RequestBody Location location) {
		locationService.updateLocation(location);
	}
	@DeleteMapping("/locations/{id}/delete")
	public void deleteLocation(@PathVariable Integer id) {
		locationService.deleteLocation(id);
	}
}
