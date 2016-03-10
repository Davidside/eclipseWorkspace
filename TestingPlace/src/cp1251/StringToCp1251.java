package cp1251;

import java.io.UnsupportedEncodingException;

public class StringToCp1251 {
	public static void main(String args[]) throws UnsupportedEncodingException {
		
		String descriptionInRussia = "фвацпекуцпц";
		String descriptionInCzech = "ěščřžřýáíéů";
		System.out.println(getDescInCp1251(descriptionInRussia));
		System.out.println(getDescInCp1251(descriptionInCzech));
	}
	
	private static String getDescInCp1251(String desc) throws UnsupportedEncodingException {
		return new String(desc.getBytes("cp1251"), "cp1251");
	}


}
