package GetterSetter;

public class DemoUser {
	static User user = new User();
	
	static User getUser() {
		return user;
	}
	


	public static void main(String[] args) {
		
		user.setName("Pavel");
		
		System.out.println(user);
		
		User odkazUser = getUser();
		
		System.out.println(odkazUser);
		
		odkazUser.setName("Milan");
		
		System.out.println(user);
		System.out.println(odkazUser);

	}

}
