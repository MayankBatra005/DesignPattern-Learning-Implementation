import java.util.Iterator;

/**
 * SER-515 Course Iterator to implement iterator pattern
 * 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */

public class CourseIterator extends ListIterator {
	@SuppressWarnings("rawtypes")
	public boolean HasNext(Iterator iterator) {
		return iterator.hasNext();
	}

	@SuppressWarnings("rawtypes")
	public void MoveToHead(Iterator iterator) {
		System.out.println("Head Moved..");
	}

	@SuppressWarnings("rawtypes")
	public String Next(Iterator iterator) {
		if (this.HasNext(iterator)) {
			return (String) iterator.next();
		} else {
			return null;
		}
	}

	@SuppressWarnings("rawtypes")
	public void Remove(Iterator iterator) {
		if (this.HasNext(iterator)) {
			iterator.next();
		}

	}

}
