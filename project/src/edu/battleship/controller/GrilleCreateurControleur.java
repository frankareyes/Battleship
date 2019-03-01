/**
 * The purpose of this class is to provide the battle formations
 */

package edu.battleship.controller;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import edu.battleship.modele.Grille;
import edu.battleship.modele.Paire;

public class GrilleCreateurControleur {
	
	private Grille grille;
	
	
	public Grille createGrille() {
		grille = new Grille();
		int[][] pos =  grille.getPos();
		
		int ran = ThreadLocalRandom.current().nextInt(1, 10);
		List<Paire> porteAvion = null;
		List<Paire> destructeur = null;
		List<Paire> sousMarin = null;
		List<Paire> bateauPatroille = null;
		
		switch (ran) {
		case 1:
			porteAvion = Arrays.asList(new Paire(1,2),new Paire(1,3),new Paire(1,4),new Paire(1,5));
			grille.setPorteAvion(porteAvion);
			pos[1][2]=1;
			pos[1][3]=1;
			pos[1][4]=1;
			pos[1][5]=1;
			
			destructeur = Arrays.asList(new Paire(3,1),new Paire(4,1),new Paire(5,1));
			grille.setDestructeur(destructeur);
			pos[3][1]=1;
			pos[4][1]=1;
			pos[5][1]=1;
			
			sousMarin = Arrays.asList(new Paire(6,3),new Paire(6,4),new Paire(6,5));
			grille.setSousMarin(sousMarin);
			pos[6][3]=1;
			pos[6][4]=1;
			pos[6][5]=1;
		
			bateauPatroille = Arrays.asList(new Paire(9,1),new Paire(9,2));
			grille.setBateauPatroille(bateauPatroille);
			pos[9][1]=1;
			pos[9][2]=1;

			grille.setPos(pos);
			
			break;

		case 2:
			porteAvion = Arrays.asList(new Paire(1,2),new Paire(1,3),new Paire(1,4),new Paire(1,5));
			grille.setPorteAvion(porteAvion);
			pos[1][2]=1;
			pos[1][3]=1;
			pos[1][4]=1;
			pos[1][5]=1;
			
			destructeur = Arrays.asList(new Paire(3,7),new Paire(4,7),new Paire(5,7));
			grille.setDestructeur(destructeur);
			pos[3][7]=1;
			pos[4][7]=1;
			pos[5][7]=1;
			
			sousMarin = Arrays.asList(new Paire(8,3),new Paire(8,4),new Paire(8,5));
			grille.setSousMarin(sousMarin);
			pos[8][3]=1;
			pos[8][4]=1;
			pos[8][5]=1;
		
		
			bateauPatroille = Arrays.asList(new Paire(9,8),new Paire(9,9));
			grille.setBateauPatroille(bateauPatroille);
			pos[9][8]=1;
			pos[9][9]=1;

			grille.setPos(pos);
			
			break;
		case 3:
			porteAvion = Arrays.asList(new Paire(1,2),new Paire(2,2),new Paire(3,2),new Paire(4,2));
			grille.setPorteAvion(porteAvion);
			pos[1][2]=1;
			pos[2][2]=1;
			pos[3][2]=1;
			pos[4][2]=1;
			
			destructeur = Arrays.asList(new Paire(3,7),new Paire(4,7),new Paire(5,7));
			grille.setDestructeur(destructeur);
			pos[3][7]=1;
			pos[4][7]=1;
			pos[5][7]=1;
			
			sousMarin = Arrays.asList(new Paire(8,7),new Paire(8,8),new Paire(8,9));
			grille.setSousMarin(sousMarin);
			pos[8][7]=1;
			pos[8][8]=1;
			pos[8][9]=1;
		
		
			bateauPatroille = Arrays.asList(new Paire(1,8),new Paire(1,9));
			grille.setBateauPatroille(bateauPatroille);
			pos[1][8]=1;
			pos[1][9]=1;

			grille.setPos(pos);
			
			break;
		case 4:
			porteAvion = Arrays.asList(new Paire(4,3),new Paire(5,3),new Paire(6,3),new Paire(7,3));
			grille.setPorteAvion(porteAvion);
			pos[4][3]=1;
			pos[5][3]=1;
			pos[6][3]=1;
			pos[7][3]=1;
			
			destructeur = Arrays.asList(new Paire(1,1),new Paire(2,1),new Paire(3,1));
			grille.setDestructeur(destructeur);
			pos[1][1]=1;
			pos[2][1]=1;
			pos[3][1]=1;
			
			sousMarin = Arrays.asList(new Paire(7,5),new Paire(8,5),new Paire(9,5));
			grille.setSousMarin(sousMarin);
			pos[7][5]=1;
			pos[8][5]=1;
			pos[9][5]=1;
		
		
			bateauPatroille = Arrays.asList(new Paire(1,4),new Paire(1,5));
			grille.setBateauPatroille(bateauPatroille);
			pos[1][4]=1;
			pos[1][5]=1;

			grille.setPos(pos);
			
			break;
		case 5:
			porteAvion = Arrays.asList(new Paire(6,0),new Paire(7,0),new Paire(8,0),new Paire(9,0));
			grille.setPorteAvion(porteAvion);
			pos[6][0]=1;
			pos[7][0]=1;
			pos[8][0]=1;
			pos[9][0]=1;
			
			destructeur = Arrays.asList(new Paire(7,2),new Paire(8,2),new Paire(9,2));
			grille.setDestructeur(destructeur);
			pos[7][2]=1;
			pos[8][2]=1;
			pos[9][2]=1;
			
			sousMarin = Arrays.asList(new Paire(8,6),new Paire(8,7),new Paire(8,8));
			grille.setSousMarin(sousMarin);
			pos[8][6]=1;
			pos[8][7]=1;
			pos[8][8]=1;
		
		
			bateauPatroille = Arrays.asList(new Paire(4,4),new Paire(4,5));
			grille.setBateauPatroille(bateauPatroille);
			pos[4][4]=1;
			pos[4][5]=1;

			grille.setPos(pos);
			
			break;
		case 6:
			porteAvion = Arrays.asList(new Paire(3,6),new Paire(3,7),new Paire(3,8),new Paire(3,9));
			grille.setPorteAvion(porteAvion);
			pos[3][6]=1;
			pos[3][7]=1;
			pos[3][8]=1;
			pos[3][9]=1;
			
			destructeur = Arrays.asList(new Paire(6,1),new Paire(6,2),new Paire(6,3));
			grille.setDestructeur(destructeur);
			pos[6][1]=1;
			pos[6][2]=1;
			pos[6][3]=1;
			
			sousMarin = Arrays.asList(new Paire(8,6),new Paire(8,7),new Paire(8,8));
			grille.setSousMarin(sousMarin);
			pos[8][6]=1;
			pos[8][7]=1;
			pos[8][8]=1;
		
		
			bateauPatroille = Arrays.asList(new Paire(4,1),new Paire(4,2));
			grille.setBateauPatroille(bateauPatroille);
			pos[4][1]=1;
			pos[4][2]=1;

			grille.setPos(pos);
			
			break;
		case 7:
			porteAvion = Arrays.asList(new Paire(1,8),new Paire(2,8),new Paire(3,8),new Paire(4,8));
			grille.setPorteAvion(porteAvion);
			pos[1][8]=1;
			pos[2][8]=1;
			pos[3][8]=1;
			pos[4][8]=1;
			
			destructeur = Arrays.asList(new Paire(9,0),new Paire(9,1),new Paire(9,2));
			grille.setDestructeur(destructeur);
			pos[9][0]=1;
			pos[9][1]=1;
			pos[9][2]=1;
			
			sousMarin = Arrays.asList(new Paire(8,6),new Paire(8,7),new Paire(8,8));
			grille.setSousMarin(sousMarin);
			pos[8][6]=1;
			pos[8][7]=1;
			pos[8][8]=1;
		
		
			bateauPatroille = Arrays.asList(new Paire(3,1),new Paire(3,2));
			grille.setBateauPatroille(bateauPatroille);
			pos[3][1]=1;
			pos[3][2]=1;

			grille.setPos(pos);
			
			break;
		case 8:
			porteAvion = Arrays.asList(new Paire(4,4),new Paire(4,5),new Paire(4,6),new Paire(4,7));
			grille.setPorteAvion(porteAvion);
			pos[4][4]=1;
			pos[4][5]=1;
			pos[4][6]=1;
			pos[4][7]=1;
			
			destructeur = Arrays.asList(new Paire(8,4),new Paire(8,5),new Paire(8,6));
			grille.setDestructeur(destructeur);
			pos[8][4]=1;
			pos[8][5]=1;
			pos[8][6]=1;
			
			sousMarin = Arrays.asList(new Paire(0,7),new Paire(0,8),new Paire(0,9));
			grille.setSousMarin(sousMarin);
			pos[0][7]=1;
			pos[0][8]=1;
			pos[0][9]=1;
		
		
			bateauPatroille = Arrays.asList(new Paire(0,1),new Paire(0,2));
			grille.setBateauPatroille(bateauPatroille);
			pos[0][1]=1;
			pos[0][2]=1;

			grille.setPos(pos);
			
			break;
		case 9:
			porteAvion = Arrays.asList(new Paire(1,5),new Paire(2,5),new Paire(3,5),new Paire(4,5));
			grille.setPorteAvion(porteAvion);
			pos[1][5]=1;
			pos[2][5]=1;
			pos[3][5]=1;
			pos[4][5]=1;
			
			destructeur = Arrays.asList(new Paire(5,7),new Paire(5,8),new Paire(5,9));
			grille.setDestructeur(destructeur);
			pos[5][7]=1;
			pos[5][8]=1;
			pos[5][9]=1;
			
			sousMarin = Arrays.asList(new Paire(9,0),new Paire(9,1),new Paire(9,2));
			grille.setSousMarin(sousMarin);
			pos[9][0]=1;
			pos[9][1]=1;
			pos[9][2]=1;
		
		
			bateauPatroille = Arrays.asList(new Paire(2,1),new Paire(2,2));
			grille.setBateauPatroille(bateauPatroille);
			pos[2][1]=1;
			pos[2][2]=1;

			grille.setPos(pos);
			
			break;
		default:
			
			porteAvion = Arrays.asList(new Paire(1,2),new Paire(1,3),new Paire(1,4),new Paire(1,5));
			grille.setPorteAvion(porteAvion);
			pos[1][2]=1;
			pos[1][3]=1;
			pos[1][4]=1;
			pos[1][5]=1;
			
			destructeur = Arrays.asList(new Paire(3,1),new Paire(4,1),new Paire(5,1));
			grille.setDestructeur(destructeur);
			pos[3][1]=1;
			pos[4][1]=1;
			pos[5][1]=1;
			
			sousMarin = Arrays.asList(new Paire(6,3),new Paire(6,4),new Paire(6,5));
			grille.setSousMarin(sousMarin);
			pos[6][3]=1;
			pos[6][4]=1;
			pos[6][5]=1;
		
			bateauPatroille = Arrays.asList(new Paire(9,1),new Paire(9,2));
			grille.setBateauPatroille(bateauPatroille);
			pos[9][1]=1;
			pos[9][2]=1;

			grille.setPos(pos);
			
			break;
			
		}
		
	//	grille.setBateauPatroille(bateauPatroille);
		
		return grille;

	}
}
