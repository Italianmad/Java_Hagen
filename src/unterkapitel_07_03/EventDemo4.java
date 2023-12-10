package unterkapitel_07_03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDemo4 extends JFrame implements MouseListener{
	
	 private JButton redButton,greenButton;
	 
	public EventDemo4() {
		redButton = new JButton("Rot");
		greenButton = new JButton("Grün");
		
		redButton.addMouseListener(this);
		greenButton.addMouseListener(this);
		setLayout(new FlowLayout());
		setTitle("Event Demo 4");
		add(greenButton);
		add(new JLabel(" oder "));
		add(redButton);
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		}

	
public void	mouseEntered(MouseEvent e) {  // faccio cambiare i lavori 
	if(e.getSource()==redButton) {
		getContentPane().setBackground(Color.red);
	}
	else getContentPane().setBackground(Color.green);
	
}

public void mousePressed(MouseEvent arg0){}

public void mouseClicked(MouseEvent arg0){}


public void mouseReleased(MouseEvent arg0){}

public void mouseExited(MouseEvent arg0) {
	getContentPane().setBackground(Color.WHITE);
}


public static void main(String args[]) {
	new EventDemo4();
}
}
