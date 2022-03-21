import java.util.Scanner;

public class Switches {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please input your single character grade:");
		// Convert user input to lower case and get the char at 0th index ->
		// input.next().toLowerCase.charAt(0);
		char grade = input.next().charAt(0);

		switch (grade) {

		case 'A':
		case 'a':
			System.out.println("Well done!");
			break;
		case 'B':
		case 'b':
			System.out.println("Can do better");
			break; // breaks must go at the end of every case
		case 'C':
		case 'c':
			System.out.println("You need to work on the concepts");
			break;
		case 'D':
		case 'd':
			System.out.println("Not good");
			break;
		default:
			System.out.println("Looks like you failed the course");
			break;
		}

		System.out.println("Thank you!");
		input.close();

	}

}
