package edu.battleship.modele;

import java.util.List;

public class Grille {
	private int[][] pos;
	private List<Paire> destructeur;
	private List<Paire> porteAvion;
	private List<Paire> sousMarin;
	private List<Paire> bateauPatroille;
	


	/*
	 * public Grille(int[][] pos, List<Paire> destructeur, List<Paire> porteAvion,
	 * List<Paire> sousMarin, List<Paire> bateauPatroille) { super(); this.pos =
	 * pos; this.destructeur = destructeur; this.porteAvion = porteAvion;
	 * this.sousMarin = sousMarin; this.bateauPatroille = bateauPatroille; }
	 */


	public Grille() {
		int[][] grille = new int[10][10];
		for (int i = 0; i < grille.length; i++) {
			for (int j = 0; j < grille[i].length; j++) {
				grille[i][j] = 0;
			}
		}
	}



	public int[][] getPos() {
		return pos;
	}



	public void setPos(int[][] pos) {
		this.pos = pos;
	}



	public List<Paire> getDestructeur() {
		return destructeur;
	}



	public void setDestructeur(List<Paire> destructeur) {
		this.destructeur = destructeur;
	}



	public List<Paire> getPorteAvion() {
		return porteAvion;
	}



	public void setPorteAvion(List<Paire> porteAvion) {
		this.porteAvion = porteAvion;
	}



	public List<Paire> getSousMarin() {
		return sousMarin;
	}



	public void setSousMarin(List<Paire> sousMarin) {
		this.sousMarin = sousMarin;
	}



	public List<Paire> getBateauPatroille() {
		return bateauPatroille;
	}



	public void setBateauPatroille(List<Paire> bateauPatroille) {
		this.bateauPatroille = bateauPatroille;
	}

}
