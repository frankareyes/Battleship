package edu.battleship.controller;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import edu.battleship.modele.Grille;
import edu.battleship.modele.Paire;

public class GrilleCreateurControleur {
	
	private Grille grille1;
	
	
	public Grille createGrille() {
		grille1 = new Grille();
		int[][] pos = grille1.getPos();
		int ran = ThreadLocalRandom.current().nextInt(1, 10);
		List<Paire> porteAvion = null;
		List<Paire> destructeur = null;
		List<Paire> sousMarin = null;
		List<Paire> bateauPatroille = null;
		
		switch (ran) {
		case 1:
			porteAvion = Arrays.asList(new Paire(1,2),new Paire(1,3),new Paire(1,4),new Paire(1,5));
			grille1.setPorteAvion(porteAvion);
			pos[1][2]=1;
			pos[1][3]=1;
			pos[1][4]=1;
			pos[1][5]=1;
			
			destructeur = Arrays.asList(new Paire(3,1),new Paire(4,1),new Paire(5,1));
			grille1.setDestructeur(destructeur);
			pos[3][1]=1;
			pos[4][1]=1;
			pos[5][1]=1;
			
			sousMarin = Arrays.asList(new Paire(6,3),new Paire(6,4),new Paire(6,5));
			grille1.setSousMarin(sousMarin);
			pos[6][3]=1;
			pos[6][4]=1;
			pos[6][5]=1;
		
			bateauPatroille = Arrays.asList(new Paire(9,1),new Paire(9,2));
			grille1.setBateauPatroille(bateauPatroille);
			pos[9][1]=1;
			pos[9][2]=1;

			grille1.setPos(pos);
			
			break;

		default:
			
			porteAvion = Arrays.asList(new Paire(1,2),new Paire(1,3),new Paire(1,4),new Paire(1,5));
			grille1.setPorteAvion(porteAvion);
			pos[1][2]=1;
			pos[1][3]=1;
			pos[1][4]=1;
			pos[1][5]=1;
			
			destructeur = Arrays.asList(new Paire(3,1),new Paire(4,1),new Paire(5,1));
			grille1.setDestructeur(destructeur);
			pos[3][1]=1;
			pos[4][1]=1;
			pos[5][1]=1;
			
			sousMarin = Arrays.asList(new Paire(6,3),new Paire(6,4),new Paire(6,5));
			grille1.setSousMarin(sousMarin);
			pos[6][3]=1;
			pos[6][4]=1;
			pos[6][5]=1;
		
			bateauPatroille = Arrays.asList(new Paire(9,1),new Paire(9,2));
			grille1.setBateauPatroille(bateauPatroille);
			pos[9][1]=1;
			pos[9][2]=1;

			grille1.setPos(pos);
			
			break;
		}
		
		
	//	grille1.setBateauPatroille(bateauPatroille);
		
		return grille1;

	}
}
