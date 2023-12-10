package unterkapitel_07_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class PrimzahlRechnerUI1 extends JFrame implements ActionListener{

	private JTextField startwertEingabe, endwertEingabe;
	private JButton okButton;
	private JList ergebnisListe;
	private JLabel statusLabel;
	
	public static void main(String args[]) throws Exception {
		new PrimzahlRechnerUI1();
	}
	
	public PrimzahlRechnerUI1() throws Exception {
		SwingUtilities.invokeLater (
			new Runnable () {  
				public void run () {
					initialisiereGUI ();}
			}
		);
	}
			
			
	private void initialisiereGUI() {
		statusLabel = new JLabel("Berechne Primzahlen von");
		startwertEingabe = new JTextField(5);
		startwertEingabe.setText("100");
		startwertEingabe.addActionListener(this);
		
		endwertEingabe = new JTextField(5);
		endwertEingabe.setText("100");
		endwertEingabe.addActionListener(this);
		
		okButton = new JButton("OK");
		okButton.addActionListener(this);
		
		ergebnisListe = new JList();
		statusLabel = new JLabel();
		
		JPanel frame = new JPanel(new FlowLayout(FlowLayout.LEFT));
		frame.add(new JLabel("Berechne Primzahlen von"));
		frame.add(startwertEingabe);
		frame.add(endwertEingabe);
		frame.add(okButton);
		
		setTitle("Primzahlrechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		add(frame, BorderLayout.NORTH);
		add(new JScrollPane(ergebnisListe), BorderLayout.CENTER);
		add(statusLabel,BorderLayout.SOUTH);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Runnable r = new Runnable() {
			public void run () {
		
		//deaktiviereGUI();
		
		Vector<Integer> primzahlen = ermittlePrimzahler(liefereStartwert(), liefereEndwert());
		//zeigePrimzahlListe(primzahlen);
		setzeStatusText("Berechnung abgeschlossen!");
		//aktiviereGUI();
	}
		};
		new Thread(r).start();
	}
	
	public int liefereStartwert() {
		return Integer.parseInt(startwertEingabe.getText());
	}
	
	public int liefereEndwert() {
		return Integer.parseInt(endwertEingabe.getText());
	}
	
	public void setzeStatusText(String status) {
		statusLabel.setText(status);
	}
	
	public Vector<Integer> ermittlePrimzahler(int start, int end){
		Vector<Integer> primzahlen = new Vector<Integer>();
		for(int i=start; i< end; i++) {
			if(istPrimzahl(i)) {
				primzahlen.add(i);
				float percent = 100 * (i-start)/(end-start);
				setzeStatusText(String.format("%6.2f%% abgeschlossen...", percent));
			}
		}
		return primzahlen;
	}
	
	public boolean istPrimzahl(int number) {
		if(number <=1) return false;
		for(int j=2; j<Math.sqrt(number); j++) {
			if(number % j == 0) {return false;}
		}
		return true;	
	}
	
	
}
