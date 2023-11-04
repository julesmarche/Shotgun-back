package com.app.shotgun.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.data.User;



@Repository
public interface UserRepository extends CrudRepository<User, Integer>  {

}
