package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Departement implements Serializable {

	private static final long serialVersionUID = -357738161698377833L;


	
	//@JsonManagedReference 
	@JsonIgnore
	@ManyToMany
	private List<Employe> employes;


	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}



}
