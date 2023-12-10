package unterkapitel_07_03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class EventDemo2 extends JFrame implements ActionListener {
	private JTextField userInput;
	
	public EventDemo2() {
		super("Testfield's ActionEvent");
		initGUI();
	}
	
	
	private void initGUI() {
		userInput = new JTextField(20);
		userInput.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(new JLabel("Geben Sie etwas ein und drücken Sie ENTER"));
		add(userInput);
		pack();
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Eingabe im Textfield bestätigt!\n Aktueller Inhalt:"+ userInput.getText());
		System.out.println("Text ist: "+ userInput.getText().length()+ " Charaktere lang.");
	}
	
	
	
	public static void main(String args[]) {
		new EventDemo2();
	}
	
}

