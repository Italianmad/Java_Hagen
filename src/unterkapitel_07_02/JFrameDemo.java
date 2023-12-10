package unterkapitel_07_02;

import java.awt.*;
import javax.swing.*;

public class JFrameDemo extends JFrame {
	private JLabel text;
	private JComboBox auswahl;
	public static void main(String args[]) {
		new JFrameDemo();
	}
		public JFrameDemo() {
			super("Eine JFrame Demonstration");
			text = new JLabel("Wahle Deine Lieblingsfarbe:");
			auswahl = new JComboBox();
			auswahl.addItem("Rot");
			auswahl.addItem("Grün");
			auswahl.addItem("Blau");
			getContentPane().setLayout(new FlowLayout());
			getContentPane().add(text);
			getContentPane().add(auswahl);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			pack();
			setVisible(true);
			
		
	}


}
