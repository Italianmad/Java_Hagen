package unterkapitel_07_05;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class PrimzahlRechnerUI2 extends JFrame implements ActionListener{
	
	private JTextField startwertEingabe,endwertEingabe;
	private JButton okButton, abbruchButton;
	private JList ergebnisListe;
	private PrimzahlWorker worker;
	private JLabel statusLabel;
	
	public static void main(String args[]) throws Exception {
		new PrimzahlRechnerUI2();
	}
	
	
	public PrimzahlRechnerUI2() throws Exception {
		 Runnable initialisierungsThread = new Runnable () {  
				public void run () {
					initialisiereGUI ();
				}
		};
		SwingUtilities.invokeAndWait(initialisierungsThread);
	}

	public void initialisiereGUI() {
		
		startwertEingabe = new JTextField(5);
		startwertEingabe.setText("2");
		startwertEingabe.addActionListener(this);
		
		endwertEingabe = new JTextField(5);
		endwertEingabe.setText("3000000");
		endwertEingabe.addActionListener(this);
		
		okButton = new JButton("oK");
		okButton.addActionListener(this);
		
		abbruchButton = new JButton("abbrechen");
		abbruchButton.addActionListener(this);
		
		ergebnisListe = new JList();
		statusLabel = new JLabel();
		
		JPanel frame = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		frame.add(new JLabel("Berechne Primzahlen von"));
		frame.add(startwertEingabe);
		frame.add(new JLabel("bis"));
		frame.add(endwertEingabe);
		frame.add(okButton);
		frame.add(abbruchButton);
		
		aktiviereGUI();
		setLayout(new BorderLayout());
		setSize(500,500);
		setTitle("Primzahlrechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(frame, BorderLayout.NORTH);
		add(new JScrollPane(ergebnisListe), BorderLayout.CENTER);
		add(statusLabel,BorderLayout.SOUTH);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == startwertEingabe ||
		   e.getSource() == endwertEingabe||
		   e.getSource() == okButton ) {
			
			worker = new PrimzahlWorker(this);
			worker.execute();
		}
		else if (e.getSource() == abbruchButton){
			if(worker != null)
				worker.cancel(false);
		}
	}
	
	
	public void setzeStatusText(String status) {
		statusLabel.setText(status);
	}
	
	public int liefereStartwert() {
		return Integer.parseInt(startwertEingabe.getText());
	}
	
	public int liefereEndwert() {
		return Integer.parseInt(endwertEingabe.getText());
	}
	
	public void zeigePrimzahlListe(Vector<Integer> primzahlen) {
		if(primzahlen != null)
			ergebnisListe.setListData(primzahlen);    
		else
			ergebnisListe.setListData(new String [] {"Abbruch durch den Nutzer!"});
	}

	public void aktiviereGUI() {
		abbruchButton.setEnabled(false);
		okButton.setEnabled(true);
		startwertEingabe.setEnabled(true);
		endwertEingabe.setEnabled(true);
	}
	
	public void disaktiviereGUI() {
		abbruchButton.setEnabled(true);
		okButton.setEnabled(false);
		startwertEingabe.setEnabled(false);
		endwertEingabe.setEnabled(false);
		ergebnisListe.setListData(new Object [0]); // free everything while you disactivate the GUI
	}
}
	
	
	
	class PrimzahlWorker extends SwingWorker<Vector<Integer>, Float>{
		private PrimzahlRechnerUI2 hauptprogramm;
		private int start,end;
		
		public PrimzahlWorker(PrimzahlRechnerUI2 haupt) {
			hauptprogramm = haupt;
			start = hauptprogramm.liefereStartwert();
			end = hauptprogramm.liefereEndwert();
			
			hauptprogramm.disaktiviereGUI();
			hauptprogramm.setzeStatusText("Starte Berechnung...");
		}
		
		
		protected Vector<Integer> doInBackground() throws Exception {
		
			Vector<Integer> primzahlen = new Vector<Integer>();
			for(int i=start; i< end; i++) {
				if(isCancelled()) {
					hauptprogramm.zeigePrimzahlListe(primzahlen);
					return null;
					} // if Thread has call the cancel method
				if(istPrimzahl(i)) {
					primzahlen.add(i);
					publish((float) 100 * (i-start)/(end-start));
				}
			}
			return primzahlen;
		}
		
		


		protected void process(java.util.List<Float> zwischenErgebnisse) {
			if(isCancelled()) return;
			Float letzterStand = zwischenErgebnisse.get(zwischenErgebnisse.size()-1); // we start from zero to count the minimum size is 0 just if it is void.
			if(letzterStand !=-1)hauptprogramm.setzeStatusText(String.format("%5.2f%% abgeschlossen",letzterStand*100));
		}
		
		protected void done() {
			try {
				if(isCancelled()) {
					hauptprogramm.setzeStatusText("Berechnung durch Nutzer vorzeitig abgebrochen!");
					}
				else {
					hauptprogramm.zeigePrimzahlListe(get()); // get produces an exception from doInBackground dealt in ex
					hauptprogramm.setzeStatusText("Berechnung abgeschlossen");
				}
			}
			catch(InterruptedException | ExecutionException ex) {
				ex.printStackTrace();
				} 
			finally {
				hauptprogramm.aktiviereGUI();
			}
		}
		
		
		
		public boolean istPrimzahl(int number) {
			if(number <=1) return false;
			for(int j=2; j<Math.sqrt(number); j++) {
				if(number % j == 0) {return false;}
			}
			return true;	
		}
	}
	

