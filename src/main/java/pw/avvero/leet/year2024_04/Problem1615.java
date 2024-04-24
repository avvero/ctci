package pw.avvero.leet.year2024_04;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Problem1615 {

    public int maximalNetworkRank(int n, int[][] roads) {
        Set[] neibs = new Set[n];
        for (int i = 0; i < roads.length; i++) {
            if (neibs[roads[i][0]] == null) {
                neibs[roads[i][0]] = new HashSet<>();
            }
            neibs[roads[i][0]].add(roads[i][1]);
        }
        //
        int result = 0;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                int rank = rank(i, j, neibs);
                result = Math.max(result, rank);
            }
        }
        return result;
    }

    private int rank(int i, int j, Set[] neibs) {
        if (neibs[i] == null || neibs[j] == null) return 0;
        if (neibs[i] == null) return neibs[j].size();
        if (neibs[j] == null) return neibs[i].size();
        return neibs[i].size() + neibs[j].size();
    }

}
