package Laborator7.pair;

public class ArrayPair<A, B> extends Pair<A, B> {
	public ArrayPair(A m1, B m2) {
		internalPair[0] = m1;
		internalPair[1] = m2;
	}
	
	private Object[] internalPair = new Object[2];
	
	@Override
	public A getValueAt0() {
		return (A)internalPair[0];
	}

	@Override
	public B getValueAt1() {
		return (B)internalPair[1];
	}

	@Override
	public ArrayPair<A, B> setAt0(A member) {
		return new ArrayPair<A, B>(member, (B)internalPair[1]);
	}

	@Override
	public ArrayPair<A, B> setAt1(B member) {
		return new ArrayPair<A, B>((A)internalPair[0], member);
	}
	

}
