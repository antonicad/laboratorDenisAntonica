package Laborator2;

public class Triangle {
	public static void main(String[] args) {
		int n = 6;
		int totalCount = 0;
		for (int i = 1; i<=n; i++) {
			totalCount += triangle(i);
		}
		
		System.out.println(totalCount);
	}
	
//  obvious best O(1) solution => n^2

//	O(n)
	public static int triangle(int n) {
		if (n == 1) {
			return 1;
		}
		return 2 + triangle(n-1);
	}
}
