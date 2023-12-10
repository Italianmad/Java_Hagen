package unterkapitel_07_05;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SwingThreadDemo2 {
	public static void main(String args[]) {
		new SwingThreadDemo();
	}
	
	public SwingThreadDemo2 () {
		
	SwingUtilities.invokeLater (
			new Runnable () {
		public void run () {
		initialisiereGUI ();}});
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
		clickMe.addActionListener((ActionListener) this);
	}
	
	
	private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private void setSize(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void add(JButton clickMe) {
		// TODO Auto-generated method stub
		
	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}

	private void setLayout(FlowLayout flowLayout) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Event Handling wird durchgeführt im Thread ");
		System.out.println(Thread.currentThread().getName());
	}
}
