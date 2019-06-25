package assignments;

import java.util.Scanner;

public class task043RealEstate {

	public static void main(String[] args) {
		 //DO NOT CHANGE
	    int propertyPrice = 0; 
			int numberOfBedrooms, garageSpots;
			float metroAccessibility, schoolScore, highwayAccessibility;
			boolean backyard, smoking, garage;
			String houseType;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("*****************************************");
			System.out.println("* Welcome to the RealEstate calculator! *");
			System.out.println("*****************************************");
	    //WRITE YOUR CODE HERE
	    System.out.println("Enter your property type:");
	    houseType = scan.nextLine();
	  
	    switch(houseType){
	      case "Condo" :
	        propertyPrice = 50000 ;
	        break;
	        case "Townhouse" :
	        propertyPrice = 75000 ;
	        break;
	        case "Single Family Home" :
	        propertyPrice = 95000 ;
	        break;
	      
	      
	    }
	    
	    System.out.println("How many bedrooms do you have?");
	    numberOfBedrooms = scan.nextInt();
	    int pricePerRoom = 30000 ;
	    
	    System.out.println("Do you have a backyard?");
	    backyard = true ;
	    backyard = scan.nextBoolean();
	    int backyardPrice = 0;
	     if(houseType.equals("Condo")){
	     System.out.println("Backyard is not available for condo!");
	     }
	     
	     switch(houseType){
	      case "Condo" :
	        backyardPrice = 0 ;
	        break;
	        case "Townhouse" :
	        backyardPrice = 5000 ;
	        break;
	        case "Single Family Home" :
	        backyardPrice = 5000 ;
	        break;
	     }
	    System.out.println("Do you have garage?");
	    garage = true ;
	    garage = scan.nextBoolean();
	    int PriceGarageSpots = 20000 ;
	    
	    System.out.println("How many spots?");
	    garageSpots = scan.nextInt();
	    
	    if(garageSpots > 10){
	      garageSpots = 0 ;
	      System.out.println("Pardon,  it's not a public parking!");
	    }
	    
	    System.out.println("How close is metro station?");
	    metroAccessibility = scan.nextFloat();
	    int priceMetroAccessibility = 0;
	    
	    if(metroAccessibility <=1){
	      priceMetroAccessibility = 10000 ;
	    }else if(metroAccessibility>1 || metroAccessibility<=3){
	      priceMetroAccessibility = 5000 ;
	    }else{
	      priceMetroAccessibility = 0 ;
	    }
	    System.out.println("How close is highway?");
	    highwayAccessibility = scan.nextFloat();
	    int priceHighwayAccessibility = 0;
	    
	    if(highwayAccessibility <=1){
	      priceHighwayAccessibility = 15000 ;
	    }else if(highwayAccessibility>1 || highwayAccessibility<=5){
	      priceHighwayAccessibility = 8000 ;
	    }else if(highwayAccessibility>5 || highwayAccessibility<=20){
	      priceHighwayAccessibility = 4000 ;
	    }else{
	      priceHighwayAccessibility = 0 ;
	    }
	    
	    System.out.println("What's the rating of nearest school?");
	    schoolScore = scan.nextFloat();
	    int priceSchoolScore = 0;
	    
	    if(schoolScore > 0 || schoolScore < 4){
	      priceSchoolScore = 5000 ;
	    }else if(schoolScore>=8 || schoolScore<=10){
	      priceSchoolScore = 45000 ;
	    }else if(schoolScore>=4 || schoolScore<8){
	      priceSchoolScore = 20000 ;
	    }else{
	      priceSchoolScore = 0 ;
	    }
	    
	    System.out.println("Does any of your family members smoking?");
	   smoking = true ;
	   smoking = scan.nextBoolean();
	   
	   System.out.println("Market report has been generated.");
	   System.out.println("Your estimate market price is: "+
	   (propertyPrice+(pricePerRoom*numberOfBedrooms)+
	   backyardPrice+(garageSpots*PriceGarageSpots)+
	   priceMetroAccessibility+priceHighwayAccessibility+
	   priceSchoolScore)+"$");
	   
	   
	  }
	}

	


