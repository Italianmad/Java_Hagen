package unterkapitel_07_04;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IconLabel {

	

public static void main(String args[]) {
	
	JFrame window = new JFrame("Label mit Icon");
	JLabel label = new JLabel("Ich bin ein Label mit Icon!");
	label.setIcon(new ImageIcon("bilder/smileyicon.gif"));
	window.add(label);
	window.pack();
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setVisible(true);
	
}
}
