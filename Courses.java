
public class Courses {
	
	int id ; 
	String name ; 
	String teacher ;
	double price ; 
	String description;
	public Courses () {
		System.out.println("The first constructor of Course class is working");

	}
	public Courses (int id, String name , String teacher ,double price, String description) {
		this.id = id ; 
		this.name = name ; 
		this.teacher = teacher;
		this.price = price;
		this.description = description;
		System.out.println("The second constructor of Course class is working");
	}
}
