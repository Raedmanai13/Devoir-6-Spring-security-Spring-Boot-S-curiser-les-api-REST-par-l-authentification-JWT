package com.raed.employes.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Societe {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idSoc;
	private String nomSoc;
	private String lieuSoc;
	
	@JsonIgnore
	@OneToMany (mappedBy= "societe")
	private List<Employe> employes;
}
