package Laborator2;

public class Factorial {
	public static void main (String[] args) {
		int result = factorial(6);
		System.out.println(result);
	}
	
	public static int factorial(int number) {
		
		if (number == 1) {
			return number;
		}
		
		return number * factorial (number - 1);
	}
}

// f(1) = 1
// f(2) = 2 * f(1) = 2 * 1 = 2
// f(3) = 3 * f(2) = 3 * 2 = 6
// f(4) = 4 * f(3) = 4 * 6 = 24
// f(5) = 5 * f(4) = 5 * 24 = 120
// f(6) = 6 * f(5) = 6 * 120 = 720