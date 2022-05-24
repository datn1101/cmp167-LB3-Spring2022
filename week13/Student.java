import java.util.Arrays;

/*
 * 
 */
public class Student extends Person {
	private double gpa; 
	String [] currentCourses; 
	int courseNumber; 
	public Student() {
		super();
		this.gpa= 3.0; 
		currentCourses = new String[5];
	}
	public Student(String name, int age, double money, int hunger, double gpa, String[] currentCourses) {
		super(name, age, money, hunger); 
		this.gpa = gpa; 
		this.currentCourses = currentCourses;
	}
	public boolean passCourse(String course) {

		return true;
	}
	public boolean removeCourse(String course) {
		return true;
	}
	public boolean enrollInCourse(String course) { 
		if (courseNumber < currentCourses.length) {
			currentCourses [courseNumber++] = course; 
			return true;
		}
		System.out.println("Cannot enroll in more than "+currentCourses.length +" courses"); 
		return false;
	}
	public static void main(String[] args) {
		Student st1= new Student(); 
		System.out.println(st1); 
		System.out.println(Arrays.toString(st1.currentCourses)); 
		st1.enrollInCourse("CMP 167"); 
		st1.enrollInCourse("History"); 
		st1.enrollInCourse("Math"); 
		st1.enrollInCourse("English"); 
		st1.enrollInCourse("Italian"); 
		st1.enrollInCourse("Psychology"); 
		System.out.println(Arrays.toString(st1.currentCourses));
	}
	
}

