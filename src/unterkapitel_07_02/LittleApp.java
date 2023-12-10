package unterkapitel_07_02;
import java.awt.*;
import javax.swing.*;

public class LittleApp extends JFrame {
	public static void main(String args[]) {
		
		LittleApp app = new LittleApp();
		app.setSize(200, 200);
		app.centerWindow();
		app.setVisible(true);
	
	}
	
	
	private Dimension screenSize;
	private Dimension appSize;
	private Dimension locationOnScreen;
	public LittleApp() {
		setTitle("Demo für Dimension, Point und Color");
		getContentPane().setLayout(new GridLayout(1,1));
		getContentPane().add(createColorPanel());
		
	}
	
	public JPanel createColorPanel() {
		
		int numberOfLabels = 10;
		JPanel colorPanel = new JPanel();
		colorPanel.setLayout(new GridLayout(numberOfLabels,1));
		
		for(int i=0; i < numberOfLabels; i++) {
			float greenValue = (float) i/numberOfLabels;
			
			Color componentColor = new Color(0.0f, greenValue, 0.0f);
			JComponent newComponent= new JLabel("LABEL NR." + (i+1));
			newComponent.setOpaque(true);
			newComponent.setBackground(componentColor);
			colorPanel.add(newComponent);
		}
		return colorPanel;
	}
	
	public void centerWindow () {
		Point locationOnScreen = new Point();
		appSize = getSize();
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		locationOnScreen.x = (screenSize.width - appSize.width)/2;
		locationOnScreen.y = (screenSize.height - appSize.height)/2;
		setLocation(locationOnScreen);
	}

}
