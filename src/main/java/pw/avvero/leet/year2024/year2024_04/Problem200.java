package pw.avvero.leet.year2024.year2024_04;

import java.util.LinkedList;

public class Problem200 {

    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        LinkedList<int[]> tovisit = new LinkedList<>();
        tovisit.add(new int[]{0, 0});
        int lands = 0;
        while (!tovisit.isEmpty()) {
            int[] x = tovisit.removeFirst();
            int i = x[0], j = x[1];
            if (visited[i][j]) continue;
            visited[i][j] = true;
            if (grid[i][j] == '1') {
                lands++;
                traverseLand(grid, i, j, visited, tovisit);
            } else {
                addNext(tovisit, grid, i - 1, j, visited);
                addNext(tovisit, grid, i + 1, j, visited);
                addNext(tovisit, grid, i, j - 1, visited);
                addNext(tovisit, grid, i, j + 1, visited);
            }
        }
        return lands;
    }

    private void addNext(LinkedList<int[]> tovisit, char[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[i].length || visited[i][j]) return;
        tovisit.add(new int[]{i, j});
    }

    private void traverseLand(char[][] grid, int i, int j, boolean[][] visited, LinkedList<int[]> tovisit) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[i].length || visited[i][j]) return;
        if (grid[i][j] == '0') {
            tovisit.add(new int[]{i, j});
            return;
        }
        visited[i][j] = true;
        traverseLand(grid, i - 1, j, visited, tovisit);
        traverseLand(grid, i + 1, j, visited, tovisit);
        traverseLand(grid, i, j - 1, visited, tovisit);
        traverseLand(grid, i, j + 1, visited, tovisit);
    }

}
