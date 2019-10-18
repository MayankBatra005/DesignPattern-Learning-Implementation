/**
 * SER-515 Software Agility Displays the grade of the selected student using
 * ViewGrades.JSP
 * 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */
public class HACSMain {

	public static void main(String[] args) {
		// Facade Pattern called
		HacsFacade object = new HacsFacade();
		object.startFacade();

	}

}
