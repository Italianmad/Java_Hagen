package unterkapitel_07_01;

import java.awt.Color;
import javax.swing.JFrame;

public class MyFrame  extends JFrame{
	
	public MyFrame() {
		getContentPane().setBackground(Color.CYAN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}

}
