package unterkapitel_02_07;

public class ZahlenRaten3 {
	public static void main(String args[]) {

		do {
			game();
		} while (Playagain());
		System.out.println("Auf wiedersehen!");
	}

	public static void game() {
		int numberToGuess, numberOfGuesses;
		System.out.println("Zahlenratespiel");
		System.out.println("---------------");
		numberOfGuesses = 0;
		numberToGuess = getRandomNumber(1,100);
		do {
			numberOfGuesses++;
		}

		while (!evaluateGuess(getPlayersGuess(), numberToGuess));
		System.out.println("Richtig! Die zu ratende Zahl war " + numberToGuess);
		System.out.println("Sie benötigten " + numberOfGuesses + " Versuche!");
	};

	public static int getPlayersGuess() {
		int tipp;
		do {

			System.out.print("Ihr Tipp: ");
			tipp = readInt();

			if (tipp < 1 || tipp > 100) {
				System.out.println("Tipp nicht gewertet!");
				System.out.println("Geben Sie eine Zahl zwischen 1 und 100 ein!");
				continue;
			}
		} while (tipp < 1 || tipp > 100);
		return tipp;
	}

	public static boolean evaluateGuess(int guess, int numberToGuess) {
		if (numberToGuess > guess) {
			System.out.println("Meine Zahl ist größer!");
			return false;
		} else if (numberToGuess < guess) {
			System.out.println("Meine Zahl ist kleiner!");
			return false;
		} else
			return true;
	}

	public static boolean Playagain() {
		System.out.println("Geben Sie 1 ein, wenn Sie noch mal spielen möchten ");
		int nummer;
		nummer = readInt();
		return nummer == 1;

	}
	
	public static int getRandomNumber(int min, int max) {
		int numberToGuess = (int) (Math.random() * max) + min;
		return numberToGuess;
	}

	public static int readInt() {
		java.io.BufferedReader br;
		br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

		try {
			return Integer.parseInt(br.readLine());
		} catch (Exception ex) {
			return 0;
		}

	}
}
