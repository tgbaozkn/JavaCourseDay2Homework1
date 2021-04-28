
public class ManagerofCourses {
	public void enrollInTheCourse(Courses course) {
		System.out.println("Signed up successfully to "+course.name +", Congrats!" );
	}
	public void deleteTheSignFromCourse(Courses course) {
		System.out.println("Delete the sign from"+ course.name);
	}
	public void listOfCourses(Courses[] courses) {
		for(Courses course : courses ) {
			System.out.println(course.name);
		}
	}
}
