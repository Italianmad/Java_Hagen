package unterkapitel_02_03;

public class BoolescheOperatoren {
	public static void main(String args[]) {
		int alter = 43;
		boolean Kind = alter <= 12;
		boolean Teenager = alter < 20 & alter > 12;
		boolean Erwachsen = alter > 19;
		
		System.out.println("Kind? " + Kind);
		System.out.println("Teenagen? " + Teenager);
		System.out.println("Erwachsen? " + Erwachsen);
		
	}

}


//Kind? false
//Teenager? false
//Erwachsen? true