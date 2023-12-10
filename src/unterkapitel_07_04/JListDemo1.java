package unterkapitel_07_04;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.Arrays;

public class JListDemo1 extends JFrame implements ListSelectionListener {
	
 public static void main(String args[]) {
	 new JListDemo1();
 }
 	private JList auswahlListe;
 	private String [] elemente = {"Hund", "Katze", "Maus", "Hamster", "Giraffe", "Pavian", "Klapperschlange"};
 	
 	public JListDemo1() {
 	   super("JListDemo1");
 	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	   
 	   auswahlListe = new JList<>(elemente);
 	 
 	   auswahlListe.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // per fare selezionare piu´ elementi
 	   auswahlListe.addListSelectionListener(this);
 	   
	  
	   setLayout(new BorderLayout());
	   add(new Label("Bitte wählen Sie Ihr Liebliengstier: "),BorderLayout.NORTH);
	   // add(auswahlListe,BorderLayout.CENTER);
	   add( new JScrollPane(auswahlListe), BorderLayout.CENTER);
	   setSize(350,100);
	   setVisible(true);
 	   
 	   
 	}
 	
 	public void valueChanged(ListSelectionEvent e) {
 		if (e.getValueIsAdjusting()) {return;} // per non farlo stampare due volte
 		Object[] selectedValues = auswahlListe.getSelectedValuesList().toArray();
 		System.out.println("ListSelectionEvent ausgelöst! Ausgewählte Elemente: "+ Arrays.toString(selectedValues).replace("[", "").replace("]", ""));

 	}
}
