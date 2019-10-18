/**
 * SER-515 Software Agility Displays the grade of the selected student using
 * ViewGrades.JSP
 * 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */
public class Instructor extends Person {
	Instructor() {
		super(theCourseMenu);
	}

	Instructor(CourseMenu theCourseMenu) {
		super(theCourseMenu);
		// TODO Auto-generated constructor stub
	}

	// Implement the concept of high level or low level calling basis on the
	// available text files

	@Override
	public void ShowMenu() {
		System.out.println("Instructor Menu items....");

	}

	@Override
	public CourseMenu CreateCourseMenu() {
		// Create connection with low level and highlevel course menu
		String test = "High Level";
		if (test.equalsIgnoreCase("High Level")) {
			return new HighLevelCourseMenu();
		} else {
			return new LowLevelCourseMenu();
		}
	}

}
