package Laborator2;

public class BunnyEars {
	public static void main(String[] args) {
		int result = bunnyEars(100);
		System.out.println(result);
	}
	
//  obvious best O(1) solution => return n*2

//	O(n)
	public static int bunnyEars(int n) {
		if (n == 1) {
			return 2;
		}
		return 2 + bunnyEars(n-1);
	}
}

// f(4) = 2 + f(3) = 2 + 6 = 8
// f(3) = 2 + f(2) = 2 + 4 = 6
// f(2) = 2 + f(1) = 2 + 2 = 4
// f(1) = 2