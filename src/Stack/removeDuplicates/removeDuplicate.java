package Stack.removeDuplicates;

import jdk.nashorn.internal.ir.CallNode;

import java.util.Stack;

public class removeDuplicate {
    public static void main(String[] args) {
        String s = "abbaca";
        Solution solution = new Solution();
        String remove = solution.remove(s);

        System.out.println(remove);

    }
}

class Solution {
    public String remove(String a) {
        int length = a.length();
        Stack stack = new Stack();
        stack.push(a.charAt(0));
        int i = 1;
        while (i < length) {
            //如果栈不空并且栈顶的值等于指针指向的值
            if (!stack.isEmpty() && stack.peek().equals(a.charAt(i))) {
                i++;
                stack.pop();
            } else {
                stack.push(a.charAt(i));
                i++;
            }
        }
        Stack stack1 = new Stack();
        while (!stack.isEmpty()) {
            stack1.push(stack.pop());
        }
        StringBuilder sb = new StringBuilder();
        while (!stack1.isEmpty()) {
            sb.append(stack1.pop());
        }
        return sb.toString();
    }
}
