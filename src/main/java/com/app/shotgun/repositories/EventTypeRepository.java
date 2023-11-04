package com.app.shotgun.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.data.EventType;



@Repository
public interface EventTypeRepository extends CrudRepository<EventType, Integer>  {

}
