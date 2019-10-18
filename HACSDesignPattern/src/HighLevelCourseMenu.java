/**
 * SER-515 Software Agility Displays the grade of the selected student using
 * ViewGrades.JSP
 * 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */
public class HighLevelCourseMenu extends CourseMenu {

	@Override
	public void ShowAddButtons() {
		System.out.println();

	}

	@Override
	public void ShowViewButtons() {

		System.out.println();
	}

	@Override
	public void ShowRadios() {

		System.out.println();
	}

	@Override
	public void showComboxes() {

		System.out.println();
	}

	@Override
	public void ShowLabels() {

		System.out.println();
	}

	public void selectCourse(int USerType) {
		System.out.println("High Level Course Selected ...");
		// PersonFactory person;
		Person person;
		if (USerType == 0) {
			person = PersonFactory.createObject("Student");

		} else
		// if (USerType == 1)
		{
			person = PersonFactory.createObject("Instructor");

		}
		// Now we will show courses using iterator pattern
		person.ShowMenu();
		System.out.println("List of Courses will appear here ");

	}

}