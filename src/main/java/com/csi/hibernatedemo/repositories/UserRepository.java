package com.csi.hibernatedemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csi.hibernatedemo.models.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
	List<User>findByLocationId(Integer id);

}
