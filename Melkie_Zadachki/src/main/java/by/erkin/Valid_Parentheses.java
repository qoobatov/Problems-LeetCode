package by.erkin;

import java.util.Stack;

public class Valid_Parentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c) ) {
                    return false;
                }
            }


        }
        return stack.isEmpty();
    }

    private boolean isMatchingPair(char open, char close) {
        return open == '(' && close == ')' || open == '{' && close == '}' || open == '[' && close == ']';
    }

}
