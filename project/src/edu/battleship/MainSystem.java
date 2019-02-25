package edu.battleship;

import edu.battleship.vue.*;
/*import edu.battleship.controller.PartieControleur;
import edu.battleship.modele.Host;
import edu.battleship.modele.Paire;*/

public class MainSystem {
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.RunMenu(null);
/*
		PartieControleur  controleur = new PartieControleur();
		controleur.initGame("Marlon", "standard", new Host(6621, "localhost", true));
		
		System.out.println("Player 1: Le dio algun barco: "+ controleur.playToMachine(new Paire(1, 3)));
		System.out.println("Machine: Le dio algun barco: "+ controleur.machineToPlay());
		
		System.out.println("Player 1: Le dio algun barco: "+ controleur.playToMachine(new Paire(8, 9)));
		System.out.println("Machine: Le dio algun barco: "+ controleur.machineToPlay());
		
		System.out.println("Player 1: Le dio algun barco: "+ controleur.playToMachine(new Paire(1, 5)));
		System.out.println("Machine: Le dio algun barco: "+ controleur.machineToPlay());
		
		System.out.println(controleur.getPlayer());
		
		System.err.println(controleur.getMachine());
		
		System.err.println("\nwinner:\n"+controleur.getWinner());
*/		
		
	}

}
