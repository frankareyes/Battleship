package edu.battleship.modele;

import java.util.HashSet;

public class Grille {
	private int[][] pos;
	private HashSet<Paire> hashPaires;
	
	public HashSet<Paire> getHashPaires() {
		return hashPaires;
	}

	public void setHashPaires(HashSet<Paire> hashPaires) {
		this.hashPaires = hashPaires;
	}

	public int[][] getPos() {
		return pos;
	}

	public void setPos(int[][] pos) {
		this.pos = pos;
	}

	public Grille() {
		int[][] grille = new int[10][10];
		for (int i = 0; i < grille.length; i++) {
			for (int j = 0; j < grille[i].length; j++) {
				grille[i][j] = 0;
			}
		}
	}

	public Grille(int[][] pos, HashSet<Paire> hashPaires) {
		super();
		this.pos = pos;
		this.hashPaires = hashPaires;
	}


}
