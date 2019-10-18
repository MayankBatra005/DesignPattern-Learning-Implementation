/**
 * SER-515 Software Agility Displays the grade of the selected student using
 * ViewGrades.JSP
 * 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */

public class Assignment extends Reminder{

	public Reminder accept(NodeVisitor nodeVisitor) {
		System.out.println("Assignment Reminder ...");
		return nodeVisitor.visitAssignment(this);
	}

}
