/*
 * Vypocet vzdalenosti, kterou urazi svetlo za zadany pocet dnu.
 * Pouzity jsou promenne typu long.
 */
class Light {

	public static void main(String[] args) {
		int lightspeed;
		long days, seconds, distance;
		
		// priblizna rychlost svetla v kilometrech za sekundu
		lightspeed = 299792;
		
		days = 1000; // zde zadejte pocet dnu
		
		seconds = days * 24 * 60 * 60; // prevod dnu na sekundy
		
		distance = lightspeed * seconds; // vypocet vzdalenosti
		
		System.out.print("Za " + days);
		System.out.print(" dnu svetlo urazi zhruba ");
		System.out.println(distance + " kilometru.");
		
		

	}

}
