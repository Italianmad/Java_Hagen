package unterkapitel_07_06.gui;

import javax.swing.*;  

public class Hauptmenu extends JMenuBar {

	
	public Hauptmenu(RatespielGUI gui) {
		  JMenu dateimenu = new JMenu ("Datei");                        
		   dateimenu.add( new JMenuItem (gui.liefereAktionNeuesSpiel()));
		   dateimenu.addSeparator();                                     
		   dateimenu.add( new JMenuItem (gui.liefereAktionBeenden ()));  
		   add (dateimenu);                                              
		                                                                 
		   JMenu hilfemenu = new JMenu ("Hilfe");                        
		   hilfemenu.add ( new JMenuItem (gui.liefereAktionUeber ()));   
		   add (hilfemenu);  
		
	}  
}


