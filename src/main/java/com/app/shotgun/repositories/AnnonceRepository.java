package com.app.shotgun.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.data.Annonce;



@Repository
public interface AnnonceRepository extends CrudRepository<Annonce, Integer>  {

}
