public class ExpNode extends Node{

	@Override
	public int eval(){
		if(children.size() == 1){
			return children().get(0).eval();
		}
		else{
			int result = children().get(0).eval();

			for (int i=1; i<children().size(); i+=2){
				OpNode op = (OpNode) children().get(i);
				int value = children().get(i+1).eval();

				if(op.op.equals("+")){
					result += value;
				}
				else if(op.op.equals("-")){
					result -= value;
				}
				else if(op.op.equals("*")){
					result *= value;
				}
				else if(op.op.equals("/")){
					result /= value;
				}
				else{
					throw new IllegalArgumentException("Unknown Operator: " + op.op);
				}
			}
			return result;
		}
	}
}
