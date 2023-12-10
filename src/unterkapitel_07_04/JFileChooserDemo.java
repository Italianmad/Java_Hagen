package unterkapitel_07_04;

import javax.swing.*;
import java.io.*;

public class JFileChooserDemo {
	
	public static void main(String args[]) {
	
	JFileChooser dateiDialog = new JFileChooser();

	int numb = dateiDialog.showOpenDialog(null);
	
	if (numb == JFileChooser.APPROVE_OPTION) {
		System.out.println("Ausgewählte Datei: "+ dateiDialog.getSelectedFile());
	}


		
	}
	

	
		
	
}
