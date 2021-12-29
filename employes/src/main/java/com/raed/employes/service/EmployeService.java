package com.raed.employes.service;

import java.util.List;

import com.raed.employes.entities.Employe;
import com.raed.employes.entities.Societe;

public interface EmployeService {
Employe saveEmploye(Employe e);
Employe updateEmploye(Employe e);
void deleteEmploye(Employe e);
void deleteEmployeById(Long id);
Employe getEmploye(Long id);
List<Employe> getAllEmployes();
List<Employe> findByNomEmploye(String nom);
List<Employe> findByNomEmployeContains(String nom);
List<Employe> findByNomSalaire (String nom, Double salaire);
List<Employe> findBySociete (Societe societe);
List<Employe> findBySocieteIdSoc(Long id);
List<Employe> findByOrderByNomEmployeAsc();
List<Employe> trierEmployesNomsSalaire();
}