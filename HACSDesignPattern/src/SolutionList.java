import java.util.ArrayList;
import java.util.Iterator;

/**
 * SER-515 SolutionList to store list of solutions implementing the iterator pattern
 * 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */
public class SolutionList {

	ArrayList<String> sol = new ArrayList<>();

	SolutionList() {
		sol.add("Solution for CSE870");
		sol.add("Solution for CSE900");
		sol.add("Solution for CSE980");
	}

	@SuppressWarnings("rawtypes")
	public Iterator createIterator() {
		return this.sol.iterator();
	}
}
