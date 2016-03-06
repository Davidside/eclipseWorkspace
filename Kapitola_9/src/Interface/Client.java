package Interface;

class Client implements Callback {
	// Implementace metod rozhrani Callback
	public void callback(int p) {
		System.out.println("Metoda callback volana s " + p);
	}

	void nonIfaceMeth() {
		System.out.println("Tridy, implementujici rozhrani, mohou definovat i dalsi potrebne cleny. ");
	}
}
