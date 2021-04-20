package com.csi.hibernatedemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.hibernatedemo.models.Post;
import com.csi.hibernatedemo.repositories.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;

	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return (List<Post>) postRepository.findAll();
	}

	

	public Optional<Post> findById(Integer id) {
		// TODO Auto-generated method stub
		return postRepository.findById(id);
	}



	public List<Post> findByUserId(Integer id) {
		// TODO Auto-generated method stub
		return postRepository.findByUserId(id);
	}



	public void insertPost(Post post) {
		// TODO Auto-generated method stub
		postRepository.save(post);
	}



	public void updatePost(Post post) {
		// TODO Auto-generated method stub
		postRepository.save(post);
	}



	public void deletePost(Integer id) {
		// TODO Auto-generated method stub
		postRepository.deleteById(id);
	}


}
