package AskMe;

import java.util.Random;

class Question implements SharedConstants{
	Random rand = new Random();
	int ask() {
		int prob = (int) (100 * rand.nextDouble());
		if (prob < 30)
			return NE; // 30%
		else if (prob < 60)
			return ANO; // 60%
		else if (prob < 75)
			return POZDEJI; // 15%
		else if (prob < 98)
			return BRZY; // 13%
		else
			return NIKDY; // 2%
	}
}
