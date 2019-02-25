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
		pos = new int[10][10];
		for (int i = 0; i < pos.length; i++) {
			for (int j = 0; j < pos[i].length; j++) {
				pos[i][j] = 0;
			}
		}
	}

	public String print() {
		String var = "{";
		for (int i = 0; i < pos.length; i++) {
			var += "\n[";
			for (int j = 0; j < pos[i].length; j++) {
				var += pos[i][j]+" ";
			}
			var += "]";
		}
		var += "}";
		return var;
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



	@Override
	public String toString() {
		return "\nGrille [pos=" + print() + ", \ndestructeur=" + destructeur + ", \nporteAvion=" + porteAvion
				+ ", \nsousMarin=" + sousMarin + ", \nbateauPatroille=" + bateauPatroille + "]";
	}

}
