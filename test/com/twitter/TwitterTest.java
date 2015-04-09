package com.twitter;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

public class TwitterTest {
	Twitter tw;
	
	@Before
	public void setUp() throws Exception {
		
		tw = new Twitter();
	}
	@After
	public void tearDown() throws Exception {
		
		tw = null;
	}
	@Test
	public void testVratiSvePoruke() {
		LinkedList<TwitterPoruka> sve = new LinkedList<TwitterPoruka>();
		
		assertEquals(sve, tw.vratiSvePoruke());
		
	}
	@Test
	public void testUnesi() {
		TwitterPoruka twp = new TwitterPoruka();
		twp.setKorisnik("Ana");
		twp.setPoruka("Neka poruka");
		
		tw.unesi("Ana", "Neka poruka");
		
		assertEquals(twp.toString(), tw.vratiSvePoruke().get(0).toString());
	}
	
	@Test
	public void testVratiPoruke() {
		
		tw.unesi("Ana", "poruka1");
		tw.unesi("Maja", "poruka2");
		tw.unesi("Mila", "poruka3");
		tw.unesi("Mia", "poruka4");
		
		assertEquals("poruka4",tw.vratiPoruke(6, "poruka")[3].getPoruka());
		
		//umesto poruke4, dobijam poruku3 jer niz rezultat krece od [brojac+1] umesto [brojac]
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukeTagNull() {
		tw.vratiPoruke(7, null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukeTagIsEmpty() {
		tw.vratiPoruke(7, "");
	}
	
}