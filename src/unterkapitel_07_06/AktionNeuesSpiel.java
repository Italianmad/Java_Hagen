package unterkapitel_07_06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class AktionNeuesSpiel extends AbstractAction {
	
	private Ratespiel rates;
	public AktionNeuesSpiel (Ratespiel ratespiel) {
		 super("Neues Spiel");
		 rates = ratespiel; 
	}
	
	public void actionPerformed(ActionEvent e){
		int antwort = JOptionPane.showConfirmDialog(rates.getContentPane(),
				"Möchten Sie das aktuelle Spiel wirklich "+
						"abbrechen um ein neues Spiel zu starten?",
						"Neues Spiel beginnen", JOptionPane.YES_NO_CANCEL_OPTION, 
						JOptionPane.WARNING_MESSAGE, null);
		
		if(antwort == JOptionPane.YES_OPTION) {
			rates.initialisiereSpiel();
		}
	}
	

}
