package unterkapitel_07_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Passwortabfrage extends JFrame implements ActionListener {

	public static void main(String args[]) {
		new Passwortabfrage();
	}
	
	private JTextField password, name;
	private JLabel status;
	
	public Passwortabfrage() {
		name = new JTextField(10);
		password = new JTextField(10);
		status = new JLabel();
		
		JPanel panelname = new JPanel();
		panelname.setLayout(new FlowLayout());
		panelname.add(new Label("Nutzername: "));
		panelname.add(name);
		
		JPanel panelpassword = new JPanel();
		panelpassword.setLayout(new FlowLayout());
		panelpassword.add(new Label("Passwort: "));
		panelpassword.add(password);
		
		JPanel loginfield = new JPanel();
		loginfield.setLayout(new GridLayout(2,1));
		
		loginfield.add(panelname);
		loginfield.add(panelpassword);
		
		setTitle("Passwortabfrage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		add(BorderLayout.NORTH, new Label("Bitte authentifizieren Sie sich"));
		add(BorderLayout.CENTER, loginfield);
		add(BorderLayout.SOUTH, status);
		
		name.addActionListener(this);
		password.addActionListener(this);
		
		setSize(300,150);
		setVisible(true);
		
		
	}
	

	public void actionPerformed(ActionEvent e) {
		if(name.getText().equals("Mr. X")) {
			if(password.getText().equals("geheim")) {status.setText("Login erfolgreich");}
			else {status.setText("Password falsch!");}}
		else {status.setText("Ungültiger Benuztname");}
		
		System.out.println(name.getText());
		System.out.println(password.getText());
	}
}

