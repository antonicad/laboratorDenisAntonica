package Laborator7.pair;

public class TupleTest2 {

	public static void main(String[] args) {
		// Upcasting
		Pair firstPair = new ArrayPair(1, "second");
		Pair secondPair =  new VarPair("first", "second");
		Tuple thirdPair =  new ArrayPair(firstPair, secondPair);
		
		// Downcasting from Pair to ArrayPair and VarPair
		// ArrayPair firstArrayPair = (ArrayPair) firstPair;
		VarPair secondVarPair = (VarPair) secondPair;
		
		ArrayPair firstArrayPair = null;
		if (secondPair instanceof ArrayPair)
			firstArrayPair = (ArrayPair) secondPair;
		
		// Upcasting ArrayPair and VarPair to Object
		if (firstArrayPair != null)
			System.out.println(firstArrayPair.getValueAt0());
		System.out.println(secondVarPair.getValueAt0());
		System.out.println(thirdPair.getValue(0));
	}

}
