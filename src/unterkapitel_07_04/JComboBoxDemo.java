package unterkapitel_07_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboBoxDemo extends JFrame implements ItemListener {

	public static void main(String args[]) {
		new JComboBoxDemo();
	}
	
	private String [] colors = {"Rot", "Grün", "Blau"};
	private JComboBox farbauswahl;
	private JPanel auswahlfeld;
	
	public JComboBoxDemo() {
		farbauswahl = new JComboBox(colors);
		farbauswahl.addItemListener(this);
		
		auswahlfeld = new JPanel();
		auswahlfeld.setLayout(new FlowLayout());
		auswahlfeld.add(new JLabel("Hintergrundfarbe"));
		auswahlfeld.add(farbauswahl);
		
		setTitle("JComboBox");
		setSize(200,200);
		add(auswahlfeld);
		setVisible(true);
	 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void itemStateChanged(ItemEvent e) {
		if(e.getItem() == colors[0]) {
			auswahlfeld.setBackground(Color.red);
		}
		else if (e.getItem() == colors[1]) {
			auswahlfeld.setBackground(Color.green);
		}
		else {auswahlfeld.setBackground(Color.blue);}
	
	}
}
