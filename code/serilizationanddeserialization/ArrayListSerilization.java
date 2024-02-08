package code.serilizationanddeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerilization {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");

		try {

			System.out.println("Serilization-----------------");
			FileOutputStream fos = new FileOutputStream("file.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();

			System.out.println("Deserilization---------------");
			FileInputStream fis = new FileInputStream("file.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<String> list = (ArrayList<String>) ois.readObject();
			System.out.println(list);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
