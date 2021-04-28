
public class Categories {
	public Categories() {
		System.out.println("The first constructor of categories is working");
		name = "All";
	}
	
	public Categories(int id, String name) {
		System.out.println("The first constructor of categories is working");
		this.id = id;
		this.name = name;
	}
	
	int id;
	String name;
}
