package org.mql.java.introspection;

import org.mql.java.objects.Departement;
import org.mql.java.objects.Professeur;
import org.mql.java.objects.Universite;

public class Examples {

	public Examples() {
		exp01();
	}
	
	void exp01() {
		Universite univ = new Universite("Dhar El Mahraz");
		Departement dep = new Departement("MQL", univ);
		Professeur prof = new Professeur("Saida", dep);
		
		System.out.println(StringMapper.toString(prof));
	}
	
	
	public static void main(String[] args) {
		new Examples();
	}
	

}
