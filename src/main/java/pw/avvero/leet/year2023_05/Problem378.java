package pw.avvero.leet.year2023_05;

import java.util.Arrays;

public class Problem378 {

    // [1 ,5 ,9 ]
    // [10,11,13]
    // [12,13,15]

    // [1,4,7]
    // [2,5,8]
    // [3,6,9]

    public int kthSmallest(int[][] matrix, int k) {
        int p = 1;
        int i = 0, j = 0;
        while (p < k) {
            int s = matrix[i][j];
            for (int ii = 0; ii <= i; ii++) {
                for (int jj = 0; jj <= j; jj++) {
                    int r = val(matrix, ii, j + 1);
                    int b = val(matrix, i + 1, jj);
                    if (b < r) {
                        i = i + 1;
                        j = jj;
                        p++;
                        break;
                    } else {
                        j = j + 1;
                        i = ii;
                        p++;
                        break;
                    }
                }
            }
        }
        return matrix[i][j];
    }

    private int val(int[][] matrix, int i, int j) {
        if (i >= matrix.length) return Integer.MAX_VALUE;
        if (j >= matrix[i].length) return Integer.MAX_VALUE;
        return matrix[i][j];
    }
}
