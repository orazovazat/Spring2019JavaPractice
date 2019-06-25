package day25;

public class task3 {

	public static void main(String[] args) {
		
		
		String[] courses = {
				"Welcome Kit",
				"Online-Java Programming",
		    	"Online-Software Development Lifecycle",
		    	"Online-Software QA Testing",
		    	"Online-Team Activity",
		    	"Online-Mentoring", 
		    	"Online-Selenium",
		    	"Online-SQL",
		    	"Online-API Testing"
				} ;
	int[] courseId = {143,166,168,170,163,203,169,171,164} ; 	
//	
//	     for (int i = 0; i < courseId.length; i++) {
//		   System.out.println("The course id for <" + courses[i]+"> is <" + courseId[i]+">");
//	}
		
	     ////////
	     
	     for (int i = 0; i < courseId.length; i++) {
			  
	    	 String eachCourse = courses[i];
	    	// System.out.println(eachCourse);
	    	 if(eachCourse.equals("Online-Java Programming") ){
	    		 System.out.println( "index is this : " + courseId[i]  );
	    		 break;
	    	 }
	     }
	     
	     /////////
	     
	     for (int j = 0; j < courseId.length; j++) {
	    	 if(courseId[j] == 203) {
	    		 System.out.println("203 Course name is : " + courses[j]);
	    		 break;
	    	 }
			
		}
	     
	     //////////
	     
	     int count = 0 ;
	     for (int m = 0; m < courses.length; m++) {
	    	 
			if(courses[m].contains("Software") ) {
				count++ ;
			}
		}
	     
	     System.out.println("Course that contains Software : " + count);
	     
	     
	     
	}

}
