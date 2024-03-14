package pw.avvero.leet.year2024_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1129 {

    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        List[] red = new List[n];
        for (int i = 0; i < n; i++) {
            red[i] = new ArrayList();
        }
        for (int i = 0; i < redEdges.length; i++) {
            int[] edge = redEdges[i];
            red[edge[0]].add(edge[1]);
        }
        List[] blue = new List[n];
        for (int i = 0; i < n; i++) {
            blue[i] = new ArrayList();
        }
        for (int i = 0; i < blueEdges.length; i++) {
            int[] edge = blueEdges[i];
            blue[edge[0]].add(edge[1]);
        }
        //
        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        //for (int i = 0; i < n; i++) {
        walk(answer, 0, 0, red, blue);
        //walk(answer, 0, 0, blue, red);
        //}
        //
        return answer;
    }

    private void walk(int[] answer, int i, int depth, List<Integer>[] red, List<Integer>[] blue) {
        if (answer[i] != -1) return;
        answer[i] = answer[i] == -1 ? depth : Math.min(answer[i], depth);
        for (int j = 0; j < red[i].size(); j++) {
            walk(answer, red[i].get(j), depth + 1, blue, red);
        }
    }

}
