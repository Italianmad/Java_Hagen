package unterkapitel_07_02;

import java.awt.*;
import javax.swing.*;

public class OkButton extends JButton {
	public static void main(String args[]) {
		new OkButton();
		
	}
	public OkButton() {
		 makeItOkAndGreen();
	}
	
	private void makeItOkAndGreen() {
		setText("Ok");
		
		setBackground(Color.green);
		setForeground(Color.white);
	}
	

}
