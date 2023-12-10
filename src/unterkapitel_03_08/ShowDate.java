package unterkapitel_03_08;
import java.util.Date;
import unterkapitel_03_08.figures.*;


public class ShowDate {
		
		public static void main (String args []) {
			Date datum = new Date();
			java.util.Date aktuellesDatum = new java.util.Date();
			Circle kreis;
			kreis = new unterkapitel_03_08.figures.Circle(10);
			
			unterkapitel_03_08.figures.Rectangle r;
			r = new unterkapitel_03_08.figures.Rectangle(10,5);
		
			System.out.println ("Aktuelles Datum: "+datum);
			System.out.println ("Aktuelles Datum: "+aktuellesDatum);
			System.out.println ("Wir haben einen Oberflachekreis: "+ kreis.getArea());
			System.out.println ("Wir haben einen Oberflache für das Rechteck: "+ r.getArea());

		}

}
