package code.stream.top20;

public class Java8DateTime {
	public static void main(String[] args) {
		System.out.println("Current Local Date: " + java.time.LocalDate.now());
		// Used LocalDate API to get the date
		System.out.println("Current Local Time: " + java.time.LocalTime.now());
		// Used LocalTime API to get the time
		System.out.println("Current Local Date and Time: " + java.time.LocalDateTime.now());
		// Used LocalDateTime API to get both date and time
	}
}