package edu.battleship.vue;

import java.awt.EventQueue;
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

	private JPanel contentPane;
	private JTextField txtIP;
	private JTextField txtPort;
	private EMODE modeConn;
	
	public void modeConn(EMODE mode) {
		this.modeConn=mode;
	}
	
	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoConexionFenetre frame = new InfoConexionFenetre();
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
	public InfoConexionFenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 255);
		this.setLocationRelativeTo(null);
		this.setTitle(String.valueOf(modeConn));
		System.out.println(modeConn);
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

		if(this.modeConn == EMODE.SERVEUR) {
			txtIP.setText("n est pas necessaire");
			txtIP.setEnabled(false);
		} else {
			txtIP.setText("");
			txtIP.setEnabled(true);
		}
		

		JPanel panneauBoutons = new JPanel();
		contentPane.add(panneauBoutons);
		
		JButton btnSoumettre = new JButton("Soumettre");
		btnSoumettre.setIcon(new ImageIcon(InfoConexionFenetre.class.getResource("/edu/battleship/vue/submit1.png")));
		btnSoumettre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InfoConn conn = new InfoConn(modeConn,Integer.valueOf(txtPort.getText()),txtIP.getText());
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
