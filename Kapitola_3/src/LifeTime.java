// Ukazka zivotnosti promenne
class LifeTime {

	public static void main(String[] args) {
		int x;
		
		for(x = 0; x < 3; x++) {
			// y je inicializovana pri kazdem vstupu do bloku
			int y = -1;
			
			// nasledujici radek vzdy zobrazi hodnotu -1
			System.out.println("Hodnota y je: " + y);
			y = 100;
			System.out.println("Hodnota y nyni je: " + y);
		}

	}

}
