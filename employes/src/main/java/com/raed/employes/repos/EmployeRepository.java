package com.raed.employes.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.raed.employes.entities.Employe;
import com.raed.employes.entities.Societe;

@RepositoryRestResource(path = "rest")
public interface EmployeRepository extends JpaRepository<Employe, Long> {
   List<Employe> findByNomEmploye(String nom);
   List<Employe> findByNomEmployeContains(String nom);
   
  
   
   @Query("select e from Employe e where e.societe = ?1")
   List<Employe> findBySociete (Societe societe);
   
   List<Employe> findBySocieteIdSoc(Long id);
   
   @Query("select e from Employe e where e.nomEmploye like %?1 and e.salaire > ?2")
   List<Employe> findByNomSalaire (String nom, Double salaire);
   
   List<Employe> findByOrderByNomEmployeAsc();
   
   @Query("select e from Employe e order by e.nomEmploye ASC, e.salaire DESC")
   List<Employe> trierEmployesNomsSalaire ();
}
