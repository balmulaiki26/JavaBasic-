package oop;

public class Bmw extends Car {

	Car car = new Car();

	public int getHorsePower() {
		int newhp = horsepower;
		return newhp;
		
	}
	public void testMethodBmw() { 
		testMethodCars(); 
		System.out.println("from bmw");
	}
	public void polymorphismTest() { 
		System.out.println("Bmw Class");
	}
	
	public static void main(String[] args) {
		Bmw bmw = new Bmw();
		int staringVariable = bmw.getHorsePower();
		
		System.out.println(staringVariable);
		System.out.println(bmw.getHorsePower()+100);
		
		System.out.println(bmw.getHorsePower());
		System.out.println(staringVariable + 100);
		
		bmw.testMethodBmw();
		bmw.testMethodCars();
		
		bmw.polymorphismTest();  

	}

}
