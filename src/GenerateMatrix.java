public class GenerateMatrix {
    /**
     * @author:TanShi
     * @date:2023/2/2
     * @description:给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，
     * 且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
     */

    public static void main(String[] args) {
        generateMatrix(3);
    }

    public static int[][] generateMatrix(int n) {
        int loop = 0;
        int[][] result = new int[n][n];
        int start = 0;
        int count = 1;
        int i, j;
        while (loop++ < n / 2) {
            for (j = start; j < n - loop; j++) {
                result[start][j] = count++;
            }
            for (i = start; i < n - loop; i++) {
                result[i][j] = count++;
            }
            for (; j >= loop; j--) {
                result[i][j] = count++;
            }
            for (; i >= loop; i--) {
                result[i][j] = count++;
            }
            start++;
        }
        if (n % 2 == 1) {
            result[start][start] = count;
        }
        return result;
    }
}
