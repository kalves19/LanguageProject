public class OpNode extends Node {

	// made string op public because it couldn't be accessed in ExpNode
	public String op;
	public OpNode(String image) {
		op = image;
	}
	@Override
	public String getName() {
		return op;
	}
	@Override
	public int eval() {
		throw new UnsupportedOperationException();
	}
}
