package SortAlgorithm.healSort;

import javax.naming.PartialResultException;
import java.util.Scanner;

public class healSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数组:");
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        Solution solution = new Solution();
        solution.duipaixu(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

class Solution {
    public void duipaixu(int a[]) {
        //因为第一个非叶子节点的数组下标为a.length / 2 - 1
        for (int i = a.length / 2 - 1; i >= 0 ; i--) {
            adjustHeap(a, i, a.length);
        }

        //将堆项元素与末尾元素交换，将最大元素"沉"到数组末端;
        //重新调整结构，使其满足堆定义，然后继续交换堆项元素与当前末尾元素，
        // 反复执行调整+交换步骤，直到整个序列有序。
        for (int j = a.length - 1; j > 0 ; j--) {
            swap(a, 0, j);
            adjustHeap(a, 0, j);
        }
    }

    public void adjustHeap(int a[], int i, int length) {
        int temp = a[i];
        for (int j = i * 2 + 1; j < length; j = j * 2 + 1) {
            if (j + 1 < length && a[j] < a[j + 1]) {
                j++;
            }
            if (a[j] > temp) {
                a[i] = a[j];
                i = j;
            } else {
                 break;
            }
        }
        a[i] = temp;
    }

    public void swap(int a[], int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
