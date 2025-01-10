package pw.avvero.leet.year2024.year2024_04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem990 {

    int[] parent = new int[32];
    public boolean equationsPossible(String[] equations) {
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i; // set roots
        }
        for (String equation : equations) {
            if (equation.charAt(1) == '!') continue;
            union(equation.charAt(0) - 'a', equation.charAt(3) - 'a');
        }

        return false;
    }

    private void union(int a, int b) {
        parent[find(a)] = find(b);
    }

    private int find(int a) {
        if (parent[a] == a){ // parent is self
            return parent[a];
        } else {
            return find(parent[a]);
        }
    }

}
