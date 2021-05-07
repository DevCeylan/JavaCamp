
public class Main {

	public static void main(String[] args) {
		// For testing purposes, encapsulation applications have been ignored.
		
		Student student = new Student();
		student.userId = "10001";
		student.userName = "Mehmet C.";
		
		Instructor instructor = new Instructor();
		instructor.userId = "20001";
		instructor.userName = "Engin D.";
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		studentManager.addUser(student);
		instructorManager.addUser(instructor);
		
		studentManager.printInfos(student);
		instructorManager.printInfos(instructor);
	}

}
