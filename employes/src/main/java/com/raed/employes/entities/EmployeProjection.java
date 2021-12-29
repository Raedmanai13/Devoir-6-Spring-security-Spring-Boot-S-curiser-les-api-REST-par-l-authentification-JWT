package com.raed.employes.entities;

import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomEmpl", types = { Employe.class })
public interface EmployeProjection {
	public String getNomEmploye();
}