// Posun doleva jako rychla alternativa nasobeni 2.
class MultByTwo {

	public static void main(String[] args) {
		int i;
		int num = 0xffff_ffe;
		
		for(i=0; i<4; i++) {
			num = num << 1;
			System.out.println(num);
		}

	}

}
