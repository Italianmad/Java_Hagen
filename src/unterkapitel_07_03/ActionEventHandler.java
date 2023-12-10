package unterkapitel_07_03;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionEventHandler implements ActionListener{
 
	public void actionPerformed(ActionEvent e) {
		System.out.println("Beenden Button wurde geklickt!");
		System.exit(0);
		
	}
}
