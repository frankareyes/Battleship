package edu.battleship.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import edu.battleship.modele.Host;
import edu.battleship.modele.Joueur;
import edu.battleship.modele.Paire;
import edu.battleship.modele.PaireAcepted;

public class PartieControleur {
	
	private Joueur player;
	private Joueur machine;
	private Joueur remotePleyer;
	private String winner;
	private List<Paire> machinePaires;
		
public PartieControleur() {
	// TODO Auto-generated constructor stub
	winner = "No One";
}
	
	
	public void initGame(String nomJoueur, String mode, Host host) {
		player = new CreerJoueurControleur().creerJoueur(nomJoueur, null);
		if (mode.contentEquals("standard")) {
			machine = new CreerJoueurControleur().creerJoueur("Machine", null);
			machinePaires = fillmachinePaires();
		}else {
			remotePleyer = new CreerJoueurControleur().creerJoueur("remotePleyer", host);
		}
			
	}
	
	private List<Paire> fillmachinePaires() {
		List<Paire>  paires = new ArrayList<>();
		for (int i = 0; i < machine.getGrilleNavale().getPos().length; i++) {
			for (int j = 0; j < machine.getGrilleNavale().getPos()[i].length; j++) {
				paires.add(new Paire(i, j));
			}
		}
		return paires;
	}


	public boolean playToMachine(Paire paire) {
		boolean hit= false;
		if(machine.getGrilleNavale().getPos()[paire.getX()][paire.getY()]==1) {
			machine.getGrilleNavale().getPos()[paire.getX()][paire.getY()]=2;

			hit = true;
			machine.setPoints(machine.getPoints()-1);
			if (machine.getPoints()==0) {
				winner = player.getNom();
			}
		}else {
			machine.getGrilleNavale().getPos()[paire.getX()][paire.getY()] =-1;

		}
		
		return hit;
	}
	
/*	
	public boolean machineToPlay() {
		boolean hit= false;
		int index = ThreadLocalRandom.current().nextInt(0, machinePaires.size());
		
		Paire paire = machinePaires.get(index);
		machinePaires.remove(paire);
		if(player.getGrilleNavale().getPos()[paire.getX()][paire.getY()]==1) {
			player.getGrilleNavale().getPos()[paire.getX()][paire.getY()] =2;
			hit = true;
			player.setPoints(player.getPoints()-1);
			if (player.getPoints()==0) {
				winner = machine.getNom();
			}
		}else {
			player.getGrilleNavale().getPos()[paire.getX()][paire.getY()] =-1;
		}
		
		return hit;
	}
*/	
	public PaireAcepted machineToPlay() {
		  boolean hit= false;
		  int index = ThreadLocalRandom.current().nextInt(0, machinePaires.size());
		  
		  Paire paire = machinePaires.get(index);
		  machinePaires.remove(paire);
		  if(player.getGrilleNavale().getPos()[paire.getX()][paire.getY()]==1) {
		   player.getGrilleNavale().getPos()[paire.getX()][paire.getY()] =2;
		   hit = true;
		   player.setPoints(player.getPoints()-1);
		   if (player.getPoints()==0) {
		    winner = machine.getNom();
		   }
		  }else {
		   player.getGrilleNavale().getPos()[paire.getX()][paire.getY()] =-1;
		  }
		  
		  return new PaireAcepted(paire.getX(), paire.getY(), hit);
		  
		 }
	
	public Joueur getPlayer() {
		return player;
	}


	public Joueur getMachine() {
		return machine;
	}


	public Joueur getRemotePleyer() {
		return remotePleyer;
	}


	public String getWinner() {
		return winner;
	}

}
