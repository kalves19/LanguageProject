import java.util.Scanner;
public class InputNode extends Node{

	Scanner input = new Scanner(System.in);

	@Override
	public int eval(){
	        System.out.println("enter an int");
		int value = input.nextInt();
		String name = getChild(0).getName();
		IDNode.ram.put(name, value);
		return 0;
	}
}
