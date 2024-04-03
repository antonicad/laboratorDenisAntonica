package Laborator1;

import java.util.Arrays;

public class Allocation {
	   public static void main( String args[] ) {
		   int budget = 300;
		   
		   int[] prices = {999, 999, 999};
		   
		   int maxNumber = getMaxNumberOfHouses(budget, prices);
		   
		   System.out.println("You can buy a maximum of " + maxNumber + " houses.");
	   }
	   
	   public static int getMaxNumberOfHouses(int budget, int[] prices) {
//		   20 40 90 90
		   
		   Arrays.sort(prices);
		   
		   int countHouses = 0;
		   int totalSpent = 0;
		   
		   for (int price: prices) {
			   totalSpent += price;
			   
			   if (totalSpent <= budget) {
				   countHouses +=1;
			   } else {
				   break;
			   }
		   }
		   
		   return countHouses;
	   }
}
