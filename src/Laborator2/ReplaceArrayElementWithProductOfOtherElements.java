package Laborator2;

import java.util.Arrays;

public class ReplaceArrayElementWithProductOfOtherElements {
	public static void main(String[] args) {
        int[] A = { 5, 3, 4, 2, 6, 8 };
        
        findProduct(A, A.length, 1, 0);
        
        // print the modified array
        System.out.println(Arrays.toString(A));
	}
	
    // of every other element without using the division operator
    public static int findProduct(int[] A, int n, int left, int i)
    {
        // base case: no elements left on the right
        if (i == n) {
            return 1;
        }
 
        // take backup of the current element
        int curr = A[i];
        // calculate the product of the right subarray
        int right = findProduct(A, n, left * A[i], i + 1);

        // replace the current element with the product of the left and right subarray
        A[i] = left * right;
 
        // return product of right the subarray, including the current element
        return curr * right;
    }
}
