package day3;


class Animal{
	public void eat() {
		
		System.out.println("Animal Eats");
	}
}

class Dog extends Animal{
	@Override
	public void eat() {
		
		System.out.println("Dog eats");
	}
}

class Lion extends Animal{
	@Override
	public void eat() {
		
		System.out.println("Lion eats");
	}
}

class Cat extends Animal{
	@Override
	public void eat() {
		
		System.out.println("Cat eats");
	}
}
public class MyOverRide {
	
	public static void main(String[] args) {
		Animal a = new Animal();   // creating object of Animal the Super class
		Dog d = new Dog();		// Creating object of dog class
		a = new Dog();			// creating refrencee variable of dog class with objict of base class
		a = new Cat();
		a.eat();				// calling eat function from dog class
//		System.out.println();

		System.out.println(a instanceof Dog);    // for checking instance validation
	}

	
}
