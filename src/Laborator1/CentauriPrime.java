package Laborator1;

import java.util.Arrays;

public class CentauriPrime {
	   public static void main( String args[] ) {
//		   Mollaristan Auritania Zizily

		   String kingdom = "Auritania";
		   
		   String ruler = getRuler(kingdom);
		   
		   System.out.println(kingdom + " is ruled by " + ruler + ".");
	   }
	   
	   public static String getRuler(String kingdom) {
		   String ruler = "Bob";
		   String[] vowels = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};
		   String[] ys = {"Y", "y"};
		   
		   String lastLetter = kingdom.substring(kingdom.length() - 1);
		   
		   boolean isVowel = false;
		   boolean isY = false;
		     
		   for (String s: vowels) {
			   if (s.equals(lastLetter)) {
				   isVowel = true;
//				   ruler = "Alice";
			   }
		   }
		   
		   for (String y: ys) {
			   if (y.equals(lastLetter)) {
				   isY = true;
//				   ruler = "nobody";
			   }
		   }
		   
//		   if (isVowel == true) {
//			   ruler = "Alice";
//		   }
//		   
//		   if (isY == true) {
//			   ruler = "nobody";
//		   }
//		   
		   
		   if (Arrays.asList(vowels).contains(lastLetter)) {
			   ruler = "Alice";
		   } else if (Arrays.asList(ys).contains(lastLetter)) {
			   ruler = "nobody";
		   }
		   
		   return ruler;
	   }

}
