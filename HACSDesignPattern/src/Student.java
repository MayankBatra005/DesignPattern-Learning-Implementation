/**
 * SER-515 Student Class inheriting from person class and implementing bridge
 * pattern
 * 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */
public class Student extends Person {
	Student() {
		super(theCourseMenu);
	}

	Student(CourseMenu theCourseMenu) {
		super(theCourseMenu);
	}

	@Override
	public void ShowMenu() {
		System.out.println("Student Menu items ....");

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
