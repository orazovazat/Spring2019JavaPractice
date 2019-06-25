package day61;

import day58.*;

public class IntanceOf {

  public static void main(String[] args) {
  
    
    Animal a1 = getMyAnimal() ; 
    
    // Cat c1 = (Cat) a1 ; 
    String objTypeName = a1.getClass().getSimpleName() ; 
    System.out.println(  objTypeName );

  }

  /*
   * create a static method that return Animal
   * and return valid animal sub class object  
   * */
  public static Animal getMyAnimal() {
    return new Cat(); // new Cat() ; 
  }
  
  
  
  
  

}
