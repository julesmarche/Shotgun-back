package com.app.shotgun.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.data.ReservationType;



@Repository
public interface ReservationTypeRepository extends CrudRepository<ReservationType, Integer>  {

}
