package code.corejava.course.enumconcept;

//Here status is a class, Running, Failed, Pending, Success are objects of Status class.

enum Status {
	// named constants
	Running, Failed, Pending, Success
}

public class Demo {

	public static void main(String[] args) {
		Status s = Status.Running;
		
		System.out.println(s.getClass().getSuperclass());
		
		System.out.println(s);
		Status[] ss = Status.values();
		for (Status status : ss) {
			System.out.println(status + " " + status.ordinal());
		}
		Status s1 = Status.Pending;
		if (s1 == Status.Running) {
			System.out.println("All Good");
		} else if (s1 == Status.Failed) {
			System.out.println("Try again");
		} else if (s1 == Status.Pending) {
			System.out.println("Please wait");
		} else {
			System.out.println("Done");
		}

		switch (s1) {
		case Running:
			System.out.println("All Good");
			break;
		case Failed:
			System.out.println("Try again");
			break;
		case Pending:
			System.out.println("Please wait");
			break;
		default:
			System.out.println("Done");
			break;
		}
	}
}
