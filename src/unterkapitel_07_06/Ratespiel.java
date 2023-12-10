package unterkapitel_07_06;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class Ratespiel extends JFrame implements WindowListener{

	JTextField eingabefeld;
	JTextArea mitteilungen;
	Action aktionBeenden,aktionNeuesSpiel;
	Action aktionUeber, aktionTippen;
	int zuRatendeZahl,anzahlVersuche;
	
	public static void main(String args[]) {
		new Ratespiel();
	}
	
	public  Ratespiel() {
		aktionUeber = new AktionUeber(this);
		aktionBeenden = new AktionBeenden(this);
		aktionNeuesSpiel = new AktionNeuesSpiel(this);
		aktionTippen = new AktionTippen(this);
		
		initialisiereMenu();
		initialisiereGUI ();
		initialisiereSpiel();
		}

	
	private void initialisiereGUI() {
		eingabefeld = new JTextField(5);
		eingabefeld.addActionListener(aktionTippen);
		
		mitteilungen = new JTextArea();
		mitteilungen.setEditable(false);
		
		JPanel eingabezeile = new JPanel();
		eingabezeile.setLayout(new FlowLayout(FlowLayout.LEFT));
		eingabezeile.add(new JLabel("Ihr Tipp:"));
		eingabezeile.add(eingabefeld);
		eingabezeile.add(new JButton(aktionTippen));
		
		JPanel ratefeld = new JPanel();
		ratefeld.setLayout(new BorderLayout());
		ratefeld.add(BorderLayout.CENTER,new JScrollPane(mitteilungen));
		ratefeld.add(BorderLayout.SOUTH, eingabezeile);
		
		add(BorderLayout.SOUTH,ratefeld);
		
		
		this.setTitle("Zahlenraten");
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(this);
		this.setLocation(100,100);
		this.setSize(400,300);
		this.setVisible(true);
		
		eingabefeld.grabFocus(); // done to fix the focus on the keywords
		
	}
	
	
	private void initialisiereMenu() {
		JMenuBar hauptmenu;
		JMenu dateimenu, hilfemenu;
		
		hauptmenu = new JMenuBar();
		dateimenu = new JMenu("Datei");
		hilfemenu = new JMenu("Hilfe");
		
		dateimenu.add(new JMenuItem(aktionNeuesSpiel));
		dateimenu.addSeparator();
		dateimenu.add(new JMenuItem(aktionBeenden));
	 
		hilfemenu.add(new JMenuItem(aktionUeber));
	
		hauptmenu.add(dateimenu);
		hauptmenu.add(hilfemenu);
	    setJMenuBar(hauptmenu);
	    
	}

	
	public void initialisiereSpiel() {
		
		zuRatendeZahl =  (int) (Math.random() * 100) + 1;
		anzahlVersuche = 0;
		
		eingabefeld = new JTextField(5);
		mitteilungen.setText("");
		gibMitteilungAus(" Ratenspiel \n Erraten Sie eine Zahl zwischen 1 und 100 \n in möglichst wenigen Versuchen!");
		bereiteNaechstenTippVor();
		
	}
	
	public void bereiteNaechstenTippVor () {
		anzahlVersuche ++;
		eingabefeld.setText("");
		}
	
	public int liefereAktuellenTipp () {
		String eingabe = eingabefeld.getText ();
		if (eingabe.equals("")) return 0;
		int zahl = Integer.parseInt(eingabe);
		return zahl;
		}
	
	public void gibMitteilungAus (String mitteilung) {
		mitteilungen.append(mitteilung);

	}
	
	public int  liefereAnzahlVersuche () {
		return anzahlVersuche;
	}
	
	public void werteTippAus () {
		int tipp = liefereAktuellenTipp ();
		if (tipp < 1 || tipp > 100) {
		JOptionPane.showMessageDialog(getContentPane (),
		"Nur zahlen zwischen 1 und 100 sind erlaubt!",
		"Ungültige Eingabe!",
		JOptionPane.ERROR_MESSAGE, null);
		}
		else if (tipp == zuRatendeZahl) {
		JOptionPane.showMessageDialog(
		getContentPane (),
		"Richtig! Die zu ratende Zahl war "+tipp+
		"! Sie haben "+liefereAnzahlVersuche()+
		" Versuche benötigt!",
		" Gewonnen!",
		JOptionPane.INFORMATION_MESSAGE, null);
		initialisiereSpiel();
		}
		else if (tipp > zuRatendeZahl) {
		gibMitteilungAus (liefereAnzahlVersuche ()+". Tipp: "+tipp+"zu groß!");
		bereiteNaechstenTippVor ();}
		
		else if (tipp < zuRatendeZahl) {
		gibMitteilungAus (liefereAnzahlVersuche ()+". Tipp: "+tipp+"zu klein!");
		bereiteNaechstenTippVor ();
		}
	}
		
	
	public void windowClosing(WindowEvent e) {
		aktionBeenden.actionPerformed( new ActionEvent(e.getSource(), e.getID(),null));
	// trick because no ActionListener are permitted on END Button
	}
		
	public void windowActivated(WindowEvent e) {}
	
	public void windowClosed(WindowEvent e) {}
	
	public void windowDeactivated(WindowEvent e) {}
	
	public void windowDeiconified(WindowEvent e) {}
	
	public void windowIconified(WindowEvent e) {}
	
	public void windowOpened(WindowEvent e) {}
	
}
