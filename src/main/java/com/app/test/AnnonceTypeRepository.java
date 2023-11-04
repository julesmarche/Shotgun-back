package com.app.test;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnonceTypeRepository extends CrudRepository<AnnonceType, Integer>  {

}