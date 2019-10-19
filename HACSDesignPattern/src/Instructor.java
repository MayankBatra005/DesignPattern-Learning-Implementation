/**
 * SER-515 Instructor class to inherit person class
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
	}

	@Override
	public void ShowMenu() {
		System.out.println("Instructor Menu items....");

	}

	@Override
	public CourseMenu CreateCourseMenu() {
		String test = "High Level";
		if (test.equalsIgnoreCase("High Level")) {
			return new HighLevelCourseMenu();
		} else {
			return new LowLevelCourseMenu();
		}
	}

}
