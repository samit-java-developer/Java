package code.datetime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserInputToDate {

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Date---: ");
		String inputDate = br.readLine();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		Date d=dateFormat.parse(inputDate);
		System.out.println(d);
		br.close();

	}

}
