
public class InstructorManager extends UserManager {

	@Override
	public void addUser(User user) {
		System.out.println("Instructor " + user.userName + " added.");
	}
	@Override
	public void printInfos(User user) {
		System.out.println("Instructor name: " + user.userName + "\nInstructor No: " + user.userId  );
	}
}
