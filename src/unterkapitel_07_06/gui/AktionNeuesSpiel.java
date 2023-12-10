package unterkapitel_07_06.gui;

import java.awt.event.*;
import javax.swing.*;

public class AktionNeuesSpiel extends AbstractAction{
	private RatespielGUI gui;
	
	public  AktionNeuesSpiel(RatespielGUI gui) {
		super("Neues Spiel");
		this.gui = gui;
	}
	
	public void actionPerformed (ActionEvent e) {
		int antwort = JOptionPane.showConfirmDialog (
				gui.getContentPane(),
				"Möchten Sie das aktuelle Spiel wirklich abbrechen um ein neues Spiel zu starten?",
				"Neues Spiel beginnen",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.WARNING_MESSAGE,
				null);
		
		if (antwort == JOptionPane.YES_OPTION)
			gui.initialisiereSpiel ();
	}
}
