package unterkapitel_07_06.gui;

import java.awt.event.*;
import javax.swing.*;

public class AktionTippen extends AbstractAction {
	private RatespielGUI gui;
	
	public AktionTippen (RatespielGUI gui) {
		super ("Tippen");
		this.gui = gui;
	}
	
	public void actionPerformed (ActionEvent e) {
		gui.naechsterTipp ();
	}	
}
