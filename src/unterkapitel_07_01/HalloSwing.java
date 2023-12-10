package unterkapitel_07_01;
import javax.swing.*;
import java.awt.*;

public class HalloSwing extends JFrame{
 public static void main(String args[]) {
	 new MyFrame();
	 JFrame wind = new JFrame("Hallo People!");
	 JLabel comp = new JLabel("Klicken Sie den Knopf!");
	 JButton butt = new JButton("Klick mich!");
	 FlowLayout layout = new FlowLayout();
	 
	 wind.setSize(300,200);
	 wind.setLayout(layout);
	 wind.add(comp);
	 wind.add(butt);
	 
	 butt.setBackground(Color.RED);
	 wind.setBackground(Color.BLUE);
	 butt.setOpaque(true);
	 butt.setBorderPainted(false);
	 
	
	 
	 wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 wind.setVisible(true);
	 
	
	 
 }
}
