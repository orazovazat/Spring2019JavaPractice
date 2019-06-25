package day35;

public class Task1 {

	public static void main(String[] args) {

		System.out.println(addNums(4, 5));
		System.out.println(addNums(1, 2, 3));
		addNums(7, 8, 9, 12);

	}

	public static int addNums(int a, int b) {

		return a + b;
	}

	public static int addNums(int a, int b, int c) {

		return a + b + c;
	}

	public static void addNums(int a, int b, int c, int d) {

		System.out.println(a + b + c + d);
	}

}

/*
 * /// Create few static methods called addNums 
    
    //  first one take 2 numbers and add them
    //  return the result as int 
    
    //  second one take 3 numbers and add them
      //  return the result as int 
      
    
    //  third one take 4 numbers and add them
    //  does not return a value , 
    // just print out the result 
        
      
    System.out.println( addNums(5,4)  );
    System.out.println( addNums(5,6,7) ) ;
    addNums(5,6,7,8);
    
    //System.out.println( addNums(5,6,7,8) ) ;
    
  }
  // not valid because of same method name and same method parameter list
//    public static void addNums(int x,int y) {
//      System.out.println("aaaaa");
//    }
  
  // not valid because of same method name and same method parameter list
//    public static int addNums(int a,int b) {
//      return a+b;
//    }
  
    public static int addNums(int x,int y) {
      return x+y;
    }
    public static int addNums(int x,int y,int z) {
      return x+y+z;
    }
    public static void addNums(int x,int y,int z,  int k) {
      System.out.println( x+y+z+k);
    }



}
 * 
 */
