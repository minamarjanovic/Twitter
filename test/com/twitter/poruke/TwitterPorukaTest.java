package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwitterPorukaTest {

	TwitterPoruka twitterPoruka;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		twitterPoruka = new TwitterPoruka();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		twitterPoruka = null;
	}
	
	

	@Test
	public void testSetKorisnik() {
		twitterPoruka.setKorisnik("Ana");
		
		assertEquals("Ana", twitterPoruka.getKorisnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		twitterPoruka.setKorisnik(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikEmptyString() {
		twitterPoruka.setKorisnik("");
	}

	

	@Test
	public void testSetPoruka() {
		twitterPoruka.setPoruka("Prva poruka");
		
		assertEquals("Prva poruka", twitterPoruka.getPoruka());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull() {
		twitterPoruka.setPoruka(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaDuzaOd140() {
		twitterPoruka.setPoruka("Napraviti repozitorijum na GitHub-u koji se zove Twitter i postaviti Eclipse projekat Twitter koji je povezan sa ovim repozitorijumom.Napomena: ako commit-ova bude i vise nego sto je naznaceno, nema veze. Uvodjenje novih grana Itagova je opciono. Takodje, sa vremena na vreme treba uraditi push na GitHub repozitorijum. Napraviti javnu klasu TwitterPoruka u paketu com.twitter.poruke.");
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#toString()}.
	 */
	@Test
	public void testToString() {
		twitterPoruka.setKorisnik("Ana");
		twitterPoruka.setPoruka("Prva poruka");
		
		assertEquals("KORISNIK:Ana PORUKA:Prva poruka", twitterPoruka.toString());
	}

}