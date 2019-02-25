/*package edu.battleship.controller;

import edu.battleship.modele.Host;
import edu.battleship.modele.Joueur;

public class PartieControleur {

	public PartieControleur(String nomJoueur1, String nomJoueur2, Host host, String mode) {

	Joueur joueur1 = new CreerJoueurControleur().creerJoueur(nomJoueur1, host);
	Joueur joueur2 = new CreerJoueurControleur().creerJoueur(nomJoueur2, host);
	}

}*/

/**
 * Class to load de Game
 */
package edu.battleship.controller;

import edu.battleship.modele.Host;
import edu.battleship.modele.Joueur;

public class PartieControleur {

	private Joueur joueur;
	private Joueur host;
	private Joueur remoteJoueur;

	public PartieControleur(String nomJoueur1, String nomJoueur2, Host host, String mode) {

		Joueur joueur1 = new CreerJoueurControleur().creerJoueur(nomJoueur1, host);
		Joueur joueur2 = new CreerJoueurControleur().creerJoueur(mode.equalsIgnoreCase("machine") ? "machine" : nomJoueur2, host);
	}

	public Joueur obtenirJoueur(String nomJoueur, String mode, Host host) {
		return new CreerJoueurControleur().creerJoueur(mode.equalsIgnoreCase("machine") ? "machine" : nomJoueur, host);
	}

}
