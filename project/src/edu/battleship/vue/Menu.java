package edu.battleship.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panneauBoutons = new JPanel();
		contentPane.add(panneauBoutons, BorderLayout.SOUTH);
		
		JButton btnDemarrerJeu = new JButton("Jouer contre l'ordinateur");
		btnDemarrerJeu.setVerticalAlignment(SwingConstants.BOTTOM);
		panneauBoutons.add(btnDemarrerJeu);
		
		JButton btnConfiguration = new JButton("Jouer contre un autre Joueur");
		panneauBoutons.add(btnConfiguration);
		
		JButton btnFermer = new JButton("Fermer");
		panneauBoutons.add(btnFermer);
		
		//JPanel panneauFond = new JPanel();
		JPanel panneauFond = new PanneauFond();
		contentPane.add(panneauFond, BorderLayout.CENTER);
	    
	    
	}

	public class PanneauFond extends JPanel{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private URL url = getClass().getResource("/images/ressources/Titre.png");
	    Image image = new ImageIcon(url).getImage();
	    @Override
	    public void paint(Graphics g){
	        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	        
	        super.paint(g);
	    }
	}
	
	
}
