package code.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

		LocalDateTime currentDate = LocalDateTime.now();
		System.out.println(currentDate);
		String formattedDate = currentDate.format(formatter);
		
		System.out.println(formattedDate);
		
		System.out.println("============================");
		LocalDate start=LocalDate.now();
		LocalDate end=start.plusDays(20);
		
		System.out.println(start);
		
		System.out.println(end);
	}

}
