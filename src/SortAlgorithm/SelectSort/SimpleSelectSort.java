package SortAlgorithm.SelectSort;

import java.util.Scanner;

public class SimpleSelectSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        System.out.print("请输入待排序数组:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.print("排序后的结果为:");
        Solution solution = new Solution();
        solution.simpleSelectSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

//简单选择排序的思想，对于一个数组，从第一个开始依次比较此数与数组中的大小关系，选择一个最小的
//放在最前面，直到达到数组的长度即可
class Solution{
    public void simpleSelectSort(int a[]) {
        for (int i = 0; i < a.length; i++) {  //趟数
            int k = i; //假设第一趟第一个数是最小的
            for (int j = i + 1; j < a.length; j++) {
                if (a[k] > a[j]) {
                    k = j;
                }
            }
            if (k != i) {  //因为k记录的是当前位置，如果当前位置不等于i的话说明，最小数所在的位置已经改变了
                //需要交换，如果相等说明当前数就是最小数，不用改变
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }
}
