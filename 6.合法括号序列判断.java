import java.util.*;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; ++i) {
            char ch = A.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char topEle = stack.peek();
                if (topEle == '(') {
                    stack.pop();
                }
            } else {
                return false;
            }
        }
        
        return stack.isEmpty();
    }
}