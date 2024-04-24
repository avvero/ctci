package pw.avvero.leet.year2024_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem417 {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int[][] visited = new int[heights.length][heights[0].length];
        for (int i = 0; i < visited.length; i++) {
            Arrays.fill(visited[i], -1);
        }
        //
        LinkedList<int[]> tovisit = new LinkedList<>();
        tovisit.add(new int[]{0, 0});
        while(!tovisit.isEmpty()) {
            int[] v = tovisit.removeFirst();
            int i = v[0], j = v[1];
            int top = check(heights, i - 1, j, heights[i][j], visited);
            if (top < 0) {
                tovisit.add(new int[]{i - 1, j});
            }
            int bottom = check(heights, i + 1, j, heights[i][j], visited);
            if (bottom < 0) {
                tovisit.add(new int[]{i + 1, j});
            }
            int left = check(heights, i, j - 1, heights[i][j], visited);
            if (left < 0) {
                tovisit.add(new int[]{i, j - 1});
            }
            int right = check(heights, i, j + 1, heights[i][j], visited);
            if (right < 0) {
                tovisit.add(new int[]{i, j + 1});
            }
            int result = top | bottom | left | right;
            if (result == 3) {
                visited[i][j] = 3;
                continue;
            }
            if (top < 0 || bottom < 0 || left < 0 || right <0) {
                tovisit.add(new int[]{i, j});
            } else {
                visited[i][j] = top | bottom | left | right;
            }
        }
        //
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[i].length; j++) {
                if (visited[i][j] == 3) {
                    result.add(List.of(i, j));
                }
            }
        }
        return result;
    }

    private int check(int[][] heights, int i, int j, int prevHeight, int[][] visited) {
        if (i < 0) return 1;
        if (i == heights.length) return 2;
        if (j < 0) return 1;
        if (j == heights[i].length) return 2;
        if (prevHeight < heights[i][j]) return 0;
        return visited[i][j];
    }

}
