package enumField;

public class Main {
	private static final String FRESH_MAN = "0";
	private static final String GEEK = "1";
	private static final String UNABLE_TO_DEFY = "2";

	public static void main(String[] args) {
		Student student = new Student();
		String responseCode = "1";
		
		student.setAge(20);
		student.setName("David");
		student.setType(getTypeSwitch(responseCode));
		
//		if(FRESH_MAN.equals(resposeCode)) {
//			student.setType(Type.FRESH_MAN);
//		} else {
//			student.setType(Type.GEEK);
//		}
		
		
		
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getType());

	}
	
	private static Type getTypeSwitch(String responseCode) {
		
		switch (responseCode) {
		case FRESH_MAN:
			return Type.FRESH_MAN;
		case GEEK:
			return Type.GEEK;
		case UNABLE_TO_DEFY:
		default:
			return Type.UNABLE_TO_DEFY;
		}
	}
	
	private static Type getTypeIf(String responseCode) {
		if(FRESH_MAN.equals(responseCode)) {
			return Type.FRESH_MAN;
		} else if (GEEK.equals(responseCode)) {
			return Type.GEEK;
		}
		return Type.UNABLE_TO_DEFY;
	}

}
