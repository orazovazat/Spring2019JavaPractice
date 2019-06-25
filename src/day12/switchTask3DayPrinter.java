package day12;

import java.util.Scanner;

public class switchTask3DayPrinter {

	public static void main(String[] args) {
		
		
		 Scanner scan = new Scanner(System.in);

		    System.out.println("Enter Day number : ");
		    int dayNum = scan.nextInt();
		    String dayWord = "Unknown";

		    switch (dayNum) {

		    case 1:
		      dayWord = "Monday";
		      break;
		    case 2:
		      dayWord = "Tuesday";
		      break;
		    case 3:
		      dayWord = "Wendesday";
		      break;
		    case 4:
		      dayWord = "Thursday";
		      break;
		    case 5:
		      dayWord = "Friday";
		      break;
		    case 6:
		      dayWord = "Saturday";
		      break;
		    case 7:
		      dayWord = "Sunday";
		      break;

		    default:
		      dayWord = "Invalid Day";
		      break;
		    }
		    System.out.println("the day is:" + dayWord);

		  }

		}

//		Scanner scan = new Scanner(System.in);
//
//		int dayNum;
//		String dayWord;
//
//		System.out.println("Enter Day number");
//		dayNum = scan.nextInt();
//
//		switch (dayNum) {
//		case 1:
//			System.out.println("Day Word is Monday");
//			break;
//		case 2:
//			System.out.println("Day Word is Tuesday");
//			break;
//		case 3:
//			System.out.println("Day Word is Wednesday");
//			break;
//		case 4:
//			System.out.println("Day Word is Thursday");
//			break;
//		case 5:
//			System.out.println("Day Word is Friday");
//			break;
//		case 6:
//			System.out.println("Day Word is Saturday");
//			break;
//		case 7:
//			System.out.println("Day Word is Sunday");
//			break;
//
//		default:
//			System.out.println("Day word is Invalid");
//
//		}
//
//	}
//
//}
