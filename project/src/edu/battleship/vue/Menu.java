package edu.battleship.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import edu.battleship.controller.PartieControleur;
import edu.battleship.modele.Host;
import edu.battleship.modele.Paire;

public class Menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int ecranLargeur = 800;
	private final int ecranHauteur = 550;

	/**
	 * Launch the application.
	 */
	public void RunMenu(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					//frame.setContentPane(new JLabel(new ImageIcon("/edu/battleship/vue/Titre.png")));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Constructor
	 * @throws IOException 
	 */


	//Constructor
	public Menu() {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/edu/battleship/vue/Titre.png")));
		this.setTitle("Battleship Frank-Aissata-Francis");
		this.setBounds(0, 0, ecranLargeur, ecranHauteur);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contenudePanneau = new JPanel();
		contenudePanneau.setLayout(new BorderLayout(0, 0));
		//setOpacity(1);

		//Image de Fond
		ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/edu/battleship/vue/Titre.png")));
		JLabel contenudeFond = new JLabel("",img,JLabel.CENTER);
		//contenudeFond.setSize(ecranLargeur, ecranHauteur);
		contenudeFond.setBounds(0, 0, 800, 450); 
		contenudeFond.setVisible(true);
		contenudePanneau.add(contenudeFond);
		
		 //Panneau de Boutons
		JPanel panneauBoutons = new JPanel();
		contenudePanneau.add(panneauBoutons, BorderLayout.SOUTH);

		//Button Jouer contre l ordinateur
		JButton btnDemarrerJeu = new JButton("Jouer contre l'ordinateur");
		btnDemarrerJeu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PartieControleur controleur = new PartieControleur();
				controleur.initGame("Marlon", "standard", new Host(6621, "localhost", true));

				System.out.println("Player 1: Le dio algun barco: " + controleur.playToMachine(new Paire(1, 3)));
				System.out.println("Machine: Le dio algun barco: " + controleur.machineToPlay());

				System.out.println("Player 1: Le dio algun barco: " + controleur.playToMachine(new Paire(8, 9)));
				System.out.println("Machine: Le dio algun barco: " + controleur.machineToPlay());

				System.out.println("Player 1: Le dio algun barco: " + controleur.playToMachine(new Paire(1, 5)));
				System.out.println("Machine: Le dio algun barco: " + controleur.machineToPlay());

				System.out.println(controleur.getPlayer());

				System.err.println(controleur.getMachine());

				System.err.println("\nwinner:\n" + controleur.getWinner());
			}
		});
		btnDemarrerJeu.setIcon(new ImageIcon(Menu.class.getResource("/edu/battleship/vue/ordinateur1.png")));
		btnDemarrerJeu.setVerticalAlignment(SwingConstants.BOTTOM);

		//Bouton jouer contre un autre joueur
		JButton btnConfiguration = new JButton("Jouer contre un autre Joueur");
		btnConfiguration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnConfiguration.setIcon(new ImageIcon(Menu.class.getResource("/edu/battleship/vue/personne1.png")));

		//Bouton fermer
		JButton btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});

		btnFermer.setIcon(new ImageIcon(Menu.class.getResource("/edu/battleship/vue/fermer1.png")));
		panneauBoutons.setLayout(new GridLayout(0, 3, 0, 0));
		panneauBoutons.add(btnDemarrerJeu);
		panneauBoutons.add(btnConfiguration);
		panneauBoutons.add(btnFermer);

	    Menu.setDefaultLookAndFeelDecorated(true);

		this.setContentPane(contenudePanneau);
		

	}

}
