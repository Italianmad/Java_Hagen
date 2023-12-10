package unterkapitel_07_06;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class AktionUeber extends AbstractAction{
	private Ratespiel rates;
	
	public AktionUeber(Ratespiel ratespiel) {
		super("Über das Ratenspiel");
		rates = ratespiel;
	}

	public void actionPerformed(ActionEvent e) {
		 int antwort = JOptionPane.showConfirmDialog(rates.getContentPane(),
				 "Raten Sie eine Zahl zwischen 1 und 100\n"+
						 "in möglichst wenig Versuchen!\n"+
						 "Bei jedem Tipp erhalten Sie einen Hinweis,\n"+
						 "ob die zu ratende Zahl kleiner oder größer\n"+
						 "war als Ihr Tipp!",
						 "Spielregeln",JOptionPane.INFORMATION_MESSAGE);
	}
}
