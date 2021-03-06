package com.matthew.dogs.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.matthew.dogs.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findAll(); // 
}



/*
C - Create
R - Read
U - Update
D - Delete


*/