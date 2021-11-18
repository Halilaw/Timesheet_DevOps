package tn.esprit.spring.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Role;

public class EmployeDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int iDDto;
	private String prenomDTO; 
	private String nomDTO;
	private String passwordDTO;
	private List<Departement> departements;
	public String getNomDTO() {
		return nomDTO;
	}

	public void setNomDTO(String nomDTO) {
		this.nomDTO = nomDTO;
	}

	public EmployeDTO(String prenomDTO, String nomDTO, String emailDTO, boolean isActifDTO, Role roleDTO) {
		super();
		this.prenomDTO = prenomDTO;
		this.nomDTO = nomDTO;
		this.emailDTO = emailDTO;
		this.isActifDTO = isActifDTO;
		this.roleDTO = roleDTO;
	}

	private String emailDTO;
	private boolean isActifDTO;
	@Enumerated(EnumType.STRING)
	private Role roleDTO;
	
	private Contrat contratDTO;
	
	
	public EmployeDTO() {
		super();
	}
	

	

	public EmployeDTO(int iDDto, String prenomDTO, String nomDTO, String passwordDTO, String emailDTO,
			boolean isActifDTO, Role roleDTO) {
		super();
		this.iDDto = iDDto;
		this.prenomDTO = prenomDTO;
		this.nomDTO = nomDTO;
		this.passwordDTO = passwordDTO;
		this.emailDTO = emailDTO;
		this.isActifDTO = isActifDTO;
		this.roleDTO = roleDTO;
	}

	public EmployeDTO(String prenomDTO, String nomDTO, String passwordDTO, String emailDTO, boolean isActifDTO,
			Role roleDTO) {
		super();
		this.prenomDTO = prenomDTO;
		this.nomDTO = nomDTO;
		this.passwordDTO = passwordDTO;
		this.emailDTO = emailDTO;
		this.isActifDTO = isActifDTO;
		this.roleDTO = roleDTO;
	}

	public int getiDDto() {
		return iDDto;
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

	public String getPasswordDTO() {
		return passwordDTO;
	}

	public void setPasswordDTO(String passwordDTO) {
		this.passwordDTO = passwordDTO;
	}

	public List<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}

	

}
