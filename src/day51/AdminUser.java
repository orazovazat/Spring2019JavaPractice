package day51;

public class AdminUser extends SlackUser {

	int adminLevel;
//	String displayName ;
//	int timezone ;
//	String status ;

	public AdminUser(int adminLevel, String displayName, int timezone, String status) {
		super(displayName, timezone, status);
		this.adminLevel = adminLevel;
	}

	public void sendMessage(String message) {
		System.out.println("@channel Dear good people of Sparta");
//		System.out.println("<" + displayName + "> is sending <" + message + ">");
	    System.out.println("kajhsbdjsbdksdknsk");
	    System.out.println("rebollius kids");
	}

	public static void main(String[] args) {

		AdminUser a1 = new AdminUser(1, "B11", 5, "Fully Charged");
		a1.sendMessage("abc");
	}

}
