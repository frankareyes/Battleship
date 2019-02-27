package edu.battleship.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.battleship.controller.InfoConn;

public class GrilleFenetre extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
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
	 * Create the frame.
	 */
	public GrilleFenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panneauPrincipale = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(panneauPrincipale);
		panneauPrincipale.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panneauGrille1 = new JPanel();
		panneauGrille1.setBackground(new Color(255, 255, 255));
		panneauPrincipale.add(panneauGrille1);
		panneauGrille1.setLayout(new GridLayout(10, 10, 0, 0));
		
		JLabel piece;
		ArrayList<JLabel> pieces = new ArrayList<JLabel>(); 

	    for(int i=1; i < 101; i++) { 
	    	piece = new JLabel(""); 

	    	//piece.setText(""+i);
	    	piece.setToolTipText(String.valueOf(i));
	    	piece.setBounds(0,0,25,25); 
//	    	piece.setBackground(Color.green); 
//	    	piece.setOpaque(true);
	    	piece.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/eau2.png")));
	        pieces.add(piece); 
	    }
	    
	    for (JLabel j:pieces) { 
		    panneauGrille1.add(j);
	    } 
		
		JPanel panneauGrille2 = new JPanel();
		panneauPrincipale.add(panneauGrille2);
		panneauGrille2.setLayout(new GridLayout(10, 10, 0, 0));
		
		JPanel panneauBoutons = new JPanel();
		contentPane.add(panneauBoutons, BorderLayout.SOUTH);
		panneauBoutons.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnFermer = new JButton("Fermer");
		btnFermer.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/fermer1.png")));
		panneauBoutons.add(btnFermer);
		
		JPanel panneauEntete = new JPanel();
		contentPane.add(panneauEntete, BorderLayout.NORTH);
		panneauEntete.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panneauJoueur1 = new JPanel();
		panneauEntete.add(panneauJoueur1);
		
		JLabel lblNomJouer1 = new JLabel("nouvelle jouer");
		lblNomJouer1.setForeground(new Color(0, 0, 255));
		lblNomJouer1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panneauJoueur1.add(lblNomJouer1);
		
		JLabel lblPointsJouer1 = new JLabel("Points: 0");
		panneauJoueur1.add(lblPointsJouer1);
		
		JPanel panneauJoueur2 = new JPanel();
		panneauEntete.add(panneauJoueur2);
		
		JLabel lblNomJouer2 = new JLabel("nouvelle jouer");
		lblNomJouer2.setForeground(new Color(255, 0, 0));
		lblNomJouer2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panneauJoueur2.add(lblNomJouer2);
		
		JLabel lblPointsJouer2 = new JLabel("Points: 0");
		panneauJoueur2.add(lblPointsJouer2);
	}
}
