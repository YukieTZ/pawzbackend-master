package Pawz.practica;

import org.springframework.data.repository.CrudRepository;

import Pawz.practica.Friends;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface friendsRepository extends CrudRepository<Friends, Integer> {

}