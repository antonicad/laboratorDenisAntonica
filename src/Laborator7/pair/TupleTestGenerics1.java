package Laborator7.pair;

public class TupleTestGenerics1 {

	public static void main(String[] args) {
		// Upcasting
		Pair<Integer, String> firstPair = new ArrayPair<Integer, String>(1, "second");
		Pair<String, String> secondPair =  new VarPair<String, String>("first", "second");
		
		// Downcasting
		Integer v1 = (Integer) firstPair.getValue(0);
		String s1 = (String) firstPair.getValue(1);
		
		String v2= secondPair.getValueAt0();
		//Integer v2 =  secondPair.getValueAt0();
		String s2 = secondPair.getValueAt1();
		
		// Upcasting to Object
		System.out.println(firstPair.getValueAt0());
		System.out.println(secondPair.getValueAt0());
	}

}
