/**
 * SER-515 Software Agility Displays the grade of the selected student using
 * ViewGrades.JSP
 * 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */
public abstract class NodeVisitor {

	public abstract Reminder visitFAcade(HacsFacade HF);

	public abstract Reminder visitAssignment(Assignment A);

	public abstract Reminder visitCourse(CourseList CL);



}
