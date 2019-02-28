package edu.battleship.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import java.awt.List;

public class GrilleFenetre extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void RunGrille() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GrilleFenetre frame = new GrilleFenetre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * DESING OF PANELS
	 * Two main panels inside the content panel (one left, one right), content panel with grid layout
	 * 3 more panels inside each main panel (one for the player info, one for the grid, one for display accions) border layout
	 * player info panel with grid layout
	 * grid info panel with grid layout
	 * display action panel with grid layout
	 */
	private GrilleFenetre() {
		//FRAME PROPERTIES
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 800, 470);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		//CONTENT PANNEAU
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(0, 2, 2, 0));
		setContentPane(contentPane);
		
		//*************************************************************
		//PANNEAU PRINCIPALE GAUCHE
		//*************************************************************
		JPanel panneauPrincipaleGauche = new JPanel();
		panneauPrincipaleGauche.setLayout(new BorderLayout());
		contentPane.add(panneauPrincipaleGauche);

		//PANNEAU JOUEUR #1
		JPanel panneauJoueur1 = new JPanel();
		panneauJoueur1.setLayout(new GridLayout(0, 3, 0, 0));
		panneauPrincipaleGauche.add(panneauJoueur1,BorderLayout.NORTH);
		
		JLabel lblIcon1 = new JLabel("");
		lblIcon1.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/bateaubleu80x30.png")));
		panneauJoueur1.add(lblIcon1);
		
		JLabel lblNomJouer1 = new JLabel("JOUEUR BLEU");
		lblNomJouer1.setForeground(Color.BLUE);
		lblNomJouer1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panneauJoueur1.add(lblNomJouer1);
		
		//JLabel lblPointsJouer1 = new JLabel("POINTS: 0/12");
		//lblPointsJouer1.setFont(new Font("Tahoma", Font.BOLD, 12));
		//panneauJoueur1.add(lblPointsJouer1);
		JProgressBar progressBar1 = new JProgressBar(0, 12);
		progressBar1.setForeground(Color.BLUE);
		panneauJoueur1.add(progressBar1);
		progressBar1.setValue(3);
	
		//PANNEAU GRILLE GAUCHE
		JPanel panneauGrille1 = new JPanel();
		panneauGrille1.setLayout(new GridLayout(10, 10, 0, 0));
		panneauGrille1.setAlignmentX(CENTER_ALIGNMENT);
		panneauGrille1.setAlignmentY(CENTER_ALIGNMENT);
		//panneauGrille1.getComponentAt(2, 4);
		panneauPrincipaleGauche.add(panneauGrille1,BorderLayout.CENTER);
		
		//PANNEAU ACTION GAUCHE
		JPanel panneauActionGauche = new JPanel();
		panneauActionGauche.setLayout(new GridLayout(1, 1, 0, 0));
		panneauPrincipaleGauche.add(panneauActionGauche, BorderLayout.SOUTH);
		
		List list1 = new List();
		panneauActionGauche.add(list1);
		//*************************************************************
		//PANNEAU PRINCIPALE DROITE
		//*************************************************************
		//PANNEAU PRINCIPALE DROITE
		JPanel panneauPrincipaleDroite = new JPanel();
		panneauPrincipaleDroite.setLayout(new BorderLayout());
		contentPane.add(panneauPrincipaleDroite);

		//PANNEAU JOUEUR #2
		JPanel panneauJoueur2 = new JPanel();
		panneauJoueur2.setLayout(new GridLayout(0, 3, 0, 0));
		panneauPrincipaleDroite.add(panneauJoueur2,BorderLayout.NORTH);

		JLabel lblIcon2 = new JLabel("");
		lblIcon2.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/bateaurouge80x30.png")));
		panneauJoueur2.add(lblIcon2);

		JLabel lblNomJouer2 = new JLabel("JOUEUR ROUGE");
		lblNomJouer2.setForeground(Color.RED);
		lblNomJouer2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panneauJoueur2.add(lblNomJouer2);
		
//		JLabel lblPointsJouer2 = new JLabel("POINTS: 0/12");
//		lblPointsJouer2.setFont(new Font("Tahoma", Font.BOLD, 12));
//		panneauJoueur2.add(lblPointsJouer2);
		JProgressBar progressBar2 = new JProgressBar(0, 12);
		progressBar2.setForeground(Color.RED);
		panneauJoueur2.add(progressBar2);
		progressBar2.setValue(8);
		
	    //PANNEAU GRILLE DROITE
		JPanel panneauGrille2 = new JPanel();
		panneauGrille2.setLayout(new GridLayout(10, 10, 0, 0));
		panneauGrille2.setAlignmentX(CENTER_ALIGNMENT);
		panneauGrille2.setAlignmentY(CENTER_ALIGNMENT);
		panneauPrincipaleDroite.add(panneauGrille2,BorderLayout.CENTER);

		//PANNEAU ACTION DROITE
		JPanel panneauActionDroite = new JPanel();
		panneauActionDroite.setLayout(new GridLayout(1, 1, 0, 0));
		panneauPrincipaleDroite.add(panneauActionDroite, BorderLayout.SOUTH);

		List list2 = new List();
		panneauActionDroite.add(list2);

		//PIECES DE CHAQUE GRILLE
		JButton piece1, piece2; 
		ArrayList<JButton> pieces1 = new ArrayList<JButton>();
		ArrayList<JButton> pieces2 = new ArrayList<JButton>();
		String[] rows = {"A","B","C","D","E","F","G","H","I","J"}; 
	    for(int col=1; col < 11; col++) { 
	    	for (String row : rows) {
		    	piece1 = new JButton(); 
		    	piece1.setToolTipText(row + String.valueOf(col));
		    	piece1.setBounds(0,0,30,30); 
	    		piece1.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/eau35x30.png")));
	    		pieces1.add(piece1);

		    	piece2 = new JButton(); 
		    	piece2.setToolTipText(row + String.valueOf(col));
		    	piece2.setBounds(0,0,30,30); 
	    		piece2.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/eau35x30.png")));
		        pieces2.add(piece2);
			}
	    }
	    
	    for (JButton j:pieces1) { 
		    panneauGrille1.add(j);
	    } 
	    for (JButton k:pieces2) { 
		    panneauGrille2.add(k);
	    } 

	}
}
