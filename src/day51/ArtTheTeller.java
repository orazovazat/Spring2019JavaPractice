package day51;

public class ArtTheTeller {

	public static void main(String[] args) {
		
		//SavingAccount s1 = new SavingAccount("Azat", 12345, 2.3, 11000);
		SavingAccount s2 = new SavingAccount(2.3, "Azat", 12345, 11000);
		
		System.out.println(s2.toString());
		s2.deposit(1);
		s2.deposit(1);
		System.out.println("current amount is : " + s2.balance);
		s2.withdraw(10000);
		System.out.println("current amount is : " + s2.balance);

	}

}
