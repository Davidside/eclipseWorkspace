package p2;

class Protection2 extends p1.Protection {
	Protection2() {
		System.out.println("odvozeny konstruktor v jinem balicku");
		
		// pristup pouze ze stejne tridy ci stejneho balicku
		// System.out.println("n = " + n);
		
		// pristup pouze ze stejne tridy
		// System.out.println("n_pri = " + n_pri);
		
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}
}
