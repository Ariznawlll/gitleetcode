package SortAlgorithm.BubbleSort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[5];
        System.out.print("请输入:");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        Solution solution = new Solution();
        solution.sort(a);
        System.out.println("排序后的结果为:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

class Solution{
    public void sort(int a[]) {

        for (int i = 0; i < a.length; i++) {  //趟数
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
