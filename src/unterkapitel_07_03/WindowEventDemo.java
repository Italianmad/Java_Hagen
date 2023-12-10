package unterkapitel_07_03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WindowEventDemo extends JFrame implements WindowListener {

	public WindowEventDemo(){
		
		super("Window Handling Demo");
		addWindowListener(this);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setVisible(true);
	}
	
	
	public void windowEntered(WindowEvent e) {
		System.out.println("Fenster wurde hinzugefügt");
		
	}
	
	public void windowClosing(WindowEvent e) {
		
		System.out.println("Fenster-Schließen-Symbol wurde betätigt");
		int result = JOptionPane.showConfirmDialog(this, "Wollen Sie wirklich beenden?", "Warnung", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		
		if (result == JOptionPane.YES_OPTION) {
			dispose();
		}
	}
	
	public void windowClosed(WindowEvent e) {
		System.out.println("Fenster wurde geschlossen");
	}
	
	public void windowActivated(WindowEvent e) {
		System.out.println("Fenster wurde aktiviert");
	}
	
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Fenster wurde deaktiviert");
	}
	
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Fenster wurde aus der Taskleiste gebracht");
		
	}
	
	public void windowIconified(WindowEvent e) {
		System.out.println("Fenster wurde in die Taskleiste gebracht");
//		int result = JOptionPane.showConfirmDialog(this, "Wollen Sie wirklich rot?", "Warnung", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
//		
//		if (result == JOptionPane.YES_OPTION) {
//			getContentPane().setBackground(Color.RED);
//		}
	}
	
	
	public void windowOpened(WindowEvent e) {
		System.out.println("Fenster wurde geöffnet");
	}
	


	

	
	public static void main(String args[]) {
		new WindowEventDemo();
	}
}
