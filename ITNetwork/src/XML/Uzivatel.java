package XML;

import java.util.Calendar;

public class Uzivatel {
	private String jmeno;
	private int vek;
	private Calendar registrovan;
	
	public Uzivatel(String jmeno, int vek, Calendar registrovan) {
		super();
		this.jmeno = jmeno;
		this.vek = vek;
		this.registrovan = registrovan;
	}

	public String getJmeno() {
		return jmeno;
	}

	public int getVek() {
		return vek;
	}

	public Calendar getRegistrovan() {
		return registrovan;
	}

	@Override
	public String toString() {
		return jmeno;
	}
	
	
}
