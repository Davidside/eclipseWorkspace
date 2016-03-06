package ImportMujBalicek;

import MujBalicek.*;

class TestovaciZustatek {
	public static void main(String[] args) {
		
		/* Protoze trida Zustatek je deklarovana jako public
		 * muzete tuto tridu pouzit a muzete volat konstruktora teto tridy.
		 */

		Zustatek test = new Zustatek("Josef Kremilek", 99.88);
		
		test.show(); // a muzete volat i metodu show()
	}

}
