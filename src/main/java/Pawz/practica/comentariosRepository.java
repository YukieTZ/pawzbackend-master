package Pawz.practica;

import org.springframework.data.repository.CrudRepository;

import Pawz.practica.comentarios;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface comentariosRepository extends CrudRepository<comentarios, Integer> {

}