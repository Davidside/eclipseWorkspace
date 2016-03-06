package Interface;

class NestedIFDemo {
	public static void main(String[] args) {
		
		// pouziti odkazu na vnorene rozhrani
		A.NestedIF nif = new B();
		
		if(nif.isNotNegative(10))
			System.out.println("Hodnota 10 neni zaporna");
		if(nif.isNotNegative(-12))
			System.out.println("Tento radek se nikdy nezobrazi");

	}

}
