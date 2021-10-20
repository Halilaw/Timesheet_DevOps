package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Timesheet implements Serializable{

	private static final long serialVersionUID = 3876346912862238239L;

	//idEmploye est a la fois primary key et foreign key
	
	@ManyToOne
    @JoinColumn(name = "idEmploye", referencedColumnName = "id", insertable=false, updatable=false)
	private Employe employe;


	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	
	
}
