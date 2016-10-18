package me.lorenz;

import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

public class LorenzGUI {

	//TODO: Finish documentation
		private JScrollBar scrollBar = new JScrollBar();
		private JButton btnAbout = new JButton("About");
		private JTextArea pins = new JTextArea();
		private JButton btnRandom = new JButton("Random");
		private JTextArea cipherText = new JTextArea();
		private JLabel lblChi5C = new JLabel("0");
		private JLabel lblChi4C = new JLabel("0");
		private JLabel lblChi3C = new JLabel("0");
		private JLabel lblChi2C = new JLabel("0");
		private JLabel lblChi1C = new JLabel("0");
		private JLabel lblMu1C = new JLabel("0");
		private JLabel lblMu2C = new JLabel("0");
		private JLabel lblPsi1C = new JLabel("0");
		private JLabel lblPsi2C = new JLabel("0");
		private JLabel lblPsi3C = new JLabel("0");
		private JLabel lblPsi4C = new JLabel("0");
		private JLabel lblPsi5C = new JLabel("0");
		private JTextArea plainText = new JTextArea();
		private JLabel lblPsi1 = new JLabel("Psi 1");
		private JLabel lblPsi2 = new JLabel("Psi 2");
		private JLabel lblPsi3 = new JLabel("Psi 3");
		private JLabel lblPsi4 = new JLabel("Psi 4");
		private JLabel lblPsi5 = new JLabel("Psi 5");
		private JLabel lblChi5 = new JLabel("Chi 5");
		private JLabel lblChi4 = new JLabel("Chi 4");
		private JLabel lblChi3 = new JLabel("Chi 3");
		private JLabel lblChi2 = new JLabel("Chi 2");
		private JLabel lblChi1 = new JLabel("Chi 1");
		private JLabel lblMu1 = new JLabel("Mu1");
		private JLabel lblMu2 = new JLabel("Mu2");
		private JLabel lblCipherText = new JLabel("Cipher text");
		private JLabel lblPlainText = new JLabel("Plain text");
		private JFrame frame = new JFrame();
		
		
		/**
		 * In charge of putting all constraints to components
		 */
		public void guiLayout() {
			frame.setIconImage(Toolkit.getDefaultToolkit().getImage(LorenzGUI.class.getResource("/images/Icon.png")));
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(900, 900);
			frame.setTitle("Lorenz");
			SpringLayout springLayout = new SpringLayout();
			frame.getContentPane().setLayout(springLayout);
			guiSettings();
			textConstraints(springLayout);
			buttonConstraints(springLayout);
			labelsConstraints(springLayout);
		}
		
		/**
		 * Puts constraints and adds all of the JTextArea's used in the GUI.
		 * 
		 * @param springLayout - layout used
		 */
		private void textConstraints(SpringLayout springLayout) {
			//Puts constraints for and adds plainText
			springLayout.putConstraint(SpringLayout.SOUTH, lblPlainText, -6, SpringLayout.NORTH, plainText);
			springLayout.putConstraint(SpringLayout.NORTH, plainText, 219, SpringLayout.SOUTH, lblMu1C);
			springLayout.putConstraint(SpringLayout.WEST, plainText, 0, SpringLayout.WEST, lblPsi1);
			springLayout.putConstraint(SpringLayout.SOUTH, plainText, 504, SpringLayout.SOUTH, lblPsi1C);
			springLayout.putConstraint(SpringLayout.EAST, plainText, 0, SpringLayout.EAST, lblMu1C);
			frame.getContentPane().add(plainText);
			
			
			//Puts constraints for and adds cipherText
			springLayout.putConstraint(SpringLayout.SOUTH, lblCipherText, -6, SpringLayout.NORTH, cipherText);
			springLayout.putConstraint(SpringLayout.NORTH, cipherText, 0, SpringLayout.NORTH, plainText);
			springLayout.putConstraint(SpringLayout.WEST, cipherText, 33, SpringLayout.WEST, lblMu2C);
			springLayout.putConstraint(SpringLayout.SOUTH, cipherText, 504, SpringLayout.SOUTH, lblChi5C);
			springLayout.putConstraint(SpringLayout.EAST, cipherText, 0, SpringLayout.EAST, frame.getContentPane());
			frame.getContentPane().add(cipherText);
			
			
			//Puts constraints for and adds pins
			springLayout.putConstraint(SpringLayout.NORTH, pins, 45, SpringLayout.SOUTH, plainText);
			springLayout.putConstraint(SpringLayout.WEST, pins, 10, SpringLayout.WEST, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, pins, -21, SpringLayout.SOUTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, pins, 0, SpringLayout.EAST, lblMu1C);
			frame.getContentPane().add(pins);
			
			//Puts constraints for and adds pins
			springLayout.putConstraint(SpringLayout.NORTH, keys, 45, SpringLayout.SOUTH, cipherText);
			springLayout.putConstraint(SpringLayout.WEST, keys, 81, SpringLayout.EAST, pins);
			springLayout.putConstraint(SpringLayout.SOUTH, keys, -1, SpringLayout.NORTH, btnAbout);
			springLayout.putConstraint(SpringLayout.EAST, keys, 0, SpringLayout.EAST, btnAbout);
			frame.getContentPane().add(keys);
		}
		
