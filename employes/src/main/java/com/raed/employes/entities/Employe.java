package com.raed.employes.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmploye;
	private String nomEmploye;
	private Double salaire;
	private Date dateembauche;
	
	@ManyToOne
	private Societe societe;
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employe(String nomEmploye, Double salaire, Date dateembauche) {
		super();
		this.nomEmploye = nomEmploye;
		this.salaire = salaire;
		this.dateembauche = dateembauche;
	}


	public Long getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}
	public String getNomEmploye() {
		return nomEmploye;
	}
	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	public Date getDateembauche() {
		return dateembauche;
	}
	public void setDateembauche(Date dateembauche) {
		this.dateembauche = dateembauche;
	}


	@Override
	public String toString() {
		return "Employe [idEmploye=" + idEmploye + ", nomEmploye=" + nomEmploye + ", salaire=" + salaire
				+ ", dateembauche=" + dateembauche + "]";
	}
	
	
	
	
}
