package com.csi.hibernatedemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csi.hibernatedemo.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer>{

}
