package Stack.validBranket;

import java.util.Stack;

public class ValidBranket {
    public static void main(String[] args) {
        String s = "([{}])";
        Solution solution = new Solution();
        boolean valid = solution.isValid(s);
        System.out.println(valid);
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();

        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') {
                stack.push(')');
            } else if (s.charAt(i) == '[') {
                stack.push(']');
            } else if(s.charAt(i) == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || !stack.peek().equals(s.charAt(i))) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
