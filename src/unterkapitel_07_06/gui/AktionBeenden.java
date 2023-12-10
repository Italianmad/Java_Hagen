package unterkapitel_07_06.gui;

import javax.swing.*;
import java.awt.event.*;

public class AktionBeenden extends AbstractAction implements WindowListener{
	 
	private RatespielGUI gui;
	 
	 public AktionBeenden(RatespielGUI ratenspiel){
		 super("Beenden");
		 this.gui = ratenspiel;
	 }
	 
	 public void actionPerformed(ActionEvent e) {
		 beendenAktion();
		 	 
	 }
	 
	 public void windowClosing(WindowEvent e) {
		 beendenAktion();
	 }
	 
	 public void beendenAktion() {

		 int antwort = JOptionPane.showConfirmDialog(gui.getContentPane(),
				 "Wollen Sie wirklich beenden?",
				 "Spiel beenden", 
				 JOptionPane.YES_NO_OPTION,
				 JOptionPane.INFORMATION_MESSAGE,
				 null);
		 
		 if(antwort == JOptionPane.YES_OPTION) // new way to close with a question
		 System.exit(0);
	 }
	 public void windowIconified(WindowEvent arg0) {}
	 public void windowDeiconified(WindowEvent arg0) {}
	 public void windowOpened(WindowEvent arg0) {}
	 public void windowDeactivated(WindowEvent arg0) {}
	 public void windowActivated(WindowEvent arg0) {}
	 public void windowClosed(WindowEvent arg0){}
	 
}
