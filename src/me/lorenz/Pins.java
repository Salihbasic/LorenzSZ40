package me.lorenz;

public class Pins {

	LorenzGUI gui;

	//Declares multiple fiealds all holding values necessary for pin simulation
	private int pinLocationForPsi1 = 0;
	private int pinLocationForPsi2 = 43;
	private int pinLocationForPsi3 = 90;
	private int pinLocationForPsi4 = 141;
	private int pinLocationForPsi5 = 194;
	
	private int pinLocationForMu37 = 253;
	private int pinLocationForMu61 = 290;
		
	private int pinLocationForChi1 = 351;
	private int pinLocationForChi2 = 392;
	private int pinLocationForChi3 = 423;
	private int pinLocationForChi4 = 452;
	private int pinLocationForChi5 = 478;
	
		
	public void setGUI(LorenzGUI gui) {
		this.gui = gui;
	}	

	
	/**
	 * This method is used for turning wheels of the machine. It will always
	 * move Chi wheels while it will check if Mu61 pin is 1. If it is it'll
	 * move Mu37 thus moving Psi wheels aswell.
	 */
	public void turnWheels() {
			
		wheelConditions();
			
		pinLocationForMu61++;
			
		if (gui.getLblMu2C().getText().equalsIgnoreCase("1")) {
			pinLocationForMu37++;
			pinLocationForPsi1++;
			pinLocationForPsi2++;
			pinLocationForPsi3++;
			pinLocationForPsi4++;
			pinLocationForPsi5++;
		}
			
		pinLocationForChi1++;
		pinLocationForChi2++;
		pinLocationForChi3++;
		pinLocationForChi4++;
		pinLocationForChi5++;
		
		changeText();	
	}
		
	/**
	 * This method is made for creating checks. If a pin location is
	 * at a certain point for specific wheel, it will return it to
	 * the starting point. Exampli gratia: When Psi 1 comes to 43
	 * it will return it to 0. When Psi2 comes to 90 it will return
	 * it to 43, et cetere.
	 */
	private void wheelConditions() {
			
		if (pinLocationForPsi1 == 43) {
			pinLocationForPsi1 = 0;
		}
			
		if (pinLocationForPsi2 == 90) {
			pinLocationForPsi2 = 43;
		}
			
		if (pinLocationForPsi3 == 141) {
			pinLocationForPsi3 = 90;
		}
			
		if (pinLocationForPsi4 == 194) {
			pinLocationForPsi4 = 141;
		}
			
		if (pinLocationForPsi5 == 253) {
			pinLocationForPsi5 = 194;
		}
			
			
		if (pinLocationForMu37 == 290) {
			pinLocationForMu37 = 253;
		}
			
		if (pinLocationForMu61 == 351) {
			pinLocationForMu61 = 290;
		}
			
			
		if (pinLocationForChi1 == 392) {
			pinLocationForChi1 = 351;
		}
			
		if (pinLocationForChi2 == 423) {
			pinLocationForChi2 = 392;
		}
			
		if (pinLocationForChi3 == 452) {
			pinLocationForChi3 = 423;
		}
			
		if (pinLocationForChi4 == 478) {
			pinLocationForChi4 = 452;
		}
			
		if (pinLocationForChi5 == 501) {
			pinLocationForChi5 = 478;
		}
	}
		
	
	/**
	 * Method used for applying changes to the Wheel labels. It will set the pin number (1 or 0)
	 * for the specific wheel label. Exampli gratia: If value of pinLocationForPsi1 was 1 it will
	 * set the Psi 1 label in the JFrame to 1.
	 */
	private void changeText() {
		String psi1Txt = gui.getPins().getText().substring(pinLocationForPsi1, pinLocationForPsi1 + 1);
		String psi2Txt = gui.getPins().getText().substring(pinLocationForPsi2, pinLocationForPsi2 + 1);
		String psi3Txt = gui.getPins().getText().substring(pinLocationForPsi3, pinLocationForPsi3 + 1);
		String psi4Txt = gui.getPins().getText().substring(pinLocationForPsi4, pinLocationForPsi4 + 1);
		String psi5Txt = gui.getPins().getText().substring(pinLocationForPsi5, pinLocationForPsi5 + 1);
		
		String chi1Txt = gui.getPins().getText().substring(pinLocationForChi1, pinLocationForChi1 + 1);
		String chi2Txt = gui.getPins().getText().substring(pinLocationForChi2, pinLocationForChi2 + 1);
		String chi3Txt = gui.getPins().getText().substring(pinLocationForChi3, pinLocationForChi3 + 1);
		String chi4Txt = gui.getPins().getText().substring(pinLocationForChi4, pinLocationForChi4 + 1);
		String chi5Txt = gui.getPins().getText().substring(pinLocationForChi5 - 1, pinLocationForChi5);
		
		String mu37Txt = gui.getPins().getText().substring(pinLocationForMu37, pinLocationForMu37 + 1);
		String mu61Txt = gui.getPins().getText().substring(pinLocationForMu61, pinLocationForMu61 + 1);
		
		gui.getLblPsi1C().setText(psi1Txt);
		gui.getLblPsi2C().setText(psi2Txt);
		gui.getLblPsi3C().setText(psi3Txt);
		gui.getLblPsi4C().setText(psi4Txt);
		gui.getLblPsi5C().setText(psi5Txt);
		
		gui.getLblMu1C().setText(mu37Txt);
		gui.getLblMu2C().setText(mu61Txt);
			
		gui.getLblChi1C().setText(chi1Txt);
		gui.getLblChi2C().setText(chi2Txt);
		gui.getLblChi3C().setText(chi3Txt);
		gui.getLblChi4C().setText(chi4Txt);
		gui.getLblChi5C().setText(chi5Txt);
	}
	
	
}
