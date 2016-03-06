// Casti smycky for mohou byt vynechany.
class ForVar {

	public static void main(String[] args) {
		int i;
		boolean done = false;
		
		i = 0;
		for( ; !done; ) {
			System.out.println("Hodnota i je " + i);
			if (i == 10) done = true;
			i++;
		}
	}

}
