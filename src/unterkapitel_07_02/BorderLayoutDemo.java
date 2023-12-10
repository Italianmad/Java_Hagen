package unterkapitel_07_02;

import java.awt.*;
import javax.swing.*;


public class BorderLayoutDemo extends JFrame{
	public static void main(String args[]) {
		new BorderLayoutDemo();
	}
	
	public BorderLayoutDemo() {

		JPanel toolbar = new JPanel ();
		toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));
		toolbar.add(new JButton("Neu"));
		toolbar.add(new JButton("Öffen"));
		toolbar.add(new JButton("Speichern"));
		
		JPanel colorPanel = new JPanel ();
		colorPanel.setLayout(new GridLayout(3,1));
		colorPanel.add(new JButton("Rot"));
		colorPanel.add(new JButton("Grün"));
		colorPanel.add(new JButton("Blau"));
		
		
		
		
		setTitle("BorderLayoutDemo");
		setLayout(new BorderLayout());

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		add(toolbar, BorderLayout.NORTH);
		add(colorPanel, BorderLayout.WEST);
		add( new JButton("Mittel"), BorderLayout.CENTER);
		add( new JButton("Recht"), BorderLayout.EAST);
		add( new JButton("Unter"), BorderLayout.SOUTH);
		setVisible(true);
	
	}

}
