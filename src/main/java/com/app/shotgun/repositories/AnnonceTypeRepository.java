package com.app.shotgun.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.data.AnnonceType;



@Repository
public interface AnnonceTypeRepository extends CrudRepository<AnnonceType, Integer>  {

}
