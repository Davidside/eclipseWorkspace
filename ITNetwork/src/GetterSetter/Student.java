package GetterSetter;

public class Student {
	private String jmeno;
	private int vek;
	private boolean muz;
	private boolean plnolety;
	
    public Student(String jmeno, boolean pohlavi, int vek)
    {
            this.jmeno = jmeno;
            this.muz = pohlavi;
            setVek(vek);
    }
    
	public String getJmeno() {
		return jmeno;
	}
	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}
	public int getVek() {
		return vek;
	}
	public void setVek(int vek) {
		 
		this.vek = vek;
      	// pøehodnocení plnoletosti
		plnolety = true;
		if (vek < 18) {
			plnolety = false;
		}
     
	}
	public boolean isMuz() {
		return muz;
	}
	public boolean isPlnolety() {
		return plnolety;
	}
	
    @Override
    public String toString()
    {
            String jsemPlnolety = "jsem";
            if (!plnolety)
                    jsemPlnolety = "nejsem";
            String pohlavi = "muž";
            if (!muz)
                    pohlavi = "žena";
            return String.format("Jsem %s, %s. Je mi %s let a %s plnoletý.", jmeno, pohlavi, vek, jsemPlnolety);
    }
	
}
