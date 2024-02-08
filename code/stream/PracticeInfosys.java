package code.stream;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.stream.IntStream;

public class PracticeInfosys {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int[] result = IntStream.rangeClosed(0, arr.length - 1).map(i -> arr[arr.length - 1 - i]).toArray();
		for (int ele : result) {
			System.out.print(ele + " ");
		}

		System.out.println("\n-------------------------");

		String inputString = "abba";
		boolean isPailndrome = IntStream.rangeClosed(0, inputString.length() / 2)
				.noneMatch(i -> inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i));
		System.out.println(isPailndrome);

		System.out.println("\n Age of person in Years \n ");

		LocalDate birthDay = LocalDate.of(1998, 3, 15);
		LocalDate toDay = LocalDate.now();
		System.out.println(ChronoUnit.YEARS.between(birthDay, toDay));

	}

}
