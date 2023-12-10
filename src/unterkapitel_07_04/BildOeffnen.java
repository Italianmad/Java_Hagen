package unterkapitel_07_04;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import java.io.File;

public class BildOeffnen extends AbstractAction {
	
	private JFileChooserDemo2 window;
	
	
	public BildOeffnen(JFileChooserDemo2 f){
		super("Bilddatei öffnen");
		window = f;
	}

	public void actionPerformed(ActionEvent e) {
		JFileChooser filechooser = new JFileChooser();
		filechooser.setFileFilter(new BilddateiFilter());
		int result = filechooser.showOpenDialog(window.getContentPane());
		if(result == JFileChooser.APPROVE_OPTION) {
			File auswahl = filechooser.getSelectedFile();
			window.zeigeBilddatei(auswahl.getAbsolutePath());
		}
		
	}
}
