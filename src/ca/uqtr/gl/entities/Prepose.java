package ca.uqtr.gl.entities;

import java.util.Date;

import ca.uqtr.gl.domain.RegistreClient;

public class Prepose extends Employe {
	
	private RegistreClient registre;

	public Prepose(String nom, String prenom, Date dateNaissance,
			Adresse adresse, int noEmploye, String titre) {
		super(nom, prenom, dateNaissance, adresse, noEmploye, titre);
		
		registre = RegistreClient.getInstance();
	}

}
