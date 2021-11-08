package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.repository.MissionRepository;
import tn.esprit.spring.services.ITimesheetService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MissionTest {
	
	@Autowired
	ITimesheetService tss;
	
	@Autowired 
	MissionRepository mr ;
	
	@Test 
	public void ajouterMissionTest() {
		Mission mis=new Mission("application de vente","réaliser une application de vente des produits");
		int m=tss.ajouterMission(mis);
		assertEquals(mis.getId(),m);
	}
	
	
	
	
	
	@Test
	public void getAllEmployeByMissionTestSuccees2() {
		List<Employe> emp=tss.getAllEmployeByMission(8);
		assertNotNull(emp);
	}
	

}
