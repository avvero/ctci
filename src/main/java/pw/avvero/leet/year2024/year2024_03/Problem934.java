package pw.avvero.leet.year2024.year2024_03;

import java.util.LinkedList;

public class Problem934 {

    public int shortestBridge(int[][] grid) {
        int[][] bridges = new int[grid.length][grid[0].length];
        for (int i = 0; i < bridges.length; i++) {
            for (int j = 0; j < bridges[i].length; j++) {
                bridges[i][j] = -1;
            }
        }
        dfs(grid, 0, 1, 0, bridges);
        int min = 1;
        int max = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) continue;
                min = Math.min(min, bridges[i][j]);
                max = Math.max(max, bridges[i][j]);
            }
        }
        return max - min;
    }

    private void dfs(int[][] grid, int i, int j, int length, int[][] bridges) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[i].length) return;
        if (bridges[i][j] != -1 && length >= bridges[i][j]) return;
        //
        if (grid[i][j] == 0) {
            bridges[i][j] = length + 1;
        } else {
            bridges[i][j] = length;
        }
        int next = grid[i][j] == 1 ? 0 : bridges[i][j];
        dfs(grid, i - 1, j, next, bridges);
        dfs(grid, i + 1, j, next, bridges);
        dfs(grid, i, j - 1, next, bridges);
        dfs(grid, i, j + 1, next, bridges);
    }

}
