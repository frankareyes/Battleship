package edu.battleship.controller;

import edu.battleship.modele.Grille;

public class GrilleCreateurControleur {
	
	private Grille grille1;
	
	
	private Grille createGrille() {
		grille1 = new Grille();
		int[][] pos = grille1.getPos();
		return grille1;

	}
}
