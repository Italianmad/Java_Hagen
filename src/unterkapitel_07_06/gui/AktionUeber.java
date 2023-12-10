package unterkapitel_07_06.gui;

import java.awt.event.*;
import javax.swing.*;


public class AktionUeber extends AbstractAction {
	private RatespielGUI gui;
	
	public AktionUeber (RatespielGUI gui) {
		super ("Über das Ratespiel");
		this.gui = gui;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog (
				gui.getContentPane (),
				gui.liefereSpiel ().liefereSpielregeln (),
				"Spielregeln",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
