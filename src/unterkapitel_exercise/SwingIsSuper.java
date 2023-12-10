package unterkapitel_exercise;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;



public class SwingIsSuper extends JFrame{
	 
	public static void main(String args[]) {
		
		 JFrame wind = new JFrame("Überschrift!");
		 JLabel comp = new JLabel("Swing ist super!");
		 wind.add(comp);
		 wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 wind.setSize(300,100);
		 wind.setVisible(true);
		
	}
}
