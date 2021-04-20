package com.csi.hibernatedemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.hibernatedemo.models.Location;
import com.csi.hibernatedemo.models.Post;
import com.csi.hibernatedemo.repositories.LocationRepository;

@Service
public class LocationService {
	@Autowired
	private LocationRepository locationRepository;

	public List<Location> findAll() {
		// TODO Auto-generated method stub
		return (List<Location>) locationRepository.findAll();
	}

	public Optional<Location> getById(Integer id) {
		// TODO Auto-generated method stub
		return locationRepository.findById(id);
	}

	public void addLocation(Location location) {
		// TODO Auto-generated method stub
		locationRepository.save(location);
	}

	public void updateLocation(Location location) {
		// TODO Auto-generated method stub
		locationRepository.save(location);
	}

	public void deleteLocation(Integer id) {
		// TODO Auto-generated method stub
		locationRepository.deleteById(id);
		
	}





}
