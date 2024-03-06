public class Student {
	private String firstName;
	private int quiz1Grade;
	private int quiz2Grade;
	public Student(String fName) {
		firstName = fName;
	}
	public Student(String fName, int q1Grade) {
		firstName = fName;
		quiz1Grade = q1Grade;
	}
	public Student(String fName, int q1Grade, int q2Grade) {
		firstName = fName;
		quiz1Grade = q1Grade;
		quiz2Grade = q2Grade;
	}
	public void setQuiz1Grade(int grade) {
		quiz1Grade = grade;
	}
	public void setQuiz2Grade(int grade) {
		quiz2Grade = grade;
	}
	public void setFirstName(String name) {
		firstName = name;
	}
	public int getQuiz1Grade() {
		return quiz1Grade;
	}
	public int getQuiz2Grade() {
		return quiz2Grade;
	}
	public String getFirstName() {
		return firstName;
	}
	@Override
	public String toString() {
		return firstName + "\t" + quiz1Grade + "\t" + quiz2Grade;
	}
}
