/**
 * SER-515 Abstract Reminder class for Visitor Pattern 
 * 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */
public abstract class Reminder {

	public abstract Reminder accept(NodeVisitor NV);

}
