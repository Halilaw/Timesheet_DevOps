package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Mission;

@Repository
public interface MissionRepository extends CrudRepository<Mission, Integer> {

}
