package code.corejava.course.interfaceconcept;

// you can make it here interface
abstract class Computer{
	public abstract void code();
}

class Laptop extends Computer{
	public void code() {
		System.out.println("code, compile, run");
	}
}

class Desktop extends Computer{
	public void code() {
		System.out.println("code, compile, run: faster");
	}
}

class Developr {
	public void devApp(Computer comp) {
		comp.code();
	}
}

public class Demo {
	public static void main(String[] args) {
		Computer lap=new Laptop();
		Computer desk=new Desktop();
		
		Developr d=new Developr();
		d.devApp(lap);
		d.devApp(desk);
	}
}
