package zeptejSe;

class ZeptejSe {
	static void odpoved(Odpovedi result) {
		switch(result) {
			case NE:
				System.out.println("Ne");
				break;
			case ANO:
				System.out.println("Ano");
				break;
			case MOZNA:
				System.out.println("Mozna");
				break;
			case POZDEJI:
				System.out.println("Pozdeji");
				break;
			case BRZY:
				System.out.println("Brzy");
				break;
			case NIKDY:
				System.out.println("Nikdy");
				break;
		}
	}
	
	public static void main(String[] args) {
		Otazka q = new Otazka();
		
		odpoved(q.ask());
		odpoved(q.ask());
		odpoved(q.ask());
		odpoved(q.ask());
	}

}
