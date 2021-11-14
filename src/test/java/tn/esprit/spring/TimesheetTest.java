package tn.esprit.spring;

import static org.junit.Assert.assertNotEquals;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.TimesheetTest; 

import tn.esprit.spring.services.IEmployeService;
import tn.esprit.spring.services.IEntrepriseService;



@SpringBootTest
@RunWith(SpringRunner.class)
public class TimesheetTest {
	private static final Logger l =  LogManager.getLogger(TimesheetTest.class);
	
	@Autowired
	IEmployeService empservice;
	@Autowired
	IEntrepriseService entservice;
	
		
		
	
	
		@Order(1)
		@Test
		public void getAllEmployeByEntrepriseTest(){
			try{
			Entreprise ent= entservice.getEntrepriseById(1);
			List<Employe>employes = empservice.getAllEmployeByEntreprise(ent);
			assertNotEquals(employes.size(),0);
	    	l.info("Employees List  >0 ,"+employes.size());
	    	l.info("Employees  ,"+employes);}
			catch(Exception e){
				l.error("Erreur dans getAllEmployeByEntrepriseTest : "+e);
			}
		}
		@Order(2)
		@Test
		public void mettreAjourEmailByEmployeIdJPQLTest(){
			try{
			empservice.mettreAjourEmailByEmployeIdJPQL("m@mail.com", 7);
			
			l.info("Update");}
			catch(Exception e){
				l.error("Erreur dans mettreAjourEmailByEmployeIdJPQLTest : "+e);
			}
			
			
		}
		@Order(5)
		@Test
		public void deleteAllContratJPQLTest(){
			
			empservice.deleteAllContratJPQL();
		}
		@Order(3)
		@Test
		public void getSalaireByEmployeIdJPQLTest(){
			try{
				
				l.info("Salaire : "+empservice.getSalaireByEmployeIdJPQL(1));
				
			}
			catch(Exception e){
				l.error("Erreur dans getSalaireByEmployeIdJPQLTes : "+e);
			}
		}
		@Order(4)
		@Test
		public void getSalaireMoyenByDepartementIdTest(){
			try{
			
			l.info("Salary by Department : "+empservice.getSalaireMoyenByDepartementId(1));}
			
			
			catch(Exception e){
				l.error("Erreur dans getSalaireMoyenByDepartementIdTest : "+e);
			}
			
			
		}
		
		

	


		
	}