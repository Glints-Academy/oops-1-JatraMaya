import java.util.Scanner;

public class WelcomeScreen {

	@SuppressWarnings("resource")
	static void welcome() {
		int command = 0;
		System.out.println("Welcome to Springfield Highschool Database System.");
		System.out.println("What would you like to do: \n" + "1. List Student\n" + "2. List Teacher\n"
				+ "3. Input New Student\n" + "4. Input New Teacher");
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Here: ");
		command = sc.nextInt();
		System.out.println("You choose command no." + command);
		System.out.print("\033[H\033[2J"); 
		System.out.flush(); 

	}

}
