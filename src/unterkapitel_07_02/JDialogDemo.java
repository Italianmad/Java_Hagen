package unterkapitel_07_02;

import java.awt.*;
import javax.swing.*;

public class JDialogDemo extends JFrame {
	
	public static void main(String args[]) {
		new JDialogDemo();
	}
	
	public JDialogDemo() {
		setTitle("JDialogDemo");
		Color backg = new Color(1.0f, 0.0f, 0.0f);
		Color foreg = new Color(0.75f, 0.0f, 0.75f);
		Color red = foreg.red;
		
		getContentPane().setLayout(new FlowLayout());
		JButton button = new JButton("Clik me");
		button.setBackground(red);
		System.out.println(button.getText().toUpperCase());
		button.setFont(new Font("Times New Romans", Font.BOLD, 15));
		getContentPane().add(button);
		
		JButton button1 = new JButton("NOT US");
		Color green = new Color(0.1f, 0.5f, 0.0f);
		//button1.setOpaque(false);
		button1.setBackground(green);
		button1.setFont(new Font("Arial", Font.ITALIC,15));
		if (button.isOpaque()) System.out.println("is opaque");
		else System.out.println("is not opaque");
		getContentPane().add(button1);
		
		
		System.out.println(Toolkit.getDefaultToolkit().getScreenSize());		
		
		
		
		
	
		setSize(600,800);
		Dimension dim = getSize();
		System.out.println("The window is " + dim.width + " Pixels large and "+ dim.height + " Pixels height.");
		
		setLocation(new Point(6,8));
		Point p = getLocation();
		System.out.println("Position auf dem Bildschirm: " + p.x + " , "+ p.y );
		
		
		JDialog dialog = new JDialog(this); 
	
		dialog.setTitle("Security question");
		dialog.getContentPane().setLayout(new FlowLayout());
		dialog.getContentPane().setBackground(backg);
		dialog.getContentPane().setForeground(foreg);
		dialog.getContentPane().add(new JLabel("Bitte schließen Sie zunächst dieses Dialogfenster!"));
		dialog.pack();
		dialog.setAlwaysOnTop(true);
		dialog.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // Close button
		
		dialog.setResizable(false);
		dialog.setModal(true);
		
		setVisible(true);
		dialog.setVisible(true);
	}
	
	
}
