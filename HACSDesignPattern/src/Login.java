import java.util.Scanner;

/**
 * SER-515 Login class implementing the implementation for login using facade
 * class
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

		System.out.println("Enter Username ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String username = scan.next();
		System.out.println("Enter Password ");
		String password = scan.next();
		userType = validation(username, password);
		return userType;
	}

	public int validation(String username, String password) {
		if ((username.equalsIgnoreCase("Student")) && (password.equalsIgnoreCase(password))) {
			System.out.println("Welcome Student ");
			userType = 0;
		} else if ((username.equalsIgnoreCase("pepe")) && (password.equalsIgnoreCase("1111"))) {
			System.out.println("Welcome pepe ");
			userType = 0;
		} else if ((username.equalsIgnoreCase("yaya")) && (password.equalsIgnoreCase("2222"))) {
			System.out.println("Welcome yaya ");
			userType = 0;
		} else if ((username.equalsIgnoreCase("yape")) && (password.equalsIgnoreCase("3333"))) {
			System.out.println("Welcome yape ");
			userType = 0;
		} else if ((username.equalsIgnoreCase("Inst1")) && (password.equalsIgnoreCase("1111"))) {
			System.out.println("Welcome Instructor ");
			userType = 1;
		} else if ((username.equalsIgnoreCase("Instructor")) && (password.equalsIgnoreCase(password))) {
			System.out.println("Welcome Instructor ");
			userType = 1;
		} else {
			System.out.println("Bad User ");
			System.exit(-1);
		}

		return userType;

	}

}
