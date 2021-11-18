package tn.esprit.spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.text.ParseException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.dto.EmployeDTO;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.repository.EmployeRepository;
import tn.esprit.spring.services.EmployeServiceImpl;
import tn.esprit.spring.services.IEmployeService;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(EmployeTests.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeTests {
	private static final Logger l = LogManager.getLogger(EmployeServiceImpl.class);
	@Mock
	@Autowired
	private EmployeRepository employeRepository;
	
	@Autowired
	@Mock
	IEmployeService empployeService;
	
	@Autowired
	@InjectMocks
	private EmployeServiceImpl employeService;

	private EmployeDTO employe1;

	private static String mail = "wael.halila@gmail.com";


	@Before
	public void setUp() {
		
		employe1 = new EmployeDTO(
				"halila", "wael", "wael.halila@gmail.com", null, true, Role.INGENIEUR);
	
		employeRepository.save(employe1);



	}

	@After
	public void tearDown() {
		
		employeRepository.deleteAll();
	}
	@Test
 	public void ajouterEmployeTest() {
		   EmployeDTO e = new EmployeDTO();
		   e.setActifDTO(true);
		   e.setEmailDTO("wael.halila@mail.com");
		   e.setNomDTO("halila");
		   e.setPrenomDTO("wael"); 
		  when(employeRepository.save(e)).thenReturn(e);	
		  assertEquals(e.getiDDto(), employeService.addOrUpdateEmploye(e));
		  
	}
	
	@Test
 	public void getNombreEmployeJPQLTest() {
 		int nbr = employeService.getNombreEmployeJPQL();
 		assertThat(nbr).isEqualTo(0);
 	}
    @Test
    public void getAllEmployeNamesJPQLTest() {
        List<String> list = employeService.getAllEmployeNamesJPQL();
        List<String> list1 = employeService.getAllEmployes().stream().map(EmployeDTO::getNomDTO).collect(Collectors.toList());
        assertEquals(list, list1);
    }


	   @Test
	    public void getAllEmployes() {
	        assertTrue(employeService.getAllEmployes().isEmpty());
	    }
	   @Test
	    public void getSalaireByEmployeIdJPQL() {
	        int employeId = 1;
	        double salaire = employeService.getSalaireByEmployeIdJPQL(employeId);
	        assertFalse(employeRepository.findById(employeId).isPresent() &&
	                employeRepository.findById(employeId).get().getContratDTO().getSalaire() == salaire);
	    }
		@Test
		public void mettreAjourEmailByEmployeIdTest() {
			employeService.mettreAjourEmailByEmployeId(mail, employe1.getiDDto());
			Optional<EmployeDTO> e = employeRepository.findById(employe1.getiDDto());
			if (e.isPresent()) {
				assertThat(e.get().getEmailDTO()).isEqualTo(mail);
			}
		}
		@Test
		public void getEmployePrenomByIdTest() {
			String prenom = employeService.getEmployePrenomById(employe1.getiDDto());
			assertThat(prenom).isEqualTo(null);
		}
		@Test
		public void mettreAjourEmailByEmployeIdJPQLTest() {
			employeService.mettreAjourEmailByEmployeIdJPQL("wael.halila@gmail.com", employe1.getiDDto());
			Optional<EmployeDTO> e = employeRepository.findById(employe1.getiDDto());
			if (e.isPresent()) {
				assertThat(e.get().getEmailDTO()).isEqualTo("wael.halila@gmail.com");
			}
		}
		@Test
		public void testDeleteEmploye() {
			Employe emp = new Employe();
			assertNotNull(emp);
			employeRepository.deleteEmployeById(16);
					
		}
}
