package unterkapitel_07_03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDemo3 extends JFrame implements ActionListener{
 private JComboBox colorchoice;
 private JButton quitButton;
 private JButton printButton;

 public EventDemo3() {
		
		
		colorchoice = new JComboBox();
		quitButton = new JButton("Beenden");
		printButton = new JButton("Print");
		colorchoice.addItem("Rot");
		colorchoice.addItem("Grün");
		colorchoice.addItem("Blau");
		
		quitButton.addActionListener(this);
		printButton.addActionListener(this);
		colorchoice.addActionListener(this);
		
		setTitle("Event Demo 3");
		setLayout(new FlowLayout());
		add(quitButton);
		add(colorchoice);
		add(printButton);
		add(new JLabel("Wählen Sie eine Hintergrundfarbe: "));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		setSize(400,400);
		setVisible(true);
		
	 
 }
 
@Override
public void actionPerformed(ActionEvent e) {

	if(e.getSource() == quitButton) {
		dispose();
	}
	
	else if(e.getSource() == colorchoice) {
		if(colorchoice.getSelectedItem().equals("Rot")) {
			getContentPane().setBackground(Color.red);
			}
		else if (colorchoice.getSelectedItem().equals("Grün")) {
			getContentPane().setBackground(Color.green);
		}
		else {
			getContentPane().setBackground(Color.blue);
		}
		
	}
	else if(e.getSource() == printButton) {
		System.out.println("At 20:30 on Friday 17th November: the German horror show");
	}
	
} 


public static void main(String args[]) {
	new EventDemo3();
}
}
