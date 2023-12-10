package unterkapitel_07_03;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseEventDemo extends JFrame implements MouseListener {
	
	private JLabel label;
	public MouseEventDemo() {
		label = new JLabel("Ich reagiere...");
		label.setBackground(Color.gray);
		label.setForeground(Color.black);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		getContentPane().setBackground(Color.black);
		setLayout(new FlowLayout());
		add(label);
		setSize(100,100);
		setVisible(true);
		
	}
	
	
	public void mouseEntered(MouseEvent e) {
		label.setBackground(Color.white);
		
	}
	
	public void mouseExited(MouseEvent e) {
		label.setBackground(Color.black);
	}
	
	public void mousePressed(MouseEvent e) {
		label.setBackground(Color.red);
	}
	
	public void mouseClicked(MouseEvent e) {
		
	}
	
	public void mouseReleased(MouseEvent e) {
		label.setBackground(Color.gray);
	}
	
	public void mouseTaped(MouseEvent e) {
		
		
	}


	public static void main(String args[]) {
		new MouseEventDemo();
	}
}
