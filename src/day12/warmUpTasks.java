package day12;

import java.util.Scanner;

public class warmUpTasks {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in) ;
//		
//		String weather ;
//		String action ;
//		
//		System.out.println("What about a weather in outside?");
//		weather = scan.next();
//		String weather1 = "sunny" ; bu sekildede edip bolyar
//		
//		action = (weather.equals("sunny")) ? "go to out" : "stay at home" ;
//		
//		System.out.println(action);
//		
		
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter weather:");
		String weather = scan.nextLine();
		
		String whatToDo = (weather.equalsIgnoreCase("Sunny"))? "go out" : 
			(weather.equalsIgnoreCase("Cloudy"))? "take your umbrella with you" : 
				(weather.equalsIgnoreCase("windy"))? "wear your jacket" : 
					"stay at home & watch Netflix";
	System.out.println(whatToDo);
	}
	


	}


