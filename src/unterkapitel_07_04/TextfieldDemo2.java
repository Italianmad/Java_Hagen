package unterkapitel_07_04;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.*;



public class TextfieldDemo2  extends JFrame implements CaretListener {
	
	private String[] tiere = {"Hund", "Katze", "Maus", "Hamster", "Hase"};
	private JTextField filter;
	private JLabel gefilterteEintraege;
	
	public static void main(String args[]) {
		new TextfieldDemo2();
	}
	
	public TextfieldDemo2() {
		gefilterteEintraege = new JLabel();
		filter = new JTextField(15);
		filter.addCaretListener(this);
		
		JPanel eingabe = new JPanel();
		eingabe.setLayout(new FlowLayout());
		eingabe.add(new JLabel(" Ihre Eingabe "));
		eingabe.add(filter);
		
	
		setTitle("TextFieldDemo2");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(BorderLayout.NORTH, eingabe);
		add(BorderLayout.CENTER, gefilterteEintraege);
		setSize(500, 100);
		setVisible(true);
		eintrageFilter();	
	}
	
	
	public void eintrageFilter() {
		String wasBleibt = "Tiere, die zu Ihrer Eingabe passen: ";
		for(String t: tiere) {
			if(t.startsWith(filter.getText())) {
				wasBleibt += t;
			}
		}
		gefilterteEintraege.setText(wasBleibt);
	}
	
	public void caretUpdate(CaretEvent e) {
		eintrageFilter();
	}
	
	

}
