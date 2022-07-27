package lc59;

public class CircleJuzhen {
//    public static void main(String[] args) {
//        int n = 3;
//        Solution solution = new Solution();
//        solution.spiralOrder()
//    }
}

class Solution {
    public int[] spiralOrder(int[][] matrix) {
        int hight = matrix.length;
        if (hight == 0) {
            return new int[]{};
        }
        int width = matrix[0].length;
        int left = 0, right = width - 1, top = 0, buttom = hight - 1;
        int[] arr = new int[hight*width];
        int index = 0;
        while (true) {
            //上边
            for (int i = left; i <= right; ++i) {
                arr[index++] = matrix[top][i];
            }
            top++;
            //右边，这里注意是大于，不可以等于，因为我们实际时是索引
            //下面同理
            if (top > buttom) break;
            for (int i = top; i <= buttom; ++i) {

                arr[index++] = matrix[i][right];

            }
            right--;
            if (right < left) break;

            //下边
            for (int i = right; i >= left; --i) {
                arr[index++] = matrix[buttom][i];
            }
            buttom--;
            if (buttom < top) break;


            //左边
            for (int i = buttom; i >= top; --i) {
                arr[index++] = matrix[i][left];
            }
            left++;
            if (left > right) break;
        }
        return arr;
    }
}