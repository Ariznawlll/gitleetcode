package AboutString;

public class replaceblank {
    public static void main(String[] args) {
        String a = "We are happy.";
        Solution solution = new Solution();
        String replace = solution.replace(a);
        System.out.println(replace);
    }
}

class Solution {
    public String replace(String s) {
        if (s == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (" ".equals(String.valueOf(s.charAt(i)))) {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

}
