package unterkapitel_07_03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SensitiveLabelDemo extends JFrame {
	
	public SensitiveLabelDemo() {
		super("Sensitive Label Demo");
		setLayout(new GridLayout(2,2));
		
		add( new SensitiveLabel("Wir"));
		add( new SensitiveLabel("sind"));
		add( new SensitiveLabel("sensitive"));
		add( new SensitiveLabel("Label!"));
		
		setSize(300,300);
		setVisible(true);
	}
	
	
	public static void main (String args[]) {
		new SensitiveLabelDemo();
	}

}
