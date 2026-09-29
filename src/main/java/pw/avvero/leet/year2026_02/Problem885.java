package pw.avvero.leet.year2026_02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Problem885 {

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        ArrayList<int[]> result = new ArrayList<>();
        //
        HashSet<String> visited = new HashSet<>();
        LinkedList<int[]> trace = new LinkedList<>();
        trace.add(new int[]{rStart, cStart});
        while (!trace.isEmpty()) {
            int[] entry = trace.removeFirst();
            if (visited.contains(hash(entry))) continue;
            visited.add(hash(entry));
            result.add(entry);
            for (int[] next : getNext(rows, cols, entry)) {
                if (!visited.contains(hash(next))) {
                    trace.add(next);
                }
            }
        }
        //
        int[][] r = new int[rows*cols][2];
        int ri = 0;
        for (int[] entry : result) {
            r[ri++] = entry;
        }
        return r;
    }

    private String hash(int[] entry) {
        return "" + entry[0] + ":" + entry[1];
    }

    private List<int[]> getNext(int rows, int cols, int[] entry) {
        ArrayList<int[]> list = new ArrayList<>();
        if (entry[1] + 1 < cols) {
            list.add(new int[]{entry[0], entry[1] + 1});
        }
        if (entry[1] + 1 < cols && entry[0] + 1 < rows) {
            list.add(new int[]{entry[0] + 1, entry[1] + 1});
        }
        if (entry[0] + 1 < rows) {
            list.add(new int[]{entry[0] + 1, entry[1]});
        }
        if (entry[1] - 1 >= 0 && entry[0] + 1 < rows) {
            list.add(new int[]{entry[0] + 1, entry[1] - 1});
        }
        if (entry[1] - 1 >= 0 ) {
            list.add(new int[]{entry[0], entry[1] - 1});
        }
        if (entry[1] - 1 >= 0 && entry[0] - 1 >= 0) {
            list.add(new int[]{entry[0] - 1, entry[1] - 1});
        }
        if (entry[0] - 1 >= 0) {
            list.add(new int[]{entry[0] - 1, entry[1]});
        }
        if (entry[0] - 1 >= 0 && entry[1] + 1 < cols) {
            list.add(new int[]{entry[0] - 1, entry[1] + 1});
        }
        return list;
    }
}
