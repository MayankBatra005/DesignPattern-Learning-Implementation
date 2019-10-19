/**
 * SER-515
 * Person abstract class  
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */
public abstract class Person {
	protected static CourseMenu theCourseMenu;

	public abstract void ShowMenu();

	public abstract CourseMenu CreateCourseMenu();

	@SuppressWarnings("static-access")
	Person(CourseMenu theCourseMenu) {
		this.theCourseMenu = theCourseMenu;
	}

	public void ShowAddButtons() {
		theCourseMenu.ShowAddButtons();
	}

	public void shwViewButtons() {

		theCourseMenu.ShowViewButtons();
	}

	public void showRadios() {
		theCourseMenu.ShowRadios();
	}

	public void showCombos() {
		theCourseMenu.showComboxes();
	}

	public void showLabels() {
		theCourseMenu.ShowLabels();
	}
}
