/**
 * SER-515 Software Agility Displays the grade of the selected student using
 * ViewGrades.JSP
 * 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */
public class ReminderVisitor extends NodeVisitor {
	String m_Reminder;

	@Override
	public Reminder visitFAcade(HacsFacade HF) {
		System.out.println("visiting Facade ....");
		return new Assignment();
	}

	@Override
	public Reminder visitAssignment(Assignment A) {
		System.out.println("visiting Assignment ....");
		return A;
	}

	@Override
	public Reminder visitCourse(CourseList CL) {
		System.out.println("visiting Course ....");
		return CL;

	}

}
