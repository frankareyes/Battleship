package edu.battleship.vue;

import java.awt.*;
/*import java.awt.color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
*/
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuPrincipale {
	
	private JFrame window;
	private ImageIcon imagedeFond;
	private JLabel imageConteneur;
	private JButton demarrerJeu;
	private JButton configuration;
	private volatile boolean isImageVisible;
	
	public MenuPrincipale(JFrame fenetre){
		window = fenetre;
		imagedeFond = new ImageIcon("images/ressources/battleshipTitre.png");
		imageConteneur = new JLabel(imagedeFond);
		isImageVisible = true;
	}
	
		
		demarrerJeu.setVisible(true);
		
		window.getContentPane().add(errorMessage);
		window.getContentPane().add(demarrerJeu);
		window.getContentPane().add(imageConteneur);
		
		window.getContentPane().setBackground(Color.BLACK);
		window.setVisible(true);
		window.getContentPane().revalidate();
		window.getContentPane().repaint();
	}

	public boolean isImageVisible(){
		return isImageVisible;
	}
	
}
