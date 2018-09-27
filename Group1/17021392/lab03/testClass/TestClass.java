package testClass;
import lab03.tenClasses.*;
import lab03.exercises.*;

public class TestClass {

	public static void main(String[] args) {
		
		Cat cat = new Cat("Jeff", "Red", 5);
		cat.printCat();
		cat.sayMeow();
		System.out.println(GCD.GCD(8, 4));
		System.out.println(Fibonacci.Fibonacci(5));
	}

}
