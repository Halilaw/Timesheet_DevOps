package tn.esprit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Departement;
import tn.esprit.repository.DepartementRepository;

@Service
public class DepartementServiceImpl implements IDepartementService {


	@Autowired
	DepartementRepository deptRepoistory;


	public List<Departement> getAllDepartements() {
		return (List<Departement>) deptRepoistory.findAll();
	}

}
