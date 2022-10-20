package SortAlgorithm.QuickSort;

import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数组:");
        int a[] = new int[6];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        Solution solution = new Solution();
        solution.sort(a, 0, a.length - 1);
        System.out.print("排序后的结果为:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

class Solution {
    public void sort(int a[], int left, int right) {
        if (left > right) {
            return;
        }
        int x = a[left];
        int i = left, j = right;
        while (i < j) {
            while (i < j && a[j] >= x) {
                j--;
            }
            while (i < j && a[i] <= x) {
                i++;
            }
            swap(a, i, j);
        }
        swap(a, j, left);
        sort(a, left, i - 1);
        sort(a, i + 1, right);
    }

    public void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
