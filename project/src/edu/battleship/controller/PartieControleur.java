package edu.battleship.controller;

import edu.battleship.modele.Host;
import edu.battleship.modele.Joueur;

public class PartieControleur {

	public PartieControleur(String nomJoueur1, String nomJoueur2, Host host, String mode) {

	Joueur joueur1 = new CreerJoueurControleur().creerJoueur(nomJoueur1, host);
	Joueur joueur2 = new CreerJoueurControleur().creerJoueur(nomJoueur2, host);
	}

}
