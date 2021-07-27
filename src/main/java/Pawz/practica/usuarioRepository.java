package Pawz.practica;

import org.springframework.data.repository.CrudRepository;

import Pawz.practica.usuario;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface usuarioRepository extends CrudRepository<usuario, Integer> {

}


