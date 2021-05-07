
public class StudentManager extends UserManager {

	@Override
	public void addUser(User user) {
		System.out.println("Student " + user.userName + " added.");
	}
	@Override
	public void printInfos(User user) {
		System.out.println("Student name: " + user.userName + "\nStudent No: " + user.userId  );
	}
}
