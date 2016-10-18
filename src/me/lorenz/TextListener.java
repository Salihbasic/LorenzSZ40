package me.lorenz;

import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class TextListener {

	LorenzGUI gui;
	Baudot baudot;
	Cipher cipher;
	Pins pins;
	
	private int[] psiPins = new int[5];
	private int[] chiPins = new int[5];
	private String[] plainText;
	
	public void setGUI(LorenzGUI gui, Cipher cipher, Baudot baudot, Pins pins) {
		this.cipher = cipher;
		this.gui = gui;
		this.baudot = baudot;
		this.pins = pins;
		gui.getPlainText().getDocument().addDocumentListener(plainTextDocumentListener);
	}
	
	/**
	 * Encrypts a message based on pins and keys
	 */
	private int[] encryptMessage() {
		int[] encryptedMsg = cipher.encrypt(plainTextToArray(), getKey(psiPins, chiPins));
		System.out.println("Encrypted message is:" + Arrays.toString(encryptedMsg));
		return encryptedMsg;
	}
	
	/**
	 * Gets the encrypted letter.
	 * @return The encrypted letter
	 */
	String getEncryptedLetter() {
		int[] encrMsg = encryptMessage();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < encrMsg.length; i++) {
			sb.append(encrMsg[i]);
			System.out.println("Array letter" + i + "is" + encrMsg[i]);
		}
		String str = sb.toString();
		System.out.println("Encryption is:" + str);
		return str;
	}
	
	/**
	 * This method prints the encrypted message in cipher text
	 */
	private void printEncryptedLetter() {
		String encryptedLetter = baudot.getLetter(getEncryptedLetter());
		System.out.println("The encrypted letter is:" + encryptedLetter);
		gui.getCipherText().append(encryptedLetter);
	}
	
	/**
	 * This method turns the int array into a String
	 * 
	 * @param intArray - int array to be turned into string
	 * @return String representation of int array
	 */
	private String intToString(int[] intArray) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < intArray.length; i++) {
			sb.append(intArray[i]);
		}
		String str = sb.toString();
		return str;
	}
	
	/**
	 * Appends the Key value into keys JTextArea
	 */
	public void printKey() {
		gui.getKeysArea().append(baudot.getLetter(intToString(getKey(psiPins, chiPins))));
	}
	
	/**
	 * Gets the key necessary for message encryption
	 * @param psiPins - All five psi pins
	 * @param chiPins - All five chi pins
	 * @return Key
	 */
	private int[] getKey(int[] psiPins, int[] chiPins) {
		int[] result = new int[Math.min(psiPins.length, chiPins.length)];
		for (int i = 0; i < result.length; i++) {
			result[i] = psiPins[i] ^ chiPins[i];
		}
		System.out.println("The key is:" + Arrays.toString(result));
		return result;
	}
	
	/**
	 * Gets the last key pressed. 
	 * @return Last keyboard key pressed
	 */
	private String getKeyPressed() {
		String keyPressed = null;
		
		if (gui.getPlainText().getText().length() > 1) {
			try {
				keyPressed = gui.getPlainText().getDocument().getText(gui.getPlainText().getText().length() - 1, 1);
			} catch (BadLocationException blException) {
				System.err.print(blException);
				JOptionPane.showMessageDialog(null, "I am sorry 10101 11001 11111 11100 11111" + blException);
			}
		}
		
		if (gui.getPlainText().getText().length() == 1) {
			keyPressed = gui.getPlainText().getText();
		}
		
		System.out.println("Key pressed is:" + keyPressed);
		return keyPressed;
	}
	
	/**
	 * This method turns the plain text into int array
	 * @return Plain text as int array
	 */
	private int[] plainTextToArray() {
		plainText = baudot.getBaudot(getKeyPressed()).split("");
		int[] plainT = new int[plainText.length];
		for (int i = 0; i < plainText.length; i++) {
			String str = plainText[i];
			plainT[i] = Integer.parseInt(str, 2);
		}
		return plainT;
	}
	
	/**
	 * Gets all if the pins currently on psi and chi. This is not an acessor.
	 */
	private void getPins() {
		psiPins[0] = Integer.parseInt(gui.getLblPsi1C().getText());
		psiPins[1] = Integer.parseInt(gui.getLblPsi2C().getText());
		psiPins[2] = Integer.parseInt(gui.getLblPsi3C().getText());
		psiPins[3] = Integer.parseInt(gui.getLblPsi4C().getText());
		psiPins[4] = Integer.parseInt(gui.getLblPsi5C().getText());

		chiPins[0] = Integer.parseInt(gui.getLblChi1C().getText());
		chiPins[1] = Integer.parseInt(gui.getLblChi2C().getText());
		chiPins[2] = Integer.parseInt(gui.getLblChi3C().getText());
		chiPins[3] = Integer.parseInt(gui.getLblChi4C().getText());
		chiPins[4] = Integer.parseInt(gui.getLblChi5C().getText());
	}
	
	
	DocumentListener plainTextDocumentListener = new DocumentListener() {
		
		@Override
		public void removeUpdate(DocumentEvent e) {
			removeLastLetter();
		}
		
		@Override
		public void insertUpdate(DocumentEvent e) {
			pins.turnWheels();
			getPins();
			encryptMessage();
			printEncryptedLetter();
		}
		
		@Override
		public void changedUpdate(DocumentEvent e) {
			
		}
	};
	
	/**
	 * Removes the last letter inside cipher text once when letter in plain text is removed.
	 */
	private void removeLastLetter() {
		Document doc = gui.getCipherText().getDocument();
		if (gui.getPlainText().getText().length() > 1) {
			try {
				doc.remove(gui.getCipherText().getText().length() - 1, 1);
			} catch (BadLocationException blException) {
				JOptionPane.showMessageDialog(null, "I am sorry 10101 11001 11111 11100 11111" + blException);
			}
		}
		
		if (gui.getPlainText().getText().length() == 0) {
			gui.getCipherText().setText(null);
		}
	}
	
}
