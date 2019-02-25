package edu.battleship.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.FlowLayout;

import edu.battleship.controller.PartieControleur;
import edu.battleship.modele.Host;
import edu.battleship.modele.Paire;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class Menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contenudePanneau;// panneau de contenu

	/**
	 * Launch the application.
	 */
	public void RunMenu(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public class VentanaConFondo {
		private JFrame vent;// variable vent de tipo JFrame

		public VentanaConFondo() {
			crearVentana();// método que se encarga de crear la Ventana
		}

		private void crearVentana() {

			vent = new JFrame("Ventana de JuegoSoftware.com con fondo");
			// nombre que toma la ventana
			vent.setSize(900, 592);
			// tamaño de la ventana, cogemos el tamaño de la imagen que vamos a poner en el
			// JLabel por lo que hemos explicado más arriba
			vent.setContentPane(new JLabel(new ImageIcon("Imagenes/Img1.jpg")));// añade una imagen a un JLabel para que
																				// aparezca de fondo de la ventana
			vent.setLocationRelativeTo(null);// ventana centrada en pantalla
			vent.getContentPane().setLayout(null);// para que no acomode los elementos y los podamos poner donde
													// queramos en caso de que los hubiera
			vent.setResizable(false);// para que no se pueda cambiar de tamaño la ventana
			vent.setVisible(true);// para que la ventana visible
			vent.setDefaultCloseOperation(vent.EXIT_ON_CLOSE);// para que se cierre al salir
		}

	}

	public Menu() {
		final int ecranLargeur = 800;
		final int ecranHauteur = 450;

		this.setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/edu/battleship/vue/Titre.png")));
		this.setTitle("Battleship Frank-Aissata-Francis");
		this.setBounds(100, 100, ecranLargeur, ecranHauteur);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contenudePanneau = new JPanel();
		contenudePanneau.setBorder(new EmptyBorder(5, 5, 5, 5));
		contenudePanneau.setLayout(new BorderLayout(0, 0));
		this.setContentPane(contenudePanneau);

		 //JPanel panneauFond = new JPanel(); 
		 JLabel panneauFond = new JLabel(new ImageIcon("/edu/battleship/vue/Titre.png"));
		 panneauFond.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		 contenudePanneau.add(panneauFond);

		
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

		


	}
	/*
	 * class EcouteurBouton implements ActionListener {
	 * 
	 * @Override public void actionPerformed(ActionEvent e) { String text =
	 * ((JButton) (e.getSource())).getText();
	 * 
	 * if (text == "Quitter") System.exit(0); else System.out.println("Hello"); } }
	 */

}
