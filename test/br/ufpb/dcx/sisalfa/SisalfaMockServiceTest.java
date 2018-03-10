package br.ufpb.dcx.sisalfa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SisalfaMockServiceTest {
	
	private SisalfaMockService mockService;
	
	@Before
	public void beforeTests() {
		mockService = new SisalfaMockService();
	}
	
	@Test
	public void testUserMethods() {
		assertTrue(mockService.getAllUsers().size()==0);
		assertTrue(mockService.addUser(new User("Ayla","123")));
		assertTrue(mockService.getAllUsers().size()==1);
		assertFalse(mockService.addUser(new User("Ayla","123")));
		assertTrue(mockService.getAllUsers().size()==1);
		assertTrue(mockService.addUser(new User("José","321")));
		assertTrue(mockService.getAllUsers().size()==2);
		assertTrue(mockService.updateUser("123", new User("Ayla Débora Dantas", "123")));
		User u = mockService.getUser("123");
		assertTrue(u.getName().equals("Ayla Débora Dantas"));
		assertTrue(mockService.getAllUsers().size()==2);
	}
	
	
	@Test
	public void testContextMethods() {
		assertTrue(mockService.getAllContexts().size()==0);
		assertTrue(mockService.addUser(new User("Ayla","123")));
		Context cozinha = new Context("COZINHA", "1","123",null, null, null);
		assertTrue(mockService.addContext(cozinha));
		assertTrue(mockService.getAllContexts().size()==1);
		assertFalse(mockService.addContext(cozinha));
		assertTrue(mockService.getAllContexts().size()==1);
		assertTrue(mockService.addContext(new Context("ESPORTES","2","123",null,null,null)));
		assertTrue(mockService.getAllContexts().size()==2);
		assertTrue(mockService.updateContext("1", new Context("COZINHA", "1","123",null, null, "http://new.url.br")));
		Context c = mockService.getContext("1");
		assertTrue(c.getName().equals("COZINHA"));
		assertTrue(c.getVideoUrl().equals("http://new.url.br"));
		assertTrue(mockService.getAllContexts().size()==2);
		assertEquals(2,mockService.getAllContextsOfUser("123").size());
		assertTrue(mockService.addContext(new Context("NATUREZA","3","321",null,null,null)));
		assertEquals(1,mockService.getAllContextsOfUser("321").size());
		
	}

	@Test
	public void testChallengeMethods() {
		assertTrue(mockService.getAllChallenges().size()==0);
		assertTrue(mockService.addUser(new User("Ayla","123")));
		Context cozinha = new Context("COZINHA", "1","123",null, null, null);
		assertTrue(mockService.addContext(cozinha));
		assertTrue(mockService.getAllContexts().size()==1);
		assertTrue(mockService.addChallenge(new Challenge("COLHER","100","123","1",null,null,null)));
		assertTrue(mockService.getAllChallenges().size()==1);
		assertTrue(mockService.addChallenge(new Challenge("GARFO","101","123","1",null,null,null)));
		assertTrue(mockService.getAllChallenges().size()==2);
		assertTrue(mockService.addUser(new User("José","321")));
		Context esportes = new Context("ESPORTE", "2","321",null, null, null);
		assertTrue(mockService.addContext(esportes));
		assertTrue(mockService.addChallenge(new Challenge("FUTEBOL","102","321","2",null,null,null)));
		assertTrue(mockService.getAllChallenges().size()==3);
		assertTrue(mockService.getAllChallengesOfUser("321").size()==1);
		assertTrue(mockService.updateChallenge("102", new Challenge("FUTEBOL", "102","321","2",null, null, "http://new2.url.br")));
		Challenge c = mockService.getChallenge("102");
		assertTrue(c.getWord().equals("FUTEBOL"));
		assertTrue(c.getVideoUrl().equals("http://new2.url.br"));
		assertTrue(mockService.getAllChallenges().size()==3);
		assertEquals(2,mockService.getAllChallengesOfUser("123").size());
		assertEquals(1,mockService.getAllChallengesOfUser("321").size());
		assertTrue(mockService.deleteChallenge("102"));
		assertEquals(0,mockService.getAllChallengesOfUser("321").size());
		assertEquals(2,mockService.getAllChallenges().size());
		
	}
	

}
