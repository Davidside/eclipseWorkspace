package p2;

class OtherPackage {
	OtherPackage() {
		p1.Protection p = new p1.Protection();
		System.out.println("Konstruktor tridy v jinem balicku");
		
		// pristup pouze ze stejne tridy ci stejneho balicku
		// System.out.println("n = " + p.n);
		
		// pristup pouze ze stejne tridy
		// System.out.println("n_pri = " + p.n_pri);
		
		// pristup pouze ze stejne tridy, podtridy ci stejneho balicku
		// System.out.println("n_pro = " + p.n_pro);
		
		System.out.println("n_pub = " + p.n_pub);
	}
}
