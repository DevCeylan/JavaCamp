package oopOdev;

public class Main {

	public static void main(String[] args) {
		
		CourseManager courseManager = new CourseManager();
		
		Course course1 = new Course(1, "C# + Angular", "Engin D.");
		Course course2 = new Course(2, "Java + React", "Engin D.");
		Course course3 = new Course(3, "Programlama Temelleri", "Engin D.");
		
		Course [] courseList = {course1,course2,course3};
		
		//methods:
		courseManager.listCourses(courseList);
		courseManager.registerCourse(course2);
		
	}

}
