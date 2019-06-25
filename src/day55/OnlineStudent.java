package day55;

public class OnlineStudent extends Student {

	int zoomID;

	public OnlineStudent(int id , String name , int ZoomID) {
		super(id , name);
		this.zoomID = zoomID ;
	}
	
	@Override
	public String toString() {
		return "OnlineStudent [zoomID=" + zoomID + ", id=" + id + ", name=" + name + "]";
	}

	@Override
	public void attendClass() {
		System.out.println("attend class using zoom");
	}

	public static void main(String[] args) {
		
		OnlineStudent s1 = new OnlineStudent(34,"Azat",522220);
//		s1.id = 101 ;
//		s1.name = "Spartan";
//		s1.zoomID = 20001 ;
		s1.attendClass();
		System.out.println(s1);
		
//		Student s2 = new Student();
		
		

	}

}
