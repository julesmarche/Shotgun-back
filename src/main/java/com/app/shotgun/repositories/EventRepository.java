package com.app.shotgun.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.data.Event;



@Repository
public interface EventRepository extends CrudRepository<Event, Integer>  {

}
