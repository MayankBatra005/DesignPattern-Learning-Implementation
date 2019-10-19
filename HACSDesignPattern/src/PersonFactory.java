
/**
 * SER-515 
 * Person Factory class responsible for factory pattern and returning the desired objects 
 * @author Mayank Batra, mbatra3@asu.edu
 * @version 1.0
 * @since 10-17-2019
 */
public class PersonFactory extends Person {

	PersonFactory(CourseMenu theCourseMenu) {
		super(theCourseMenu);
	}

	@Override
	public void ShowMenu() {}

	@Override
	public CourseMenu CreateCourseMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Person createObject(String str) {
		Person person;
		System.out.println("Factory Pattern Intiated for user creation....");
		if (str.equalsIgnoreCase("Student")) {
			person = new Student();
		} else

		{
			person = new Instructor();
		}
		return person;
	}
}
