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

import com.csi.hibernatedemo.models.Post;
import com.csi.hibernatedemo.models.User;
import com.csi.hibernatedemo.services.UserService;


@RestController
public class UserController {
	@Autowired
	private UserService userService;
	

	@GetMapping("/users")
	public List<User>getAllUsers(){
		return userService.getAllUsers();
		
	}
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable Integer id) {
		
		return userService.getUserById(id);
		
	}
	@GetMapping("/user/{id}/posts")
	public List<Post>getPostsByUser(@PathVariable Integer id){
		Optional<User> user=userService.getUserById(id);
		if(user.isPresent()) {
			return user.get().getPosts();
		}
		else {
			return null;
		}
		
	}
	@GetMapping("/users/location/{id}/users")
	public List<User>getUsersByLocation(@PathVariable Integer id){
		return userService.findByLocationId(id);
	}

	@PostMapping("/users/addnew")
	public void insertUser(@RequestBody User user) {
		userService.insertUser(user);
	}
	@PutMapping("/users/{id}/update")
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
	@DeleteMapping("/users/{id}/delete")
	public void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
	}
}
