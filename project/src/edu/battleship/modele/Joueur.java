package edu.battleship.modele;

import java.util.List;

/**
 * 
 * @author fabreure
 * Cette classe est un modele du juge
 *
 */

public class Joueur {
	private String nom;
	private int points;
	private List<Bateau> bateaux;
	private Grille grilleNavale;
	private boolean tour;
	private Host host;
	
	public Joueur(String nom, int points, List<Bateau> bateaux, Grille grilleNavale, boolean tour) {
		super();
		this.nom = nom;
		this.points = points;
		this.bateaux = bateaux;
		this.grilleNavale = grilleNavale;
		this.tour = tour;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public List<Bateau> getBateaux() {
		return bateaux;
	}

	public void setBateaux(List<Bateau> bateaux) {
		this.bateaux = bateaux;
	}

	public Grille getGrilleNavale() {
		return grilleNavale;
	}

	public void setGrilleNavale(Grille grilleNavale) {
		this.grilleNavale = grilleNavale;
	}

	public boolean isTour() {
		return tour;
	}

	public void setTour(boolean tour) {
		this.tour = tour;
	}

	public Joueur() {
		// TODO Auto-generated constructor stub
	}

	public Host getHost() {
		return host;
	}

	public void setHost(Host host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "\nJoueur [nom=" + nom + ", points=" + points + ", bateaux=" + bateaux + ", grilleNavale=" + grilleNavale
				+ ", tour=" + tour + ", host=" + host + "]";
	}

}
