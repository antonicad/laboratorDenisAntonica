package Laborator2;

import java.util.Arrays;
import java.util.List;

public class PhraseCombinations {
	public static void main(String[] args) {
		List<List<String>> lists = Arrays.asList(
                Arrays.asList("John", "Emma"),
                Arrays.asList( "Plays", "Hates", "Watches" ),
                Arrays.asList( "Cricket", "Soccer", "Chess" )
        );
	 
		printAllCombinations(lists, "", 0);
	}
	
	public static void printAllCombinations(List<List<String>> lists, String result, int n) {
        if (n == lists.size())
        {
            System.out.println(result.substring(1));
            return;
        }
 
        int m = lists.get(n).size();
 
        for (int i = 0; i < m; i++)
        {
            String out = result + " " + lists.get(n).get(i);
 
            printAllCombinations(lists, out, n + 1);
        }
	}
}
