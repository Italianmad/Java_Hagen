package unterkapitel_07_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.FileFilter;
import java.io.File;


public class BilddateiFilter extends FileFilter {

	public boolean accept(File datei){
		return datei.isDirectory() ||
		(datei.isFile() && (datei.getName().endsWith(".jpg") ||
							datei.getName().endsWith(".gif") ||
							datei.getName().endsWith(".png")));
	}
	
	public String getDescription() {
		return "Bilddatei!";
	}
}
