package tn.esprit.spring.dto;

import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Role;

public class EmployeDTO {
	public EmployeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int iDDto;
	private String prenomDTO; 
	private List<Departement> departements;
	/**
	 * @return the departements
	 */
	public List<Departement> getDepartements() {
		return departements;
	}

	/**
	 * @param departements the departements to set
	 */
	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}

	private String nomDTO;
	public String getNomDTO() {
		return nomDTO;
	}

	public void setNomDTO(String nomDTO) {
		this.nomDTO = nomDTO;
	}

	private String emailDTO;
	private boolean isActifDTO;
	@Enumerated(EnumType.STRING)
	private Role roleDTO;
	
	private Contrat contratDTO;
	
	
	public EmployeDTO(String nom, String prenom, String email, String password, boolean actif, Role role) {
		super();
	}
	

	public int getiDDto() {
		return iDDto;
	}

	public EmployeDTO(int iDDto, String prenomDTO, List<Departement> departements, String nomDTO, String emailDTO,
			boolean isActifDTO, Role roleDTO, Contrat contratDTO) {
		super();
		this.iDDto = iDDto;
		this.prenomDTO = prenomDTO;
		this.departements = departements;
		this.nomDTO = nomDTO;
		this.emailDTO = emailDTO;
		this.isActifDTO = isActifDTO;
		this.roleDTO = roleDTO;
		this.contratDTO = contratDTO;
	}

	public void setiDDto(int iDDto) {
		this.iDDto = iDDto;
	}

	public String getPrenomDTO() {
		return prenomDTO;
	}

	public void setPrenomDTO(String prenomDTO) {
		this.prenomDTO = prenomDTO;
	}

	public String getEmailDTO() {
		return emailDTO;
	}

	public void setEmailDTO(String emailDTO) {
		this.emailDTO = emailDTO;
	}

	public boolean isActifDTO() {
		return isActifDTO;
	}

	public void setActifDTO(boolean isActifDTO) {
		this.isActifDTO = isActifDTO;
	}

	public Role getRoleDTO() {
		return roleDTO;
	}

	public void setRoleDTO(Role roleDTO) {
		this.roleDTO = roleDTO;
	}

	public Contrat getContratDTO() {
		return contratDTO;
	}

	public void setContratDTO(Contrat contratDTO) {
		this.contratDTO = contratDTO;
	}


}
