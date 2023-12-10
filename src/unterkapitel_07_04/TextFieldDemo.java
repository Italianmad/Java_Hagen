package unterkapitel_07_04;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldDemo extends JFrame implements ActionListener {
	public static void main(String args[]) {
		new TextFieldDemo();
	}

	private JTextField eingabefeld;
	private JLabel ausgabelabel;
	public TextFieldDemo() {
		
		ausgabelabel = new JLabel("Noch keine Zahl engegeben!");
		eingabefeld = new JTextField(10);
		eingabefeld.addActionListener(this);
		
		JPanel eingabeBereich  = new JPanel();
		eingabeBereich.setLayout(new FlowLayout());
		eingabeBereich.add(new Label("Wie alt sind Sie?"));
		eingabeBereich.add(eingabefeld);
		
		setTitle("Jahre in Tage umrechnen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		add(eingabeBereich, BorderLayout.CENTER);
		add(ausgabelabel, BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String eingabe = eingabefeld.getText();
		int jahre = Integer.parseInt(eingabe);
		int tage = jahre * 365;
		ausgabelabel.setText(jahre+ " Jahre entsprechen " + tage + " Tage!" );
		eingabefeld.setText(" ");
	}
}
