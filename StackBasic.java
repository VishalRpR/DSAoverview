import java.util.Stack;
public class StackBasic {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		
		
		stack.push("MInecraft");
		
		stack.push("skyrim");
		stack.push("pokemon");
		stack.push("ffvii");
		
//		String output=stack.pop();
//		System.out.println(stack.peek());
		
		
		
		System.out.println(stack.search("Fallout76"));
		
		for (int i = 0; i < 100; i++) {
			stack.push("Fallout76");
			
		}
		

		
		System.out.println(stack);
		

	}

}
