package code.serilizationanddeserialization;

import java.io.*;


class Animal {
	int i;
	public Animal() {
		System.out.println("No arg constructor of Animal.....");
	}
	
}

class Dog2 extends Animal implements Serializable{
	int j=20;
	public Dog2() {
		System.out.println("No arg constructor of Dog2.....");
	}
	
}

public class TestSerilizationInheritance {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Dog2 d=new Dog2();
		d.i=20;
		d.j=30;
		
		System.out.println("Serilization started.......");
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("Serilization ended.......");
		
		
		System.out.println("DeSerilization started.......");
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		d=(Dog2)ois.readObject();
		
		System.out.println("DeSerilization ended......."+d.i+" "+d.j);
		
	}
}