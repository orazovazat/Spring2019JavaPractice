package day49;

public class WarmUp {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.author = "Magtymguly";
		
		System.out.println(b1.author);
		
		PaperBook p1 = new PaperBook();
		p1.hardcover = true ;
		p1.weigth = 1.2 ;
		
		System.out.println(p1.hardcover);
		System.out.println(p1.weigth);
		
		AudioBook a1 = new AudioBook();
		a1.author = "Walter Savitch";
		a1.audioLength = 180.00 ;
		a1.printAuthor();
		System.out.println(a1.audioLength);
		a1.play();

	}

}
