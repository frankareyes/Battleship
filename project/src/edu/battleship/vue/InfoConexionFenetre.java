/**
 * This request the parameters of connection
 */

package edu.battleship.vue;

//import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import edu.battleship.controller.InfoConn;
import edu.battleship.controller.InfoConn.EMODE;
import javax.swing.ImageIcon;

public class InfoConexionFenetre extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIP;
	private JTextField txtPort;
	private EMODE modeConn;
	
	/**
	 * Create the frame.
	 */
	public InfoConexionFenetre(boolean isServeur) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 302, 255);
		this.setTitle("Info Conexion");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panneauPort = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panneauPort.getLayout();
		contentPane.add(panneauPort);
		
		JLabel lblPort = new JLabel("Port..:");
		panneauPort.add(lblPort);
		
		txtPort = new JTextField();
		panneauPort.add(txtPort);
		txtPort.setColumns(10);

		JPanel panneauIP = new JPanel();
		contentPane.add(panneauIP);
		panneauIP.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JLabel lblIp = new JLabel("IP..:");
		panneauIP.add(lblIp);
		
		txtIP = new JTextField();
		txtIP.setHorizontalAlignment(SwingConstants.LEFT);
		panneauIP.add(txtIP);
		txtIP.setColumns(15);
		if(isServeur) {
			txtIP.setText("0.0.0.0");
			txtIP.setEnabled(false);
			modeConn=EMODE.SERVEUR;
		} else {
			txtIP.setText("");
			txtIP.setEnabled(true);
			modeConn=EMODE.CLIENT;
		}
		

		JPanel panneauBoutons = new JPanel();
		contentPane.add(panneauBoutons);
		
		JButton btnSoumettre = new JButton("Soumettre");
		btnSoumettre.setIcon(new ImageIcon(InfoConexionFenetre.class.getResource("/edu/battleship/vue/submit1.png")));
		btnSoumettre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InfoConn conn = new InfoConn(modeConn,Integer.valueOf(txtPort.getText()),txtIP.getText());
				conn.Affichier();
				setVisible(false);
				dispose(); 

			}
		});
		panneauBoutons.setLayout(new GridLayout(0, 2, 0, 0));
		panneauBoutons.add(btnSoumettre);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setIcon(new ImageIcon(InfoConexionFenetre.class.getResource("/edu/battleship/vue/fermer1.png")));
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose(); 
			}
		});
		panneauBoutons.add(btnAnnuler);
	}

}
