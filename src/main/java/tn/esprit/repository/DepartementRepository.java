package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Departement;

@Repository
public interface DepartementRepository extends CrudRepository<Departement, Integer>{

}
