package unterkapitel_07_03;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDemoApp extends JFrame{
	private JButton quitButton;
	private ActionListener actionEventHandler; 
	
	public EventDemoApp() {
		super("Event Handling Demo");
		actionEventHandler = new ActionEventHandler();
		
		quitButton = new JButton("Beenden");
		quitButton.addActionListener(actionEventHandler);
		
		setLayout(new FlowLayout());
		add(quitButton);
		pack();
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new EventDemoApp();
		
	}
 
}