		/**
		 * Puts constraints and adds all JButton's in the GUI
		 * 
		 * @param springLayout - layout used
		 */
		private void buttonConstraints(SpringLayout springLayout) {
			//Puts constraints for and adds btnRandom
			springLayout.putConstraint(SpringLayout.WEST, btnRandom, 0, SpringLayout.WEST, lblPsi2);
			springLayout.putConstraint(SpringLayout.SOUTH, btnRandom, -6, SpringLayout.NORTH, pins);
			frame.getContentPane().add(btnRandom);
			
			//Puts constraints for and adds btnAbout
			springLayout.putConstraint(SpringLayout.SOUTH, btnAbout, 0, SpringLayout.SOUTH, pins);
			springLayout.putConstraint(SpringLayout.EAST, btnAbout, 0, SpringLayout.EAST, lblChi5);
			frame.getContentPane().add(btnAbout);
		}
		
		/**
		 * Puts constraints and adds all of the JLabel's used in the GUI
		 * 
		 * @param springLayout - layout used
		 */
		private void labelsConstraints(SpringLayout springLayout) {
			//Puts constraints for and adds lblPins
			JLabel lblPins = new JLabel("Pins");
			springLayout.putConstraint(SpringLayout.WEST, lblPins, 0, SpringLayout.WEST, lblPsi1);
			springLayout.putConstraint(SpringLayout.SOUTH, lblPins, -6, SpringLayout.NORTH, pins);
			frame.getContentPane().add(lblPins);
			
			
			//Puts constraints for and adds lblPsi1
			springLayout.putConstraint(SpringLayout.NORTH, lblPsi1, 10, SpringLayout.NORTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.WEST, lblPsi1, 10, SpringLayout.WEST, frame.getContentPane());
			frame.getContentPane().add(lblPsi1);
			
			
			//Puts constraints for and adds lblPsi2
			springLayout.putConstraint(SpringLayout.NORTH, lblPsi2, 0, SpringLayout.NORTH, lblPsi1);
			springLayout.putConstraint(SpringLayout.WEST, lblPsi2, 6, SpringLayout.EAST, lblPsi1);
			frame.getContentPane().add(lblPsi2);
			
			
			//Puts constraints for and adds lblPsi3
			springLayout.putConstraint(SpringLayout.NORTH, lblPsi3, 0, SpringLayout.NORTH, lblPsi1);
			springLayout.putConstraint(SpringLayout.WEST, lblPsi3, 6, SpringLayout.EAST, lblPsi2);
			frame.getContentPane().add(lblPsi3);
			
			
			//Puts constraints for and adds lblPsi4
			springLayout.putConstraint(SpringLayout.NORTH, lblPsi4, 0, SpringLayout.NORTH, lblPsi1);
			springLayout.putConstraint(SpringLayout.WEST, lblPsi4, 6, SpringLayout.EAST, lblPsi3);
			frame.getContentPane().add(lblPsi4);
			//01110 10000 10010 01110 10101 11001 11111 11100 11111
			
			
			//Puts constraints for and adds lblPsi5
			springLayout.putConstraint(SpringLayout.NORTH, lblPsi5, 0, SpringLayout.NORTH, lblPsi1);
			springLayout.putConstraint(SpringLayout.WEST, lblPsi5, 6, SpringLayout.EAST, lblPsi4);
			frame.getContentPane().add(lblPsi5);
			
			
			//Puts constraints for and adds lblChi5
			springLayout.putConstraint(SpringLayout.NORTH, lblChi5, 0, SpringLayout.NORTH, lblPsi1);
			springLayout.putConstraint(SpringLayout.EAST, lblChi5, -10, SpringLayout.EAST, frame.getContentPane());
			frame.getContentPane().add(lblChi5);
			
			
			//Puts constraints for and adds lblChi4
			springLayout.putConstraint(SpringLayout.NORTH, lblChi4, 0, SpringLayout.NORTH, lblPsi1);
			springLayout.putConstraint(SpringLayout.EAST, lblChi4, -6, SpringLayout.WEST, lblChi5);
			frame.getContentPane().add(lblChi4);
			
			
			//Puts constraints for and adds lblChi3
			springLayout.putConstraint(SpringLayout.SOUTH, lblChi3, 0, SpringLayout.SOUTH, lblPsi1);
			springLayout.putConstraint(SpringLayout.EAST, lblChi3, -6, SpringLayout.WEST, lblChi4);
			frame.getContentPane().add(lblChi3);
			
			
			//Puts constraints for and adds lblChi2
			springLayout.putConstraint(SpringLayout.NORTH, lblChi2, 0, SpringLayout.NORTH, lblPsi1);
			springLayout.putConstraint(SpringLayout.EAST, lblChi2, -6, SpringLayout.WEST, lblChi3);
			frame.getContentPane().add(lblChi2);
			
			
			//Puts constraints for and adds lblChi1
			springLayout.putConstraint(SpringLayout.SOUTH, lblChi1, 0, SpringLayout.SOUTH, lblPsi1);
			springLayout.putConstraint(SpringLayout.EAST, lblChi1, -6, SpringLayout.WEST, lblChi2);
			frame.getContentPane().add(lblChi1);
			
			
			//Puts constraints for and adds lblMu1
			springLayout.putConstraint(SpringLayout.NORTH, lblMu1, 0, SpringLayout.NORTH, lblPsi1);
			springLayout.putConstraint(SpringLayout.WEST, lblMu1, 136, SpringLayout.EAST, lblPsi5);
			frame.getContentPane().add(lblMu1);
			
			
			//Puts constraints for and adds lblMu2
			springLayout.putConstraint(SpringLayout.WEST, lblMu2, 86, SpringLayout.EAST, lblMu1);
			springLayout.putConstraint(SpringLayout.SOUTH, lblMu2, 0, SpringLayout.SOUTH, lblPsi1);
			frame.getContentPane().add(lblMu2);
			
			//Puts constraints for and adds lblChi5C
			springLayout.putConstraint(SpringLayout.NORTH, lblChi5C, 6, SpringLayout.SOUTH, lblChi5);
			springLayout.putConstraint(SpringLayout.EAST, lblChi5C, 0, SpringLayout.EAST, lblChi5);
			frame.getContentPane().add(lblChi5C);
			
			
			//Puts constraints for and adds lblChi4C
			springLayout.putConstraint(SpringLayout.NORTH, lblChi4C, 6, SpringLayout.SOUTH, lblChi4);
			springLayout.putConstraint(SpringLayout.EAST, lblChi4C, 0, SpringLayout.EAST, lblChi4);
			frame.getContentPane().add(lblChi4C);
			
			
			//Puts constraints for and adds lblChi3C
			springLayout.putConstraint(SpringLayout.NORTH, lblChi3C, 6, SpringLayout.SOUTH, lblChi3);
			springLayout.putConstraint(SpringLayout.EAST, lblChi3C, 0, SpringLayout.EAST, lblChi3);
			frame.getContentPane().add(lblChi3C);
			
			
			//Puts constraints for and adds lblChi2C
			springLayout.putConstraint(SpringLayout.NORTH, lblChi2C, 6, SpringLayout.SOUTH, lblChi2);
			springLayout.putConstraint(SpringLayout.EAST, lblChi2C, 0, SpringLayout.EAST, lblChi2);
			frame.getContentPane().add(lblChi2C);
				
			
			//Puts constraints for and adds lblChi1C
			springLayout.putConstraint(SpringLayout.NORTH, lblChi1C, 6, SpringLayout.SOUTH, lblChi2);
			springLayout.putConstraint(SpringLayout.EAST, lblChi1C, 0, SpringLayout.EAST, lblChi1);
			frame.getContentPane().add(lblChi1C);
			
			
			//Puts constraints for and adds lblMu1C
			springLayout.putConstraint(SpringLayout.WEST, lblMu1C, 0, SpringLayout.WEST, lblMu1);
			springLayout.putConstraint(SpringLayout.SOUTH, lblMu1C, 0, SpringLayout.SOUTH, lblChi5C);
			frame.getContentPane().add(lblMu1C);
			
			
			//Puts constraints for and adds lblMu2C
			springLayout.putConstraint(SpringLayout.NORTH, lblMu2C, 6, SpringLayout.SOUTH, lblMu2);
			springLayout.putConstraint(SpringLayout.EAST, lblMu2C, 0, SpringLayout.EAST, lblMu2);
			frame.getContentPane().add(lblMu2C);
			
			
			//Puts constraints for and adds lblPsi1C
			springLayout.putConstraint(SpringLayout.NORTH, lblPsi1C, 6, SpringLayout.SOUTH, lblPsi1);
			springLayout.putConstraint(SpringLayout.WEST, lblPsi1C, 0, SpringLayout.WEST, lblPsi1);
			frame.getContentPane().add(lblPsi1C);
			
			
			//Puts constraints for and adds lblPsi2C
			springLayout.putConstraint(SpringLayout.NORTH, lblPsi2C, 6, SpringLayout.SOUTH, lblPsi1);
			springLayout.putConstraint(SpringLayout.WEST, lblPsi2C, 0, SpringLayout.WEST, lblPsi2);
			frame.getContentPane().add(lblPsi2C);
			
			
			//Puts constraints for and adds lblPsi3C
			springLayout.putConstraint(SpringLayout.NORTH, lblPsi3C, 6, SpringLayout.SOUTH, lblPsi3);
			springLayout.putConstraint(SpringLayout.WEST, lblPsi3C, 0, SpringLayout.WEST, lblPsi3);
			frame.getContentPane().add(lblPsi3C);
			
			
			//Puts constraints for and adds lblPsi4C
			springLayout.putConstraint(SpringLayout.NORTH, lblPsi4C, 6, SpringLayout.SOUTH, lblPsi3);
			springLayout.putConstraint(SpringLayout.WEST, lblPsi4C, 0, SpringLayout.WEST, lblPsi4);
			frame.getContentPane().add(lblPsi4C);
			
			
			//Puts constraints for and adds lblCipherText
			springLayout.putConstraint(SpringLayout.EAST, lblCipherText, 0, SpringLayout.EAST, lblChi5);
			frame.getContentPane().add(lblCipherText);
			
			
			//Puts constraints for and adds lblPlainText
			springLayout.putConstraint(SpringLayout.WEST, lblPlainText, 0, SpringLayout.WEST, lblPsi1);
			frame.getContentPane().add(lblPlainText);
			
			
			//Puts constraints for and adds lblChi5C
			springLayout.putConstraint(SpringLayout.NORTH, lblPsi5C, 6, SpringLayout.SOUTH, lblPsi4);
			springLayout.putConstraint(SpringLayout.WEST, lblPsi5C, 0, SpringLayout.WEST, lblPsi5);
			frame.getContentPane().add(lblPsi5C);
			
			//Puts constraints for and adds lblKey
			JLabel lblKey = new JLabel("Key");
			springLayout.putConstraint(SpringLayout.NORTH, lblKey, 0, SpringLayout.NORTH, btnRandom);
			springLayout.putConstraint(SpringLayout.EAST, lblKey, 0, SpringLayout.EAST, btnAbout);
			frame.getContentPane().add(lblKey);
		}
		
