package edu.battleship.modele;

public class Bateau {
	private String nom;
	private String type;
	private int taille;
	private boolean statu;
	private Grille position;
	
	public Bateau() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Bateau(String nom, String type, int taille, boolean statu, Grille position) {
		super();
		this.nom = nom;
		this.type = type;
		this.taille = taille;
		this.statu = statu;
		this.position = position;
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public boolean isStatu() {
		return statu;
	}
	public void setStatu(boolean statu) {
		this.statu = statu;
	}

	public Grille getPosition() {
		return position;
	}

	public void setPosition(Grille position) {
		this.position = position;
	}
	
	
	

	}
