/**
 * SER-515 High level Course responsible for bridge patterna and factory pattern
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
		System.out.println("High Level Course Selected ...\n Bridge Pattern for connection used");
		Person person;
		if (USerType == 0) {
			person = PersonFactory.createObject("Student");

		} else
		{
			person = PersonFactory.createObject("Instructor");

		}
		person.ShowMenu();
	}

}
