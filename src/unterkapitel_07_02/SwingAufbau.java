package unterkapitel_07_02;
import java.awt.*;
import javax.swing.*;

public class SwingAufbau {
	public static void main (String args[]) {
		JFrame frame = new JFrame("Eine typische Swinganwendung");
		JPanel inputPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		
		JButton okButton = new JButton("OK");
		JButton cancelButton = new JButton("Abbrechen");
		JLabel text = new JLabel("Bitte geben Sie Ihren Namen ein: ");
		JTextField input = new JTextField(20);
		
		//inputPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		inputPanel.setBackground(Color.green);
		inputPanel.add(text);
		inputPanel.add(input);
		
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.setBackground(Color.blue);
		buttonPanel.add(okButton);
		buttonPanel.add(cancelButton);
		
		frame.getContentPane().setLayout(new GridLayout(2,1));
		frame.getContentPane().add(inputPanel,FlowLayout.LEFT);
		frame.getContentPane().add(buttonPanel);
		
     	okButton.addActionListener(e->{
			String inputText = input.getText();
			JOptionPane.showMessageDialog(frame, "Hallo "+ inputText);
			
		});
////		
	cancelButton.addActionListener(e->{
			String inputText = input.getText();
			JOptionPane.showMessageDialog(frame, "We love you "+ inputText.substring(0,3)); // Substring here works !!! :D
		  inputPanel.remove(okButton);
			
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}

}
