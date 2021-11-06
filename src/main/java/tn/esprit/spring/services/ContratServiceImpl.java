package tn.esprit.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.entities.Contrat;
import tn.esprit.repository.ContratRepository;


/*:l'original*/
@Service
public class ContratServiceImpl implements IContratService {


	@Autowired
	ContratRepository contratRepository;

	
	
	public List<Contrat> getAllContrats() {
		return (List<Contrat>) contratRepository.findAll();
	}

}
