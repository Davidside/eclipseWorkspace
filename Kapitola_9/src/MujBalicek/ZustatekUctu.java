package MujBalicek;

class ZustatekUctu {
	public static void main(String[] args) {
		Zustatek current[] = new Zustatek[3];
		current[0] = new Zustatek("Ferda Mravenec", 123.23);
		current[1] = new Zustatek("Brouk Pytlik", 157.02);
		current[2] = new Zustatek("Motyl Emanuel", -12.33);
		for(int i=0; i<3; i++) current[i].show();


	}

}
