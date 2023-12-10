package unterkapitel_07_02;

import java.awt.*;
import javax.swing.*;

public class LayoutManagerDemo  extends JFrame {
	public static void main(String args[]) {
		LayoutManagerDemo demo = new LayoutManagerDemo();
		demo.setSize(600,800);
		
		demo.setAlwaysOnTop(true);
		demo.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		demo.setVisible(true);
		
	}
	public LayoutManagerDemo() {
		super("LayoutMagerDemo");

		add( new JButton("Erster Button"), BorderLayout.CENTER);
		add( new JButton("Zweiter Button"), BorderLayout.EAST);
		add( new JButton("Dritter Button"), BorderLayout.WEST);
		add( new JButton("Vierter Button"), BorderLayout.SOUTH);
		//setLayout(new GridLayout(10,12)); //Se uso BorderLayout non devo usare la griglia altrimenti sputtano tutto
		//setLayout(new FlowLayout(10,50,60)); // -> FlowLayout(int align, int hgap, int vgap)
		
		
		
		
	}
}
