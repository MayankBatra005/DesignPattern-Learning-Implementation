/**
 * SER-515 
 * Node Visitor class for Visitor pattern
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */
public abstract class NodeVisitor {

	public abstract void visitFAcade(HacsFacade HF);

	public abstract Reminder visitAssignment(Assignment A);

	public abstract Reminder visitCourse(CourseList CL);

}
