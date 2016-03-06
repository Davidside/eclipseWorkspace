package BoundedWildcard;

// Zolik s omezenim jako argument.

// Souradnice pro praci ve 2D.
class TwoD {
	int x, y;
	
	TwoD(int a, int b) {
		x = a;
		y = b;
	}
}

// Souradnice pro praci ve 3D.
class ThreeD extends TwoD {
	int z;
	
	ThreeD(int a, int b, int c) {
		super(a, b);
		z = c;
	}
}

// Souradnice pro praci ve 4D.
class FourD extends ThreeD {
	int t;
	
	FourD(int a, int b, int c, int d) {
		super (a, b, c);
		t = d;
	}
}

// V teto tride je ulozeno pole objektu se souradnicemi.
class Coords<T extends TwoD> {
	T[] coords;
	
	Coords(T[] o) { 
		coords = o; 
	}
}

// Ukazka pouziti zoliku s omezenim.
class BoundedWildcard {
	static void showXY(Coords<?> c) {
		System.out.println("Souradnice X Y:");
		for(int i=0; i < c.coords.length; i++) {
			System.out.println(c.coords[i].x + " " + c.coords[i].y);
		}
		System.out.println();
	}
	
	static void showXYZ(Coords<? extends ThreeD> c) {
		System.out.println("Souradnice X Y Z:");
		for(int i=0; i < c.coords.length; i++) {
			System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
		}
		System.out.println();
	}
	
	static void showAll(Coords<? extends FourD> c) {
		System.out.println("Souradnice X Y Z T:");
		for(int i=0; i < c.coords.length; i++) {
			System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		TwoD td[] = {
				new TwoD(0, 0),
				new TwoD(7, 9),
				new TwoD(18, 4),
				new TwoD(-1, -23)
		};
		
		Coords<TwoD> tdlocs = new Coords<TwoD>(td);
		
		System.out.println("Obsah objektu tdlocs.");
		showXY(tdlocs); // Ok, je to objekt TwoD
		// showXYZ(tdlocs); // Chyba, neni to objekt ThreeD
		// showAll(tdlocs); // Chyba, neni to objekt FourD
		
		// A nyni vytvorime objekt typu ForD.
		FourD fd[] = {
				new FourD(1, 2, 3, 4),
				new FourD(6, 8, 14, 8),
				new FourD(22, 9, 4, 9),
				new FourD(3, -2, -23, 17),
		};
		
		Coords<FourD> fdlocs = new Coords<FourD>(fd);
		
		System.out.println("Obsah objektu fdlocs.");
		// Vsehna nize uvedena volani jsou v poradku
		showXY(fdlocs);
		showXYZ(fdlocs);
		showAll(fdlocs);
	}

}
