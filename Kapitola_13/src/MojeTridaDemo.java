
class MojeTridaDemo {

	public static void main(String[] args) {
		MojeTrida mt1 = new MojeTrida(10, 20);
		MojeTrida mt2 = new MojeTrida(10);
		MojeTrida mt3 = new MojeTrida();
		
		MojeTrida2 mt21 = new MojeTrida2(10, 20);
		MojeTrida2 mt22 = new MojeTrida2(10);
		MojeTrida2 mt23 = new MojeTrida2();
		
		System.out.println("Pretizene konstruktory BEZ pouziti slova this");
		System.out.println("Hodnota a konstruktoru MojeTrida(10, 20): " + mt1.a);
		System.out.println("Hodnota b konstruktoru MojeTrida(10, 20): " + mt1.b);
		System.out.println();
		
		System.out.println("Hodnota a konstruktoru MojeTrida(10): " + mt2.a);
		System.out.println("Hodnota b konstruktoru MojeTrida(10): " + mt2.b);
		System.out.println();
		
		System.out.println("Hodnota a konstruktoru MojeTrida(): " + mt3.a);
		System.out.println("Hodnota b konstruktoru MojeTrida(): " + mt3.b);
		System.out.println();
		
		System.out.println("Pretizene konstruktory S pouzitim slova this");
		System.out.println("Hodnota a konstruktoru MojeTrida2(10, 20): " + mt21.a);
		System.out.println("Hodnota b konstruktoru MojeTrida2(10, 20): " + mt21.b);
		System.out.println();
		
		System.out.println("Hodnota a konstruktoru MojeTrida2(10): " + mt22.a);
		System.out.println("Hodnota b konstruktoru MojeTrida2(10): " + mt22.b);
		System.out.println();
		
		System.out.println("Hodnota a konstruktoru MojeTrida2(): " + mt23.a);
		System.out.println("Hodnota b konstruktoru MojeTrida2(): " + mt23.b);

	}

}
