/**
 * This is for creates coordenades
 */
package edu.battleship.modele;

public class Paire {
	
	private int X;
	private int Y;
	
	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + X;
		//result = prime * result + Y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paire other = (Paire) obj;
		if (X != other.X)
			return false;
		if (Y != other.Y)
			return false;
		return true;
	}

	public Paire(int x, int y) {
		super();
		X = x;
		Y = y;
	}

	public Paire() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Paire [X=" + X + ", Y=" + Y + "]";
	}

}
