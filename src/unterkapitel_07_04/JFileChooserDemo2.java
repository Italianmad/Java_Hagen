package unterkapitel_07_04;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.FileFilter;
import java.io.File;

public class JFileChooserDemo2 extends JFrame {
	JLabel bildlabel;

	public static void main(String args[]) {
		new JFileChooserDemo2();
	}
	
	public JFileChooserDemo2() {
		super("Bildbetrachter");
	
		bildlabel = new JLabel("noch kein bild geladen!");
		setLayout(new BorderLayout());
		add(new JButton( new BildOeffnen(this)), BorderLayout.SOUTH);
		add(new JScrollPane(bildlabel), BorderLayout.CENTER);
		
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void zeigeBilddatei (String dateiname) {
		Icon x = new ImageIcon(dateiname);
		bildlabel.setIcon(x);
		bildlabel.setText("");
	}
}




