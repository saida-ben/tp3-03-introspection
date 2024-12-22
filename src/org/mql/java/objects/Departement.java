package org.mql.java.objects;

public class Departement {
	private String nom;
	private Universite universite;
	 
	public Departement() {}
	
	public Departement(String nom, Universite universite) {
		this.nom = nom;
		this.setUniversite(universite);
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public Universite getUniversite() {
		return universite;
	}

	public void setUniversite(Universite universite) {
		this.universite = universite;
	}
	


}
