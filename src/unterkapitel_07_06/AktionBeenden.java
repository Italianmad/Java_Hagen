package unterkapitel_07_06;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class AktionBeenden extends AbstractAction {

 private Ratespiel rates;
 public AktionBeenden(Ratespiel ratespiel){
	 super("Beenden");
	 rates = ratespiel;
 }
 
 public void actionPerformed(ActionEvent e) {
	 

	 int antwort = JOptionPane.showConfirmDialog(rates.getContentPane(),
			 "Wollen Sie wirklich beenden?", "Spiel beenden", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
	 
	 if(antwort == JOptionPane.YES_OPTION) // new way to close with a question
	 System.exit(0);
	 	 
 }
}
