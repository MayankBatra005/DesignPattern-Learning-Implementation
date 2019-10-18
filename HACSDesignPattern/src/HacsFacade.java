import java.util.Scanner;

/**
 * SER-515 Software Agility Displays the grade of the selected student using
 * ViewGrades.JSP
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
		// Facade Pattern implementation
		System.out.println("Facade pattern initiated ");
		UserType = login(new Login());

		System.out.println(
				"Select from available Course Menus \n 1. High Level Course Menu \n 2. Low Level Course Menu ");
		Scanner scan = new Scanner(System.in);
		theSelecteCourse = scan.nextLine();

		// System.out.println(theSelecteCourse);
		// pattern implemented (Bridge implementation and Factory implementation will
		// also occur in this only)
		if (theSelecteCourse.equalsIgnoreCase("High Level Course Menu")) {
			selectCourse(new HighLevelCourseMenu(), UserType);
		} else if (theSelecteCourse.equalsIgnoreCase("Low Level Course Menu")) {
			selectCourse(new LowLevelCourseMenu(), UserType);
		} else {
			System.out.println("Wrong Selection");
			System.exit(-1);
		}
		//	Visitor pattern client class 
		System.out.println("Implementing Visitor ....");
		ReminderVisitor rem=new ReminderVisitor();
		CourseList CL=new CourseList();
		CL.accept(rem);
		
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

	public void remind(Reminder rem) {

	//	rem.remind();
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
