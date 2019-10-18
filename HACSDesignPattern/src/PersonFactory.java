
/**
 * SER-515 Software Agility Displays the grade of the selected student using
 * ViewGrades.JSP
 * 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */
public class PersonFactory extends Person {

	PersonFactory(CourseMenu theCourseMenu) {
		super(theCourseMenu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ShowMenu() {
		// TODO Auto-generated method stub

	}

	@Override
	public CourseMenu CreateCourseMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Person createObject(String str) {
		Person person;
		if (str.equalsIgnoreCase("Student")) {
			person = new Student();
		} else

		{
			person = new Instructor();
		}
		return person;
	}
}
