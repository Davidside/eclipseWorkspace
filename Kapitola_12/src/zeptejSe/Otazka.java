package zeptejSe;

import java.util.Random;

// Vycet moznych odpovedi
enum Odpovedi {
	NE, ANO, MOZNA, POZDEJI, BRZY, NIKDY
}

class Otazka {
	Random rand = new Random();
	Odpovedi ask() {
		int prob = (int) (100 * rand.nextDouble());
		
		if (prob < 15)
			return Odpovedi.MOZNA; // 15%
		if (prob < 30)
			return Odpovedi.NE; // 30%
		else if (prob < 60)
			return Odpovedi.ANO; // 60%
		else if (prob < 75)
			return Odpovedi.POZDEJI; // 15%
		else if (prob < 98)
			return Odpovedi.BRZY; // 13%
		else
			return Odpovedi.NIKDY; // 2%
	}
}
