package tn.esprit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.entities.Departement;
import tn.esprit.entities.Entreprise;
import tn.esprit.services.IEmployeService;
import tn.esprit.services.IEntrepriseService;
import tn.esprit.services.ITimesheetService;

@Controller
public class ControllerEntrepriseImpl{
	


	@Autowired
	IEmployeService iemployeservice;
	@Autowired
	IEntrepriseService ientrepriseservice;
	@Autowired
	ITimesheetService itimesheetservice;

	
	
	public int ajouterEntreprise(Entreprise ssiiConsulting) {
		
		ientrepriseservice.ajouterEntreprise(ssiiConsulting);
		return ssiiConsulting.getId();
	}
	public void affecterDepartementAEntreprise(int depId, int entrepriseId) {
		
			ientrepriseservice.affecterDepartementAEntreprise(depId, entrepriseId);
		
	}
		
	
	public void deleteEntrepriseById(int entrepriseId)
	{
		ientrepriseservice.deleteEntrepriseById(entrepriseId);
	}
	public Entreprise getEntrepriseById() {

		return ientrepriseservice.getEntrepriseById(1);
	}
	
	public int ajouterDepartement(Departement dep) {
		return ientrepriseservice.ajouterDepartement(dep);
	}
	
	public List<String> getAllDepartementsNamesByEntreprise(int entrepriseId) {
		return ientrepriseservice.getAllDepartementsNamesByEntreprise(entrepriseId);
	}

	public void deleteDepartementById(int depId) {
		ientrepriseservice.deleteDepartementById(depId);

	}
}





