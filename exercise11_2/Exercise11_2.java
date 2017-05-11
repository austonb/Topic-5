package exercise11_2;

public class Exercise11_2 {
	// Main method
		public static void main(String[] args) {
			// Create a Person, Student, Employee, Faculty, and Staff objects
			Person person = new Person();

			Student student = new Student();

			Employee employee = new Employee();

			Faculty faculty = new Faculty();

			Staff staff = new Staff();

			// Invoke toString of Person, Student, Employee, Faculty and Staff
			System.out.println(person.toString());
			System.out.println(student.toString());
			System.out.println(employee.toString());
			System.out.println(faculty.toString());
			System.out.println(staff.toString());
		}
	}

