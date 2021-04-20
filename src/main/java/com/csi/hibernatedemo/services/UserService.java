package com.csi.hibernatedemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.hibernatedemo.models.User;
import com.csi.hibernatedemo.repositories.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}

	public Optional<User> getUserById(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	public List<User> findByLocationId(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findByLocationId(id);
	}

	public void insertUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}


}
