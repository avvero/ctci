package pw.avvero.leet.year2024_01;

public class Problem96 {

    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = 1; G[1] = 1; // init
        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) { // sum
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }

}
