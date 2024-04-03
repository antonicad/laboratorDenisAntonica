package Laborator2;

public class Fibonacci {
	public static void main(String[] args) {
		for(int i = 0; i <= 6; i++){
			System.out.print(fibonacci(i) + " ");
		}
	}
	
	public static int fibonacci(int number) {
		if(number == 0){
			return 0;
		}
		
		if(number == 1){
			return 1;
		}
		
		return fibonacci(number-2) + fibonacci(number-1);
	}
}


// f(6) => f(4) + f(5) = 3 + 5 = 8
	// f(4) => f(2), f(3) => 1 + 2 = 3
		// f(2) => f(0) + f(1) = 0 + 1 = 1
			// f(0) = 0
			// f(1) = 1

		// f(3) => f(1) + f(2) = 1 + 1 = 2
				// f(1) = 1
				// f(2) = (f0) + f(1) = 0 + 1 = 1
					// f(0) = 0
					// f(1) = 1

// f(5) = f(3) + f(4) = 2 + 3 = 5