package unterkapitel_07_06.gui;
import unterkapitel_07_06.ratespiel2.Ratespiel;
import javax.swing.*;
import java.awt.*;

public class RatespielGUI extends JFrame {
	
	private Ratespiel         spiel;
	private ZahlenEingabefeld eingabefeld;
	private JTextArea         mitteilungen;
	private AktionBeenden     aktionBeenden;
	private AktionUeber       aktionUeber;
	private AktionTippen      aktionRaten;
	private AktionNeuesSpiel  aktionNeuesSpiel;

	public RatespielGUI(Ratespiel spiel) {
		super("RatenSpiel");
		this.spiel = spiel;
		this.setLocation(100,100);
		this.setSize(400,300);
		
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		aktionBeenden = new AktionBeenden(this);
		aktionRaten = new AktionTippen(this);
		aktionUeber = new AktionUeber(this);
		aktionNeuesSpiel = new AktionNeuesSpiel(this);
		initialisiereGUI();
		initialisiereSpiel();
		
	}
	
	 public Ratespiel liefereSpiel() {
		 return spiel;
	 } 
	
	public void initialisiereGUI() {
		eingabefeld = new ZahlenEingabefeld(5);
		eingabefeld.addActionListener(aktionRaten);
		
		mitteilungen = new JTextArea();
		mitteilungen.setEditable(false);
		
		JPanel eingabezeile = new JPanel();
		eingabezeile.setLayout(new FlowLayout(FlowLayout.LEFT));
		eingabezeile.add(new JLabel("Ihr Tipp:"));
		eingabezeile.add(eingabefeld);
		eingabezeile.add(new JButton(aktionRaten));
		
		JPanel ratefeld = new JPanel();
		ratefeld.setLayout(new BorderLayout());
		ratefeld.add(BorderLayout.CENTER,new JScrollPane(mitteilungen));
		ratefeld.add(BorderLayout.SOUTH, eingabezeile);
		
		add(BorderLayout.SOUTH,ratefeld);
		
		
		this.setTitle("Zahlenraten");
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(liefereAktionBeenden());
		this.setLocation(100,100);
		this.setSize(400,300);
		this.setVisible(true);
		
		eingabefeld.grabFocus(); // done to fix the focus on the keywords
	}
	

	

	public void initialisiereSpiel() {
		mitteilungen.setText("");
		gibMitteilungAus(" Ratenspiel");
		gibMitteilungAus(liefereSpiel().liefereSpielregeln());
		liefereSpiel().liefereSpielregeln();
	}
	
	
	public void gibMitteilungAus(String mitteilung) {
		mitteilungen.append(mitteilung+"\n");
	}
	

	
	
	public void naechsterTipp() {
		int tipp       = eingabefeld.liefereEingabe();
		int versuche   = liefereSpiel().liefereAnzahlVersuche();
		int auswertung = liefereSpiel().werteTippAus(tipp);
		eingabefeld.eingabeLoeschen();
		
		if (auswertung == Ratespiel.TIPP_UNGUELTIG) 
			JOptionPane.showMessageDialog(getContentPane (),
					"Nur zahlen zwischen 1 und 100 sind erlaubt!",
					"Ungültige Eingabe!",
					JOptionPane.ERROR_MESSAGE, null);
	
		else if (auswertung == Ratespiel.TIPP_ZU_GROSS) 
			gibMitteilungAus (versuche+". Tipp: "+tipp+" zu groß!");
		
		else if (auswertung == Ratespiel.TIPP_ZU_KLEIN)
			gibMitteilungAus (versuche+". Tipp: "+tipp+" zu klein!");

		else {
			JOptionPane.showMessageDialog(
					getContentPane (),
					"Richtig! Die zu ratende Zahl war "+tipp+
					"! Sie haben "+liefereSpiel().liefereAnzahlVersuche()+
					" Versuche benötigt!",
					" Gewonnen!",
					JOptionPane.INFORMATION_MESSAGE, null);
			initialisiereSpiel();		
		}
	}
	
	
	public AktionNeuesSpiel liefereAktionNeuesSpiel(){
		return aktionNeuesSpiel;
	};
	
	public AktionBeenden liefereAktionBeenden(){
		return aktionBeenden;
	};
	

	public AktionUeber liefereAktionUeber(){
		return aktionUeber;
	};

}
