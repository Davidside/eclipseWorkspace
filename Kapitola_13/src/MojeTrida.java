class MojeTrida {
	int a;
	int b;
	
	// inicializace promennych a i b rozdilnymi hodnotami
	MojeTrida(int i, int j) {
		a = i;
		b = j;
	}
	
	// inicializace promennych a i b stejnou hodnotou
	MojeTrida(int i) {
		a = i;
		b = i;
	}
	
	// prirazeni vychozi hodnoty 0 promennym a i b
	MojeTrida () {
		a = 0;
		b = 0;
	}
}
