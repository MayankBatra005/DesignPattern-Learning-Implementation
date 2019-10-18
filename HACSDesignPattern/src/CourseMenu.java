/**
 * SER-515 Software Agility Displays the grade of the selected student using
 * ViewGrades.JSP
 * 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */
public abstract class CourseMenu {

	public abstract void ShowAddButtons();

	public abstract void ShowViewButtons();

	public abstract void ShowRadios();

	public abstract void showComboxes();

	public abstract void ShowLabels();

	public abstract void selectCourse(int USerType);

	public void createCourseList() {
		System.out.println("Course List created ...");
	}

	public void AttachCourseToUser() {
		System.out.println("User Attached .... ");
	}

	public void courseOperation() {
		System.out.println("Operation performed on the course...");
	}

}
