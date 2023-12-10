package unterkapitel_07_05;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SwingThreadDemo extends JFrame implements ActionListener{
	
	public static void main(String args[]) {
		new SwingThreadDemo();
	}
	
	public SwingThreadDemo() {
		initialisiereGUI();
	}
	
	
	public void initialisiereGUI() {
		System.out.println("GUI Initialisierung wird durchgeführt im Thread ");
		System.out.println(Thread.currentThread().getName());
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,200);
		setVisible(true);
		
		JButton clickMe = new JButton("CLICK ME");
		add(clickMe);
		clickMe.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Event Handling wird durchgeführt im Thread ");
		System.out.println(Thread.currentThread().getName());
	}
}
