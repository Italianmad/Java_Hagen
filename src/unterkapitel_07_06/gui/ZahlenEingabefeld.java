package unterkapitel_07_06.gui;

import javax.swing.*;


public class ZahlenEingabefeld extends JTextField {
	
	public ZahlenEingabefeld(int laenge) {
		super(laenge);
	}
	
	public void eingabeLoeschen() {
		setText ("");
	}
	
	public int liefereEingabe() {
		if (getText().equals("")) return 0;
		return Integer.parseInt(getText());
	}
}
