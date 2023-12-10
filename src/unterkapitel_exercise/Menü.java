package unterkapitel_exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menü extends JFrame{
	
	

	public Menü() {
		class AktionBeenden extends AbstractAction{
			public AktionBeenden() {
				super("Beenden");
			}
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
		
		}
		
		class AktionÜber extends AbstractAction{
			public AktionÜber() {
				super("Info");
			}
			
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "The game will be done in security");
		}
			
		}
		
		
		JMenu datei = new JMenu("Datei");
		JMenuItem öffnen = new JMenuItem("Öffnen");
		JMenuItem speichern = new JMenuItem ("Speichern");
		JMenuItem beenden = new JMenuItem(new AktionBeenden( ));
		datei.add(öffnen);
		datei.add(speichern);
		datei.add(beenden);
		
		
		
		JMenu über = new JMenu("Über");
		JMenuItem info = new JMenuItem(new AktionÜber( ));
		über.add(info);
		
		
		setTitle("JMenuDemo");
		JMenuBar hauptmenu = new JMenuBar();
		hauptmenu.add(datei);
		hauptmenu.add(über);
		setJMenuBar(hauptmenu);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
		
		
	}
	
	public static void main(String args[]) {
		new Menü();
	}
	
	
	
	

}
