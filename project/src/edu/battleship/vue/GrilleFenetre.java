package edu.battleship.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;

import edu.battleship.controller.InfoConn;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

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
	 * Create the frame.
	 */
	private GrilleFenetre() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 800, 450);
		this.setLocationRelativeTo(null);

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
		panneauGrille1.setAlignmentX(CENTER_ALIGNMENT);
		panneauGrille1.setAlignmentY(CENTER_ALIGNMENT);
		//panneauGrille1.getComponentAt(2, 4);
		
		JButton piece;
		ArrayList<JButton> pieces = new ArrayList<JButton>(); 
		String[] lets = {"A","B","C","D","E","F","G","H","I","J"}; 
	    for(int col=1; col < 11; col++) { 
	    	for (String row : lets) {
		    	piece = new JButton(); 
		    	//piece.setText(row + String.valueOf(col));
		    	piece.setToolTipText(row + String.valueOf(col));
		    	piece.setBounds(0,0,30,30); 
//		    	piece.setBackground(Color.green); 
//		    	piece.setOpaque(true);
	    		piece.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/eau35x30.png")));

		    	if(row=="B" && col==2) {
		    		piece.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/splash35x30.png")));
		    	} 
		    	if(row=="D" && col>7) {
		    		piece.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/boom35x30.png")));
		    	} 
		        pieces.add(piece); 
			}
	    }
	    
	    for (JButton j:pieces) { 
		    panneauGrille1.add(j);
	    } 
		
		JPanel panneauGrille2 = new JPanel();
		panneauPrincipale.add(panneauGrille2);
		panneauGrille2.setLayout(new GridLayout(10, 10, 0, 0));
		
		JPanel panneauBoutons = new JPanel();
		contentPane.add(panneauBoutons, BorderLayout.SOUTH);
		panneauBoutons.setLayout(new GridLayout(1, 1, 0, 0));
		
		JButton btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			
			}
		});
		btnFermer.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/fermer1.png")));
		panneauBoutons.add(btnFermer);

		//PANNEAU ENTETE
		JPanel panneauEntete = new JPanel();
		contentPane.add(panneauEntete, BorderLayout.NORTH);
		panneauEntete.setLayout(new GridLayout(0, 2, 0, 0));

		//PANNEAU JOUEUR #1
		JPanel panneauJoueur1 = new JPanel();
		panneauEntete.add(panneauJoueur1);
		panneauJoueur1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblIcon1 = new JLabel("");
		lblIcon1.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/bateaubleu80x30.png")));
		panneauJoueur1.add(lblIcon1);
		
		JLabel lblNomJouer1 = new JLabel("JOUEUR BLEU");
		lblNomJouer1.setForeground(Color.BLUE);
		lblNomJouer1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panneauJoueur1.add(lblNomJouer1);
		
		JLabel lblPointsJouer1 = new JLabel("POINTS: 0/12");
		lblPointsJouer1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panneauJoueur1.add(lblPointsJouer1);

		//PANNEAU JOUEUR #2
		JPanel panneauJoueur2 = new JPanel();
		panneauEntete.add(panneauJoueur2);
		panneauJoueur2.setLayout(new GridLayout(0, 3, 0, 0));

		JLabel lblIcon2 = new JLabel("");
		lblIcon2.setIcon(new ImageIcon(GrilleFenetre.class.getResource("/edu/battleship/vue/bateaurouge80x30.png")));
		panneauJoueur2.add(lblIcon2);

		JLabel lblNomJouer2 = new JLabel("JOUEUR ROUGE");
		lblNomJouer2.setForeground(Color.RED);
		lblNomJouer2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panneauJoueur2.add(lblNomJouer2);
		
		JLabel lblPointsJouer2 = new JLabel("POINTS: 0/12");
		lblPointsJouer2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panneauJoueur2.add(lblPointsJouer2);
	}
}
