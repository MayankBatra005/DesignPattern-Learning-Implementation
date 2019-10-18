import java.util.Scanner;

/**
 * SER-515 Software Agility Displays the grade of the selected student using
 * ViewGrades.JSP
 * 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */
public class Login {
	int userType;

	Login() {
		userType = 0;
	}

	public int login() {

		System.out.println("Inside Login");
		System.out.println("Enter Username ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String username = scan.next();
		System.out.println("Enter Password ");
		String password = scan.next();
		if ((username.equalsIgnoreCase("Student")) && (password.equalsIgnoreCase(password))) {
			System.out.println("Welcome Student ");
			userType = 0;
		} else if ((username.equalsIgnoreCase("Instructor")) && (password.equalsIgnoreCase(password))) {
			System.out.println("Welcome Instructor ");
			userType = 1;
		} else {
			System.out.println("Bad User ");
			System.exit(-1);
		}
		// scan.close();
		return userType;
	}

}
