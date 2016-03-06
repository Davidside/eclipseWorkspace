package Interface;

class TestIface2 {
	public static void main(String[] args) {
		Callback c = new Client();
		AnotherClient ob = new AnotherClient();
		
		c.callback(42);
		
		c = ob; // c se nyni odkazuje na objekt tridy AnotherClient
		c.callback(42);

	}

}
