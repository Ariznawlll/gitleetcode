package Array.RemoveElement;

import java.util.Scanner;

public class removeElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[8];
        System.out.print("请输入数组:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int val = 2;
        Solution solution = new Solution();
        int i = solution.remainLength(a, val);
        System.out.println(i);
    }
}

class Solution {
    public int remainLength(int nums[], int val) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}
