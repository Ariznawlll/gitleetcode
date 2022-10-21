package SortAlgorithm.zhebanInsertSort;

import java.util.Scanner;

public class zhebanInsert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[4];
        System.out.print("请输入排序数组:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        Solution solution = new Solution();
        solution.zhebanSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

class Solution {
    //折半思想：折半插入排序的基本思想是：顺序地把待排序的序列中的各个元素按其
    //关键字的大小，通过折半查找插入到已排序的序列的适当位置。
    public void zhebanSort(int a[]) {
        for (int i = 1; i < a.length; i++) { //从1开始是因为假设第一个数是有序的
            int temp = a[i];
            int low = 0, high = i - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (a[i] > a[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            for (int j = i; j > low ; j--) {
                a[j] = a[j - 1];
            }
            a[low] = temp;
        }
    }
}
