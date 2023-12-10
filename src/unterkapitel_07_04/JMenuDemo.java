package unterkapitel_07_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMenuDemo extends JFrame {

	public JMenuDemo() {
		
		class AktionBeenden extends AbstractAction{
			public AktionBeenden() {
				super("Beenden");
			}
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	  }
		
		JMenuItem neu = new JMenuItem("Neu");
		JMenuItem öffnen = new JMenuItem("Öffnen");
		JMenuItem speichern = new JMenuItem("Speichern");
		JMenuItem beenden = new JMenuItem(new AktionBeenden( ));
		
		JMenu untermenu = new JMenu("Weitere Optionen"); 
		JMenuItem unterpukt1 = new JMenuItem("Unterpunkt1");
		JMenuItem unterpukt2 = new JMenuItem("Unterpunkt2");
		untermenu.add( unterpukt1);
		untermenu.add( unterpukt2);
		
		
		JMenu dateimenu = new JMenu("Datei");
		dateimenu.add(neu);
		dateimenu.add(untermenu);
		dateimenu.add(öffnen);
		dateimenu.addSeparator();
		dateimenu.add(speichern);
		dateimenu.addSeparator();
		dateimenu.add(beenden);
		
	
		JMenu hilfemenu = new JMenu("Hilfe"); 
		JMenuItem ueber = new JMenuItem("Über JMenu Demo");
		hilfemenu.add(ueber);
		
		setTitle("JMenuDemo");
		JMenuBar hauptmenu = new JMenuBar();
		hauptmenu.add(dateimenu);
		hauptmenu.add(hilfemenu);
		setJMenuBar(hauptmenu);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
		

	}
		
	public static void main(String args[]) {
		new JMenuDemo();
	}
}
