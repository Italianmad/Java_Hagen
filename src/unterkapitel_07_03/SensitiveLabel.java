package unterkapitel_07_03;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SensitiveLabel extends JLabel implements MouseListener {

	
	public SensitiveLabel(String text) {
        super(text);
        setOpaque(true);
		setBackground(Color.black);
		setForeground(Color.white);
		addMouseListener(this);

		
	}
	
	
	public void mouseEntered(MouseEvent e) {
		
		
	}
	
	public void mouseExited(MouseEvent e) {
		setBackground(Color.white);
		setForeground(Color.black);
	}
	
	public void mousePressed(MouseEvent e) {
	}
	
	public void mouseClicked(MouseEvent e) {
		
	}
	
	public void mouseReleased(MouseEvent e) {
		
	}
	
	public void mouseTaped(MouseEvent e) {
	
	}
	
}
