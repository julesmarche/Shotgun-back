package com.app.shotgun.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.data.EtatType;



@Repository
public interface EtatTypeRepository extends CrudRepository<EtatType, Integer>  {

}
