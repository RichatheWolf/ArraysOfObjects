import java.util.ArrayList;
import java.util.List;

public class StudentTester {
	public static void main(String[] args) {
		//testPositiveQuizScores();
		testQuizResults();
	}
	public static void testPositiveQuizScores() {
		Student student = new Student("Susan", 95);
		student.setQuiz2Grade(89);
		System.out.println(student);
	}
	public static void testQuizResults() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Sally", 92, 85));
		students.add(new Student("Brian", 98, 75));
		students.add(new Student("Marianne", 72, 88));
		students.add(new Student("Lionel", 62, 97));
		printStudentResults(students);
	}
	public static void printStudentResults(List<Student> students) {
		System.out.println("\t\tQuiz Results");
		System.out.println("Student Name\t Quiz1 Grade\t Quiz2 Grade\t Difference\t Average");
		System.out.println("======================================================");
		for (Student student : students) {
			System.out.println(student + " " + getDifference(student.getQuiz1Grade(), student.getQuiz2Grade()));
		}
		
	}
	public static String getDifference(double v1, double v2) {
		String formattedNumber = String.format("%.2f", v1 - v2);
		return formattedNumber;
	}
}
