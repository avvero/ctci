package pw.avvero.leet.year2024.year2024_03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem1926 {

    public int nearestExit(char[][] maze, int[] entrance) {
        int result = Integer.MAX_VALUE;
        int[][] visited = new int[maze.length][maze[0].length];
        LinkedList<int[]> toVisit = new LinkedList<>();
        toVisit.add(entrance);
        while(toVisit.size() > 0) {
            int[] cell = toVisit.removeFirst();
            if (!(cell[0] == entrance[0] && cell[1] == entrance[1]) && isExit(maze, cell)) {
                result = Math.min(result, visited[cell[0]][cell[1]]);
            }
            //
            int steps = visited[cell[0]][cell[1]] + 1;
            //
            int[] top = nextCell(maze, cell[0] - 1, cell[1], visited);
            if (top != null) {
                visited[top[0]][top[1]] = steps;
                toVisit.add(top);
            }
            int[] bottom = nextCell(maze, cell[0] + 1, cell[1], visited);
            if (bottom != null) {
                visited[bottom[0]][bottom[1]] = steps;
                toVisit.add(bottom);
            }
            int[] left = nextCell(maze, cell[0], cell[1] - 1, visited);
            if (left != null) {
                visited[left[0]][left[1]] = steps;
                toVisit.add(left);
            }
            int[] right = nextCell(maze, cell[0], cell[1] + 1, visited);
            if (right != null) {
                visited[right[0]][right[1]] = steps;
                toVisit.add(right);
            }
        }
        return result != Integer.MAX_VALUE ? result : -1;
    }

    private int[] nextCell(char[][] maze, int i, int j, int[][] visited) {
        if (i < 0 || j < 0 || i == maze.length || j == maze[0].length) return null;
        if (visited[i][j] > 0) return null;
        if (maze[i][j] == '+') return null;
        return new int[]{i, j};
    }

    private boolean isExit(char[][] maze, int[] cell) {
        return cell[0] == 0 || cell[1] == 0 || cell[0] == maze.length - 1 || cell[1] == maze[0].length - 1;
    }

}
