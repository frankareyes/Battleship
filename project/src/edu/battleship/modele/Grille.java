package edu.battleship.modele;

public class Grille {
	private int[][] pos;
	
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

	public Grille(int[][] pos) {
		super();
		this.pos = pos;
	}

}
