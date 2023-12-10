package unterkapitel_07_02;

import java.awt.*;
import javax.swing.*;

public class JComponentDemo extends JFrame{
	
	public static void main(String args[]) {
		new JComponentDemo();
		

	}
	
	public JComponentDemo() {
		
		setLayout(new FlowLayout());
		setSize(100,100);
		add(new OkButton());
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
