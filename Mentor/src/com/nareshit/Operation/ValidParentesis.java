package com.nareshit.Operation;

import java.util.Stack;

public class ValidParentesis {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char bracket : s.toCharArray()) {
			if (bracket == '(' || bracket == '[' || bracket == '{') {
				stack.push(bracket);

			} else if (bracket == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (bracket == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else if (bracket == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else {
				return false;
			}

		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {

		String str = "{[()]}";
		boolean res = isValid(str);
		System.out.println(res);
	}

}
