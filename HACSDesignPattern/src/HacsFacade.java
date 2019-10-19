import java.util.Iterator;
import java.util.Scanner;

/**
 * SER-515 Facade class to take care of the facade pattern it calls the classes
 * for bridge pattern, factory pattern, visitor pattern, iterator pattern
 * 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */

public class HacsFacade {
	int UserType;
	String theSelecteCourse;
	int nCourseLevel;
	int theCourseList;
	int thePerson;

	public void startFacade() {
		System.out.println("Facade pattern initiated ");
		UserType = login(new Login());
		System.out.println(
				"Select from available Course Menus \n 1. High Level Course Menu \n 2. Low Level Course Menu ");
		Scanner scan = new Scanner(System.in);
		theSelecteCourse = scan.nextLine();
		// pattern implemented (Bridge implementation and Factory implementation
		if (theSelecteCourse.equalsIgnoreCase("High Level Course Menu")) {
			selectCourse(new HighLevelCourseMenu(), UserType);
		} else if (theSelecteCourse.equalsIgnoreCase("Low Level Course Menu")) {
			selectCourse(new LowLevelCourseMenu(), UserType);
		} else {
			System.out.println("Wrong Selection");
			System.exit(-1);
		}
		System.out.println("Implementing Visitor Pattern....");
		remind();
		System.out.println("Implementing Iterator pattern ....");
		CourseList courses = new CourseList();
		@SuppressWarnings("rawtypes")
		Iterator iterate = (Iterator) courses.createIterator();
		CourseIterator CourseIterator = new CourseIterator();
		SolutionList solList = new SolutionList();
		@SuppressWarnings("rawtypes")
		Iterator iterate2 = (Iterator) solList.createIterator();
		SolutionIterator si = new SolutionIterator();
		while (CourseIterator.HasNext(iterate)) {
			System.out.println(CourseIterator.Next(iterate));
			System.out.println(si.Next(iterate2));
		}
		scan.close();
	}

	public int login(Login object) {
		return object.login();
	}

	public void AddAssignment(AssignmentMenu AM) {
		AM.AddAssignment();
	}

	public void ViewAssignment(AssignmentMenu VM) {
		VM.ViewAssignment();
	}

	public void gradeSolution(SolutionMenu SM) {
		SM.gradeSolution();
	}

	public void reportSolution(SolutionMenu SM) {
		SM.reportSolution();
	}

	public void submitSolution(SolutionMenu SM) {
		SM.submitSolution();
	}

	public void remind() {
		ReminderVisitor remind = new ReminderVisitor();
		CourseList CL = new CourseList();
		CL.accept(remind);

	}

	public void createUser(UserInfoItem userinfoitem) {
		userinfoitem.createUSer();
	}

	public void createCourseList(CourseMenu CM) {
		CM.createCourseList();
	}

	public void AttachCourseToUser(CourseMenu CM) {
		CM.AttachCourseToUser();

	}

	public void selectCourse(CourseMenu CM, int UserType) {
		CM.selectCourse(UserType);
	}

	public void courseOperation(CourseMenu CM) {
		CM.courseOperation();
	}

}
