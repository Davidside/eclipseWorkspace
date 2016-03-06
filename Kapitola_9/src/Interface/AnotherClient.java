package Interface;

// Dalsi implementace rozhrani Callback
class AnotherClient implements Callback {
	// Implementace metod rozhrani Callback
	public void callback(int p) {
		System.out.println("Dalsi verze rozhrani callback");
		System.out.println("Druha mocnina p je rovna " + (p*p));
	}

}
