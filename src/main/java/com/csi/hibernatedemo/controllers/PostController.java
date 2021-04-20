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
import com.csi.hibernatedemo.services.PostService;

@RestController
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping("/posts")
	public List<Post>getAllPosts(){
		return postService.findAll();
	}
	
	@GetMapping("/posts/{id}")
	public Optional<Post> getPostById(@PathVariable Integer id) {
		return postService.findById(id);
	}
	@GetMapping("/posts/user/{id}/posts")
	public List<Post>getPostsByUserId(@PathVariable Integer id){
		return postService.findByUserId(id);
	}
	@PostMapping("/posts/addnew")
	public void insertPost(@RequestBody Post post) {
		postService.insertPost(post);
	}
	@PutMapping("/posts/{id}/update")
	public void updatePost(@RequestBody Post post) {
		postService.updatePost(post);
	}
	@DeleteMapping("/posts/{id}/delete")
	public void deletePost(@PathVariable Integer id) {
		postService.deletePost(id);
	}
}
