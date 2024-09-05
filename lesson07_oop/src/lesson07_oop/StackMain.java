package lesson07_oop;

import java.util.Stack;

public class StackMain {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		for(int i = 0 ; i <100_000 ; i++) {
			stack.push("»õ¶ËÀÌ");
		}
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
//		String what = stack.push("»õ¶ËÀÌ");
//		String what2 = stack.push("¿¡¾îÄÜ");
//		stack.push("Ãò¸£");
//		System.out.println(stack.size());
//		System.out.println(stack.pop());
//		System.out.println(stack.size());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.size());

		
		
	}
}
