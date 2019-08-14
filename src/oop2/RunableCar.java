package oop2;

public class RunableCar extends Car implements Vehicle {

	@Override
	public void start() {
System.out.println("Runable car starts");		
	}

	@Override
	public void stop() {
System.out.println("Runable car stops");		
	}

	@Override
	public void name() {
System.out.println("Runable car a name");		
	}


   public void wheels() {
System.out.println("Runable car has 4 wheels");		
	}
}