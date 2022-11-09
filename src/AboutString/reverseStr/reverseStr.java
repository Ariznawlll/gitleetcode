package AboutString.reverseStr;

public class reverseStr {
    public static void main(String[] args) {
        String a = "hello";
//        System.out.println(a);
        Solution solution = new Solution();
        String s = solution.reverseStr(a);
        System.out.println(s);
    }
}

class Solution {
    public String reverseStr(String str) {
        char c[] = str.toCharArray();
        int l = 0, r = c.length - 1;
        while (l < r) {
            char temp = c[l];
            c[l] = c[r];
            c[r] = temp;
            l++;
            r--;
        }
        String t = String.valueOf(c);
        return t;
    }
}
