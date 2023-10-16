package pw.avvero.leet.year2023_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem64 {

    private int max = 1000;

    public int minPathSum(int[][] grid) {
        int[][] path = new int[grid.length][];
        for (int i = 0; i < grid.length; i++) {
            path[i] = new int[grid[i].length];
            Arrays.fill(path[i], max);
        }
        path[0][0] = grid[0][0];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == 0 && j == 0) continue;
                int min = minAround(grid, path, i, j) + grid[i][j];
                if (path[i][j] > min) {
                    path[i][j] = min;
                    if (i == path.length - 1 && j == path[i].length - 1) {
                        break;
                    }
                    i = Math.max(0, i - 1);
                    j = Math.max(0, j - 1);
                }
            }
        }
        return path[path.length - 1][path[0].length - 1];
    }

    private int minAround(int[][] grid, int[][] path, int i, int j) {
        int min = path[i][j];
        //min = Math.min(min, val(path, i - 1, j));
        min = Math.min(min, val(path, i + 1, j));
        //min = Math.min(min, val(path, i, j - 1));
        min = Math.min(min, val(path, i, j + 1));
        return min;
    }

    private int val(int[][] path, int i, int j) {
        if (i < 0 || i == path.length) return max;
        if (j < 0 || j == path[i].length) return max;
        return path[i][j];
    }
}
