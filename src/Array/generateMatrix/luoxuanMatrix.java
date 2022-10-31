package Array.generateMatrix;

public class luoxuanMatrix {
    public static void main(String[] args) {
        int a = 3;
        Solution solution = new Solution();
        int result[][] = solution.luoxuanMatrix(a);
        int k = 1;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
                if (k++ % 3 == 0) {
                    System.out.println();
                }
            }
        }
    }
}

class Solution {
    public int[][] luoxuanMatrix(int n) {
        int res[][] = new int[n][n];  //循环次数
        int l = 0;    //每次循环的起始位置
        int r = n - 1;
        int t = 0;
        int b = n - 1;
        int k=1;
        while(k <= n*n){
            for(int col = l; col <= r; col++) res[t][col] = k++;
            t++;
            for(int row = t; row <= b; row++) res[row][r] = k++;
            r--;
            for(int col = r; col >= l; col--) res[b][col] = k++;
            b--;
            for(int row = b; row >= t; row--) res[row][l] = k++;
            ++l;
        }
        return res;

    }
}
