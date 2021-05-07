package oopOdev;

public class CourseManager {
	
	public void registerCourse(Course course) {
		System.out.println( course.name + " kursuna kayit tamamlandi.");
	}
	
	public void listCourses(Course [] courseList) {
		for (Course course : courseList) {
			System.out.println(course.name);
		}
	}
	
}
