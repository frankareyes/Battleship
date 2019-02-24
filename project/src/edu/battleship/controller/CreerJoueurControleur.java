package edu.battleship.controller;

import java.util.ArrayList;
import java.util.List;

import edu.battleship.modele.Bateau;
import edu.battleship.modele.Grille;
import edu.battleship.modele.Host;
import edu.battleship.modele.Joueur;

public class CreerJoueurControleur {

	private Joueur joueur;

	public Joueur creerJoueur(String nom, Host host) {
		joueur = new Joueur();
		joueur.setPoints(12);
		joueur.setBateaux(creerBateau());
		joueur.setNom(nom);
		joueur.setHost(host);
		/**
		 * si je vais jouer contre l'ordinateur alors je commence, sinon l'autre joueur
		 * commence
		 */
		joueur.setTour(host == null ? true : false);//
//		List<Bateau> bateaux = creerBateau();
//		Grille grilleNavale = creerGrille(bateaux);
//		boolean tour;

		return joueur;

	}

	public List<Bateau> creerBateau() {

		List<Bateau> bateaux = new ArrayList<>();

		// creer un porte-avion

		Bateau porteAvion = new Bateau("Porte-Avion", "Porte-Avion", 4, true, null);
		bateaux.add(porteAvion);

		// creer un destructeur
		Bateau destructeur = new Bateau("USS Nimic", "Destructeur", 3, true, null);
		bateaux.add(destructeur);

		// creer un sous-marin
		Bateau sousMarin = new Bateau("Nuclear A5", "Sous-Marin", 3, true, null);
		bateaux.add(sousMarin);

		// creer un bateau de patroille
		Bateau bateauPatroille = new Bateau("Patrol 1", "Bateau-Patroille", 2, true, null);
		bateaux.add(bateauPatroille);

		return bateaux;
	}

	public void creerGrille() {
		
		
	}
	
}
