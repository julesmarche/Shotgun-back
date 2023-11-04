package com.app.shotgun.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.data.Reservation;



@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer>  {

}
