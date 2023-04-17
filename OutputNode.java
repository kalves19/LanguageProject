import java.util.Scanner;

public class OutputNode extends Node{

	@Override
	public int eval(){
		int intValue = getChild(0).eval();
		System.out.println(intValue);
		return 0;
	}
}
