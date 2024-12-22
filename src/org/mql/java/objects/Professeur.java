package org.mql.java.objects;

public class Professeur {
	private String nom;
	private Departement departement;

	public Professeur() {}
	
	public Professeur(String nom, Departement departement) {
		this.nom = nom;
		this.departement = departement;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

}
