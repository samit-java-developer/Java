package code.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.xml.crypto.Data;

public class LocalDateParsingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dateString = "2024-10-13";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		LocalDate date = LocalDate.parse(dateString, formatter);
		System.out.println(date.getYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfMonth());
	}

}
