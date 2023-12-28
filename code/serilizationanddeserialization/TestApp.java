package code.serilizationanddeserialization;

import java.io.*;
import java.io.Serializable;

class Dog implements Serializable{
	int i = 10;
	int j = 20;
}

public class TestApp {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d1 = new Dog();
		System.out.println("serialization started");
		FileOutputStream fos = new FileOutputStream(
				"D:\\Development with Coding\\Java-Coding\\code\\serilizationanddeserialization\\abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization ended");
		System.out.println("Deserialization started");
		FileInputStream fis = new FileInputStream(
				"D:\\Development with Coding\\Java-Coding\\code\\serilizationanddeserialization\\abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println("Deserialization ended");
		System.out.println("Dog object data");
		System.out.println(d2.i + "\t" + d2.j);
	}
}