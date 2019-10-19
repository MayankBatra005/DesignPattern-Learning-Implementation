/**
 * SER-515 Reminder Visitor class responsible for implementing visitor pattern
 * 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */
public class ReminderVisitor extends NodeVisitor {
	String m_Reminder;

	@Override
	public void visitFAcade(HacsFacade HF) {
		System.out.println("visiting Facade ....");

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
