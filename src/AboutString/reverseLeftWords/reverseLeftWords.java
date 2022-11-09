package AboutString.reverseLeftWords;



public class reverseLeftWords {
    public static void main(String[] args) {
        String a = "hello";
        int k = 2;
        Solution solution = new Solution();
        String s = solution.reverseLeftWords(a, k);
        System.out.println(s);
    }
}

class Solution {
    public String reverseLeftWords(String s, int n) {
        //思路：先转左边的，再转右边的， 然后再整体旋转；
        int l = 0, r = n - 1;
        char t[] = s.toCharArray();
        //先转左边的
        while (l < r) {
            char temp = t[l];
            t[l] = t[r];
            t[r] = temp;
            l++;
            r--;
        }
        //再转右边的
        int rl = n, rr = t.length - 1;
        while (rl < rr) {
            char rt = t[rl];
            t[rl] = t[rr];
            t[rr] = rt;
            rl++;
            rr--;
        }
        // 再全部旋转
        int wholel = 0, wholer = t.length - 1;
        while(wholel < wholer) {
            char wholet = t[wholel];
            t[wholel] = t[wholer];
            t[wholer] = wholet;
            wholel++;
            wholer--;
        }
        return String.valueOf(t);
    }
}
