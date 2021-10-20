package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Contrat implements Serializable {
	
	private static final long serialVersionUID = 6191889143079517027L;


	@OneToOne
	private Employe employe;

	
	public Contrat() {
		super();
	}
	
	

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	
	
}
