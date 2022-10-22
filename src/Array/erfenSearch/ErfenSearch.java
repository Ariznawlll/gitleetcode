package Array.erfenSearch;

import java.util.Scanner;

//二分查找法的前提条件：数组为有序数组，并且数组中的元素不是重复的
public class ErfenSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        System.out.print("请输入数组:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.print("请输入要查找的数:");
        int num = scanner.nextInt();
        Solution solution = new Solution();
        int i = solution.erfenSearch(a, num);
        System.out.println(i);
    }
}

class Solution {
    public int erfenSearch(int a[], int num) {
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] > num) {
                right = mid - 1;
            } else if (a[mid] < num){
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
