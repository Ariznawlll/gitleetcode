package Array.minSubArrayLength;

import java.util.Scanner;

public class minSubarraylength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[6];
        System.out.print("请输入数组:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int num = 7;
        Solution solution = new Solution();
        int i = solution.minLength(a, num);
        System.out.println(i);
    }
}

class Solution{
    public int minLength(int a[], int num) {
        int result = Integer.MAX_VALUE;
        int i = 0;
        int sublen = 0;
        int sum = 0; //滑动窗口之和
        for (int j = 0; j < a.length; j++) {
            sum += a[j];
            while (sum >= num) {
                sublen = j - i + 1;
                result = result > sublen ? sublen : result;
                sum -= a[i++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 :result;
    }
}
