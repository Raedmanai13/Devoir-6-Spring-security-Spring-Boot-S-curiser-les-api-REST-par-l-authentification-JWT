	package com.raed.employes;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.raed.employes.entities.Employe;
import com.raed.employes.entities.Societe;
import com.raed.employes.repos.EmployeRepository;

@SpringBootTest
class EmployesApplicationTests {

	@Autowired
	private EmployeRepository employeRepository;
	
	@Test
	public void testFindByNomProduit()
	{
	List<Employe> empls = employeRepository.findByNomEmploye("Raed Manai");

	for (Employe e : empls)
	{
		System.out.println(e);
	}

	}
	

}
