package pw.avvero.leet.year2026_02;

public class Problem861 {

    public int matrixScore(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < grid[i].length; j++) {
                    grid[i][j] = grid[i][j] == 0 ? 1 : 0;
                }
            }
        }
        for (int j = 0; j < grid[0].length; j++) {
            int z = zeros(grid, j);
            if (z * 2 > grid.length) {
                for (int i = 0; i < grid.length; i++) {
                    grid[i][j] = grid[i][j] == 0 ? 1 : 0;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            int n = 0;
            for (int j = 0; j < grid[i].length; j++) {
                n+= (int) Math.pow(2, j) * grid[i][j];
            }
            result += n;
        }
        return result;
    }

    private int zeros(int[][] grid, int j) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][j] == 0) {
                count++;
            }
        }
        return count;
    }
}
