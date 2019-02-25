package edu.battleship.controller;

import java.util.ArrayList;
import java.util.List;

import edu.battleship.modele.Bateau;
import edu.battleship.modele.Grille;
import edu.battleship.modele.Host;
import edu.battleship.modele.Joueur;

public class CreerJoueurControleur {

	private Joueur joueur;
	private Grille grille;
	
	public Joueur creerJoueur(String nom, Host host) {
		joueur = new Joueur();
		joueur.setPoints(12);
		joueur.setNom(nom);
		joueur.setHost(host);
		grille = new GrilleCreateurControleur().createGrille();
		joueur.setGrilleNavale(grille);
		joueur.setBateaux(creerBateau());
		/**
		 * si je vais jouer contre l'ordinateur alors je commence, sinon l'autre joueur
		 * commence
		 */
		joueur.setTour(host == null ? true : false);//
		joueur.setTour(false);
		return joueur;

	}

	public List<Bateau> creerBateau() {

		List<Bateau> bateaux = new ArrayList<>();

		// creer un porte-avion
		Bateau porteAvion = new Bateau("Porte-Avion", "Porte-Avion", 4, true, grille.getPorteAvion());
		bateaux.add(porteAvion);

		// creer un destructeur
		Bateau destructeur = new Bateau("USS Nimic", "Destructeur", 3, true, grille.getDestructeur());
		bateaux.add(destructeur);

		// creer un sous-marin
		Bateau sousMarin = new Bateau("Nuclear A5", "Sous-Marin", 3, true, grille.getSousMarin());
		bateaux.add(sousMarin);

		// creer un bateau de patroille
		Bateau bateauPatroille = new Bateau("Patrol 1", "Bateau-Patroille", 2, true, grille.getBateauPatroille());
		bateaux.add(bateauPatroille);

		return bateaux;
	}


	
}
