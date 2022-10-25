package Array.SeqArraySquare;

import java.util.Scanner;

public class Youxushuzupingfang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个有序数组:");
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
             a[i] = scanner.nextInt();
        }
        Solution solution = new Solution();
        int[] result = solution.youxushuzudepingfang(a);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

class Solution {
    public int[] youxushuzudepingfang(int a[]) {
        int low = 0, high = a.length - 1;
        int k = a.length - 1;
        int temp[] = new int[a.length];
        while (low <= high) {
            if (a[low] * a[low] < a[high] * a[high]) {
                temp[k--] = a[high] * a[high];
                high--;
            } else {
                temp[k--] = a[low] * a[low];
                low++;
            }
        }
        return temp;
    }
}
