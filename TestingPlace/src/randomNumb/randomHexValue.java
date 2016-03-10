package randomNumb;

import java.util.Random;

public class randomHexValue {
	public static void main(String args[]) {
		Random rand = new Random();
		int myRandomNumber = rand.nextInt(0x10) + 0x10; // Generates a random number between 0x10 and 0x20
		System.out.printf("%x\n",myRandomNumber); // Prints it in hex, such as "0x14"
		// or....
		String result = Integer.toHexString(myRandomNumber); // Random hex number in result
		
		System.out.println(getRandomHexString(16, 46));
	}
	
	   private static String getRandomHexString(int minimum, int maximum){
		   if(minimum < 0 || maximum < 0 || minimum > maximum) {
			   return null;
		   }
		   
	        Random r = new Random();
	        StringBuffer sb = new StringBuffer();
	        
	        int length = minimum + r.nextInt(maximum - minimum + 1);
	        
	        while(sb.length() < length){
	            sb.append(Integer.toHexString(r.nextInt()));
	        }

	        return sb.toString().substring(0, length);
	    }
}
