package Laborator2;

public class PrintDigits {
	public static void main (String[] args) {
		printDigit(1234);
	}

	public static void printDigit(int number) {
		if (number < 10) {
			System.out.println(number);
		} else {
			printDigit(number / 10);
			System.out.println(number % 10);
		}
	}
	
//	public static void printDigit(int number) {
//		String nr = String.valueOf(number);
//		for(int i = 0; i < nr.length(); i++) {
//		    int j = Character.digit(nr.charAt(i), 10);
//		    System.out.println(j);
//		}
//	}
}
