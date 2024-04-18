package Laborator7.pair;

public class VarPair<A, B> extends Pair<A, B> {
	A first;
	B second;

	@Override
	public A getValueAt0() {
		return this.first;
	}

	@Override
	public B getValueAt1() {
		return this.second;
	}
	
	@Override
	public VarPair<A, B> setAt0(A member) {
		return new VarPair<A, B>(member, second);
	}

	@Override
	public VarPair<A, B> setAt1(B member) {
		return new VarPair<A, B>(first, member);
		
	}

	public VarPair(A first, B second) {
		super();
		this.first = first;
		this.second = second;
	}
}
