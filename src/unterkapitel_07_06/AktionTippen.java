package unterkapitel_07_06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class AktionTippen extends AbstractAction{
	
	private Ratespiel ratespiel;
	public AktionTippen(Ratespiel ratespiel) {
		super("Tippen");
		this.ratespiel = ratespiel;
	}

	public void actionPerformed(ActionEvent e) {
		ratespiel.werteTippAus();
	}
}
