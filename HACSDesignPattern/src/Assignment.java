/**
 * SER-515 Assignment class responsible for implementing visitor pattern
 * 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */

public class Assignment extends Reminder {

	public Reminder accept(NodeVisitor nodeVisitor) {
		System.out.println("Assignment Reminder ...");
		return nodeVisitor.visitAssignment(this);
	}

}
