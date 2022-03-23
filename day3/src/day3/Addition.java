package day3;

class MyOverload {
	static int add(int a, int b) {
		System.out.println("First");
		return a+b;
	}
	
	static double add(double a, double b) {
		System.out.println("second");
		return a+b;
	}
	
}
public class Addition{
	public static void main(String[] args) {
		System.out.println(MyOverload.add(12.0d,37.9d));
		System.out.println(MyOverload.add(12,37));
	}
}