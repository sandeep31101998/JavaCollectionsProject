import java.util.Scanner;

public class Aptitude {

	public static void main(String[] args) {

		String q1 = "Which of the following is not OOPS concept in Java?\n"
				+ " a. Inheritance\n b.Encapsulation\n c.Polymorphism\n d. Compilation\n";

		String q2 = " Which of the following is a type of polymorphism in Java?\n"
				+ " a. Compile time polymorphism\n b. Execution time polymorphism\n c. Multiple polymorphism\n d.Multilevel polymorphism\n";

		String q3 = "An expression involving byte, int, and literal numbers is promoted to which of these?\n"
				+ " a.  int\n b. long\n c. double\n d. boolean\n";

		String q4 = " Which concept of Java is a way of converting real world objects in terms of class?\n"
				+ " a. Polymorphism\n b.  Encapsulation\n c. Abstraction\n d.Inheritance\n";

		String q5 = "Which of these coding types is used for data type characters in Java?\n"
				+ " a. ASCII\n b. UNICODE\n c. NONE\n d.All of the above\n";

		String q6 = " When does Exceptions in Java arises in code sequence?\n"
				+ " a.  Run Time\n b. Compilation Time\n c.  Can Occur Any Time\n d. None of the mentioned\n";

		String q7 = "Which of these keywords is used to manually throw an exception?\n"
				+ " a. try\n b. finally\n c.  throw\n d. catch\n";

		String q8 = "Which method can be defined only once in a program?\n"
				+ " a. main method\n b. finalize method\n c. static method\n d. private method\n";

		String q9 = "Which of this keyword must be used to inherit a class?\n"
				+ " a.  super\n b. this\n c. extent\n d.extends\n";

		String q10 = " What is the default value of a char in Java?\n"
				+ " a. space \n b. 0\n c.  false\n d. null\n";

		McqQuestions[] questions = { 
				new McqQuestions(q1, "d"),
				new McqQuestions(q2, "a"),
				new McqQuestions(q3, "a"),
				new McqQuestions(q4, "c"),
				new McqQuestions(q5, "b"),
				new McqQuestions(q6, "a"),
				new McqQuestions(q7, "c"),
				new McqQuestions(q8, "a"),
				new McqQuestions(q9, "c"),
				new McqQuestions(q10, "a") };
		takeTest(questions);
	}

	public static void takeTest(McqQuestions[] McqQuestions) {
		int score = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < McqQuestions.length; i++) {
			System.out.println(McqQuestions[i].question);
			String answer = sc.nextLine();
			if (answer.equals(McqQuestions[i].answer)) {
				score++;
			}
		}
		float scr = (float) score / McqQuestions.length;
		float percentage = scr * 100f;
		System.out.println("you got " + score + " out of" + McqQuestions.length);
		System.out.println("you got " + percentage + "%");
		if (percentage <= 33) {
			System.out.println("Your preformance is  bad");
			System.err.println("Not eligiable for next round");
		} else if (percentage <= 54) {
			System.out.println("Your preformance is  poor");
			System.err.println("Not eligiable for next round");

		} else if (percentage <= 60) {
			System.out.println("Your preformance is  good");
			System.err.println("Eligiable for next round");
		} else if (percentage <= 75) {
			System.out.println("Your preformance is  very good");
			System.err.println("Eligiable for next round");
		} else {
			System.out.println("Your preformance is  excellent");
			System.err.println("Eligiable for next round");
		}
	}

}
