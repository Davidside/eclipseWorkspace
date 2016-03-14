package enumField;

public enum Type {
	FRESH_MAN("0"),
	GEEK("1"),
	UNABLE_TO_DEFY("2");
	
	private final String code;
	
	private Type(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
	
	public static Type getByCode(String code) {
		for (Type element : Type.values()) {
			if(element.getCode().equals(code)) {
				return element;
			}
		}
		return Type.UNABLE_TO_DEFY;
	}
}
