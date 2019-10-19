import java.util.ArrayList;
import java.util.Iterator;

/**
 * SER-515 Course List class to implement the iterator pattern 
 * 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */
@SuppressWarnings("rawtypes")
public class CourseList extends Reminder {

	ArrayList<String> sol = new ArrayList<>();

	CourseList() {
		sol.add("Course CSE870");
		sol.add("Course CSE900");
		sol.add("Course CSE980");
	}


	public Iterator createIterator() {
		return this.sol.iterator();
	}

	public Reminder accept(NodeVisitor nodeVisitor) {
		System.out.println("Course List Reminder ...");
		return nodeVisitor.visitCourse(this);
	}

}
