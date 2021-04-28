
public class Main {
		public static void main(String[] args) {
			String teacher = "Engin Demirog";
			String description = "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını..";
			Courses course1 = new Courses();
			course1.id = 1 ;
			course1.name = "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)";
			course1.price = 0;
			course1.teacher = teacher; 
			course1.description = description;
		    ManagerofCourses cikti = new ManagerofCourses();
		    cikti.enrollInTheCourse(course1);
		    cikti.enrollInTheCourse(course1);
			
			
			Courses course2 = new Courses();
			course2.id = 2 ;
			course2.name = "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)";
			course2.price = 0;
			course2.teacher = teacher;
			course2.description = description;
			ManagerofCourses cikti2 = new ManagerofCourses();
		    cikti2.enrollInTheCourse(course2);
		    cikti2.deleteTheSignFromCourse(course2);
			
			Courses course3 = new Courses();
			course3.id = 3;
			course3.name = "Programlamaya Giriş için Temel Kurs";
			course3.price = 0;
			course3.teacher = teacher;
			course3.description ="PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır..";
			ManagerofCourses cikti3 = new ManagerofCourses();
		    cikti3.enrollInTheCourse(course3);
			cikti3.deleteTheSignFromCourse(course3);
			Courses[] courses = {course1,course2,course3};
			ManagerofCourses liste = new ManagerofCourses();
			liste.listOfCourses(courses);
			
		}
}
