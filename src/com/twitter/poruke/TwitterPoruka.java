package com.twitter.poruke;

/**
 * Ova klasa predstavlja Twitter poruku
 * @author Mina Marjanovic
 *
 */

public class TwitterPoruka {
	
	/**
	 * Ime korisnika
	 */
	private String korisnik;
	
	/**
	 * Poruka korisnika
	 */
	private String poruka;
	
	
	/**
	 * Vraca vrednost atributa korisnik
	 * @return ime korisnika kao String
	 */
	public String getKorisnik() {
		return korisnik;
	}
	
	/** 
	 * Postavlja vrednost atributa korisnik na unetu vrednost
	 * @param korisnik Nova vrednost za korisnika
	 * @throws java.lang.RuntimeException
	 * <ul>
	 *<li>unet korisnik null</li>
	 *	<li>ili prazan String</li>
	 *</ul>
	 */
	
	public void setKorisnik(String korisnik) {
		if (korisnik==null || korisnik.equals(""))
				throw new RuntimeException(
						"Ime korisnika mora biti uneto");
		
		this.korisnik = korisnik;
		}
	
	/**
	 * Vraca vrednost atributa poruka
	 * @return poruka kao String
	 */
	public String getPoruka() {
		return poruka;
	}
	
	
	/** 
	 * Postavlja vrednost atributa poruka na unetu vrednost
	 * @param poruka Nova vrednost za poruku
	 * @throws java.lang.RuntimeException
	 * <ul>
	 *<li>uneta poruka null</li>
	 *	<li>ili duza od 140 karaktera</li>
	 *</ul>
	 */
	public void setPoruka(String poruka) {
		if (poruka==null || poruka.length()>140)
			throw new RuntimeException(
			"Poruka mora biti uneta i mora imati najvise 140 znakova");
			
			this.poruka = poruka;
	}
	
	/**
	 * Metoda toString redefinisana
	 * @return ime korisnika i poruku
	 */
	public String toString(){
		return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	}
	

}