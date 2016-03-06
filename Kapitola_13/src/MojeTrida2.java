class MojeTrida2 {
	int a;
	int b;
	
	// inicializace promennych a i b rozdilnymi hodnotami
	MojeTrida2(int i, int j) {
		a = i;
		b = j;
	}
	
	// inicializace promennych a i b stejnou hodnotou
	MojeTrida2(int i) {
		this (i, i); // volani MojeTrida(i, i);
	}
	
	// prirazeni vychozi hodnoty 0 promennym a i b
	MojeTrida2 () {
		this (0); // volani MojeTrida(0);
	}
}
