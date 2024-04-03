package Laborator1;
import java.util.stream.*;


public class Candy {
	   public static void main( String args[] ) {
		   int n = 7;
		   int m = 3;
//		   int n = 5;
//		   int m = 10;
		   
		   int[] bags = {1, 2, 3, 4, 5, 6, 7};
//		   int[] bags = {7, 7, 7, 7, 7};
		   
		   int solution = remainder(m, bags);
		   System.out.println("Remainging candies: " + solution);
	   }
	   
	   public static int remainder(int m, int[] bags) {
//		   int calculatedSum = 0;
//		   
//		   for (int i: bags) {
//			   calculatedSum +=i;
//		   }
		   
		   int sum = IntStream.of(bags).sum();
		   
		   return sum % m;
	   }
}
