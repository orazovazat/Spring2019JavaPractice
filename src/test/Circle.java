package test;

public class Circle extends Shape{
	
	public static void main(String[] args) {
		
		
		Shape s1 = new Circle();
		
		Circle c1 = (Circle) s1 ;
		s1.color = "red";
		
		Circle s2 = c1 ;
		
		System.out.println("s1 --> " + s1.color);
		System.out.println(c1.color);
		
		
		
	}

}
