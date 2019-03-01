package edu.battleship.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

import edu.battleship.controller.PartieControleur;
import edu.battleship.modele.Host;
import edu.battleship.modele.Paire;
import edu.battleship.modele.PaireAcepted;

public class GrilleFenetre extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static PartieControleur partieControleur;
	// PIECES DE CHAQUE GRILLE
	JButton piece1, piece2;
	ArrayList<JButton> pieces1 = new ArrayList<JButton>();
	ArrayList<JButton> pieces2 = new ArrayList<JButton>();
	// PROGRESS BARS
	JProgressBar progressBar1 = new JProgressBar(0, 12);
	JProgressBar progressBar2 = new JProgressBar(0, 12);
	//PANNEAU GRILLES
	JPanel panneauGrille1 = new JPanel();
	JPanel panneauGrille2 = new JPanel();

	public static void RunGrille() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					partieControleur = new PartieControleur();
					partieControleur.initGame("Jugador", "standard", new Host(6621, "localhost", true));
					GrilleFenetre frame = new GrilleFenetre();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * DESING OF PANELS Two main panels inside the content panel (one left, one
	 * right), content panel with grid layout 3 more panels inside each main panel
	 * (one for the player info, one for the grid, one for display accions) border
	 * layout player info panel with grid layout grid info panel with grid layout
	 * display action panel with grid layout
	 */
	private GrilleFenetre() {
		// FRAME PROPERTIES
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 800, 470);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setIconImage(
				Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/edu/battleship/vue/Titre.png")));
		this.setTitle("Ecran de Jeux");

		// CONTENT PANNEAU
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(0, 2, 2, 0));
		setContentPane(contentPane);

		// *************************************************************
		// PANNEAU PRINCIPALE GAUCHE
		// *************************************************************
		JPanel panneauPrincipaleGauche = new JPanel();
		panneauPrincipaleGauche.setLayout(new BorderLayout());
		contentPane.add(panneauPrincipaleGauche);

		// PANNEAU JOUEUR #1
		JPanel panneauJoueur1 = new JPanel();
		panneauJoueur1.setLayout(new GridLayout(0, 3, 0, 0));
		panneauPrincipaleGauche.add(panneauJoueur1, BorderLayout.NORTH);

		JLabel lblIcon1 = new JLabel("");
		lblIcon1.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/bateaubleu80x30.png")));
		panneauJoueur1.add(lblIcon1);

		JLabel lblNomJouer1 = new JLabel("JOUEUR BLEU");
		lblNomJouer1.setForeground(Color.BLUE);
		lblNomJouer1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panneauJoueur1.add(lblNomJouer1);

		progressBar1.setForeground(Color.BLUE);
		panneauJoueur1.add(progressBar1);
		progressBar1.setValue(12);

		// PANNEAU GRILLE GAUCHE
		panneauGrille1.setLayout(new GridLayout(10, 10, 0, 0));
		panneauGrille1.setAlignmentX(CENTER_ALIGNMENT);
		panneauGrille1.setAlignmentY(CENTER_ALIGNMENT);
		// panneauGrille1.getComponentAt(2, 4);
		panneauPrincipaleGauche.add(panneauGrille1, BorderLayout.CENTER);

		// PANNEAU ACTION GAUCHE
		JPanel panneauActionGauche = new JPanel();
		panneauActionGauche.setLayout(new GridLayout(1, 1, 0, 0));
		panneauPrincipaleGauche.add(panneauActionGauche, BorderLayout.SOUTH);

		List list1 = new List();
		panneauActionGauche.add(list1);
		// *************************************************************
		// PANNEAU PRINCIPALE DROITE
		// *************************************************************
		// PANNEAU PRINCIPALE DROITE
		JPanel panneauPrincipaleDroite = new JPanel();
		panneauPrincipaleDroite.setLayout(new BorderLayout());
		contentPane.add(panneauPrincipaleDroite);

		// PANNEAU JOUEUR #2
		JPanel panneauJoueur2 = new JPanel();
		panneauJoueur2.setLayout(new GridLayout(0, 3, 0, 0));
		panneauPrincipaleDroite.add(panneauJoueur2, BorderLayout.NORTH);

		JLabel lblIcon2 = new JLabel("");
		lblIcon2.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/bateaurouge80x30.png")));
		panneauJoueur2.add(lblIcon2);

		JLabel lblNomJouer2 = new JLabel("JOUEUR ROUGE");
		lblNomJouer2.setForeground(Color.RED);
		lblNomJouer2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panneauJoueur2.add(lblNomJouer2);

		progressBar2.setForeground(Color.RED);
		panneauJoueur2.add(progressBar2);
		progressBar2.setValue(12);

		// PANNEAU GRILLE DROITE
		panneauGrille2.setLayout(new GridLayout(10, 10, 0, 0));
		panneauGrille2.setAlignmentX(CENTER_ALIGNMENT);
		panneauGrille2.setAlignmentY(CENTER_ALIGNMENT);
		panneauPrincipaleDroite.add(panneauGrille2, BorderLayout.CENTER);

		// PANNEAU ACTION DROITE
		JPanel panneauActionDroite = new JPanel();
		panneauActionDroite.setLayout(new GridLayout(1, 1, 0, 0));
		panneauPrincipaleDroite.add(panneauActionDroite, BorderLayout.SOUTH);

		List list2 = new List();
		panneauActionDroite.add(list2);

		//COMMENCER
		commencerJeu();
	}//end of constructor

	
	private void commencerJeu() {
		int[][] pos = partieControleur.getPlayer().getGrilleNavale().getPos();

		for (int i = 0; i < pos.length; i++) {
			for (int j = 0; j < pos[i].length; j++) {
				piece1 = new JButton();
				piece1.setToolTipText(String.valueOf(i) + String.valueOf(j));
				piece1.setBounds(0, 0, 30, 30);
				if (pos[i][j] == 1) {
					piece1.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/ship35x30.png")));
				} else {
					piece1.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/eau35x30.png")));
				}
				pieces1.add(piece1);
			}
		}
		EcouteurBouton ecouteur = new EcouteurBouton();

		pos = partieControleur.getMachine().getGrilleNavale().getPos();
		for (int i = 0; i < pos.length; i++) {
			for (int j = 0; j < pos[i].length; j++) {
				piece2 = new JButton();
				piece2.setBounds(0, 0, 30, 30);
				piece2.setToolTipText(String.valueOf(i) + String.valueOf(j));
				piece2.addActionListener(ecouteur);
				piece2.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/eau35x30.png")));
				pieces2.add(piece2);
			}
		}
		for (JButton j : pieces1) {
			panneauGrille1.add(j);
		}

		for (JButton k : pieces2) {
			panneauGrille2.add(k);
		}
		
	}
	
	
	private Paire getPaire(String pair) {
		int x = Integer.valueOf(pair.substring(0, 1));
		int y = Integer.valueOf(pair.substring(1));
		//print the coord
		// System.out.println(x + " - " + y);
		return new Paire(x, y);
	}
	private void setWinner(JPanel panneau) {
		panneau.removeAll();
		panneau.updateUI();
		EcouteurBoutonWinner ecouteurWinner = new EcouteurBoutonWinner();
		JButton btnWinner = new JButton("Appuyez ici pour redémarrer");
		panneau.add(btnWinner);
		btnWinner.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/winner150x120.png")));
		btnWinner.addActionListener(ecouteurWinner);
		panneau.setLayout(new GridLayout(1, 1, 0, 0));
		panneau.updateUI();

	}
	
	private void jeuContreOrdinateur() {

		PaireAcepted paireAcepted = partieControleur.machineToPlay();
		String coordBtn;
		String coord;
		boolean isEqual;
		
		if (paireAcepted.isHit()) {
				partieControleur.getPlayer().getGrilleNavale().getPos()[paireAcepted.getX()][paireAcepted.getY()] = 2;
				partieControleur.getPlayer().setPoints(partieControleur.getPlayer().getPoints());

				for (JButton btn : pieces1) {
					coordBtn = btn.getToolTipText();
					coord = String.valueOf(paireAcepted.getX())+String.valueOf(paireAcepted.getY());
					isEqual = coordBtn.equals(coord);
					if (isEqual) {
						btn.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/boom35x30.png")));
						btn.repaint();
					}
					progressBar2.setValue(partieControleur.getPlayer().getPoints());

				}
				if (partieControleur.getPlayer().getPoints()==0) {
					setWinner(panneauGrille1);
				}

		}//end of if 
		else {
				partieControleur.getPlayer().getGrilleNavale().getPos()[paireAcepted.getX()][paireAcepted.getY()] = -1;

				for (JButton btn : pieces1) {
					coordBtn = btn.getToolTipText();
					coord = String.valueOf(paireAcepted.getX())+String.valueOf(paireAcepted.getY());
					isEqual = coordBtn.equals(coord);	
					if (isEqual) {
						btn.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/splash35x30.png")));
						btn.repaint();
					}
				}//end of for
		}//end of else
	}
	//*************************************
	// LISTENERS
	//*************************************
	/**
	 * Action listener for the winner button
	 * @author fabreure
	 *
	 */
	class EcouteurBoutonWinner implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
	/**
	 * Action Listener for buttons on the grid
	 * @author fabreure
	 *
	 */
	class EcouteurBouton implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String text = ((JButton) (e.getSource())).getToolTipText();
			Paire par = getPaire(text);
			
			if (partieControleur.playToMachine(par)) {
				((JButton) (e.getSource()))
						.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/boom35x30.png")));
				((JButton) (e.getSource())).repaint();
				partieControleur.getMachine().getGrilleNavale().getPos()[par.getX()][par.getY()] = 2;
				partieControleur.getMachine().setPoints(partieControleur.getMachine().getPoints());
				progressBar1.setValue(partieControleur.getMachine().getPoints());
				
				if (partieControleur.getMachine().getPoints()== 0) {
					setWinner(panneauGrille2);
				}

			} else {
					((JButton) (e.getSource())).setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/splash35x30.png")));
					((JButton) (e.getSource())).repaint();
					partieControleur.getMachine().getGrilleNavale().getPos()[par.getX()][par.getY()] = -1;
			}

				jeuContreOrdinateur();
			}
		}//end of class Ecouteur Bouton
	}//end of class grille fenetre
