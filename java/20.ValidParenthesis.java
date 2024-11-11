import java.util.Stack;
public class Main
{
	public static boolean isValid(String s) {
		Stack<Character> myStack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
				myStack.push(s.charAt(i));
			} else {
				if (!myStack.empty() && ((myStack.peek() == '{' && s.charAt(i) == '}')
				                         || (myStack.peek() == '(' && s.charAt(i) == ')')
				                         || (myStack.peek() == '[' && s.charAt(i) == ']'))) {
					myStack.pop();
				} else {
					return false;
				}
			}
		}
		return myStack.empty();
	}

	public static void main(String[] args) {
		System.out.println(isValid("(){}[]"));
	}
}