		/**
		 * Creates all necessary settings for the JFrame components
		 */
		private void guiSettings() {
			pins.setWrapStyleWord(true);
			pins.setLineWrap(true);
			
			cipherText.setEditable(false);
			cipherText.setWrapStyleWord(true);
			cipherText.setLineWrap(true);
			
			plainText.setLineWrap(true);
			plainText.setWrapStyleWord(true);
			
			btnAbout.setText(null);
			btnAbout.setIcon(new ImageIcon(LorenzGUI.class.getResource("/images/About.png")));
			btnAbout.setMargin(new Insets(0, 0, 0, 0));
			btnAbout.setToolTipText("About this program and it's license");
			
			btnRandom.setText("Randomize");
			btnRandom.setMargin(new Insets(0, 0, 0, 0));
			btnRandom.setBorder(null);
			btnRandom.setToolTipText("Randomly configures the pins");
			
			btnAbout.setActionCommand("about");
			btnRandom.setActionCommand("random");
			
			scrollBar.setEnabled(true);
		}
		
		public JTextArea getCipherText() {
			return cipherText;
		}

		public JLabel getLblChi5C() {
			return lblChi5C;
		}

		public JLabel getLblChi4C() {
			return lblChi4C;
		}

		public JLabel getLblChi3C() {
			return lblChi3C;
		}

		public JLabel getLblChi2C() {
			return lblChi2C;
		}

		public JLabel getLblChi1C() {
			return lblChi1C;
		}

		public JLabel getLblMu1C() {
			return lblMu1C;
		}

		public JLabel getLblMu2C() {
			return lblMu2C;
		}

		public JLabel getLblPsi1C() {
			return lblPsi1C;
		}

		public JLabel getLblPsi2C() {
			return lblPsi2C;
		}

		public JLabel getLblPsi3C() {
			return lblPsi3C;
		}

		public JLabel getLblPsi4C() {
			return lblPsi4C;
		}

		public JLabel getLblPsi5C() {
			return lblPsi5C;
		}

		public JButton getBtnRandom() {
			return btnRandom;
		}

		public JButton getBtnAbout() {
			return btnAbout;
		}
		
		public JTextArea getPins() {
			return pins;
		}
		
		public JTextArea getPlainText() {
			return plainText;
		}
		
	
}
