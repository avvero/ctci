package pw.avvero.leet.year2026_02;

import java.util.LinkedList;
import java.util.List;

public class Problem688 {

    public double knightProbability(int n, int k, int row, int column) {
        if (k == 0) return 1;
        int max = (int) Math.pow(8, k);
        int cur = 0;
        int[][] dp = new int[n][n];
        List<int[]> queue = new LinkedList<>();
        queue.add(new int[] {row, column});
        while(k-- > 0) {
            int i = queue.size();
            int curNext = 0;
            while (i-- > 0) {
                List<int[]> nextToQueue = calculateNext(dp, queue.removeLast());
                curNext += nextToQueue.size();
                queue.addAll(nextToQueue);
            }
            if (curNext > 0) {
                cur = curNext;
            }
        }
        return (float) cur / max;
    }

    private List<int[]> calculateNext(int[][] dp, int[] entry) {
        int i = entry[0], j = entry[1];
        if (i < 0 || j < 0) return List.of();
        if (i >= dp.length || j >= dp.length) return List.of();
        //
        //if (dp[i][j] > 0) return dp[i][j];
        //
        List<int[]> queue = new LinkedList<>();
        if (i - 1 >= 0 && j - 2 >= 0) {
            queue.add(new int[] {i - 1, j - 2});
        }
        if (i - 2 >= 0 && j - 1 >= 0) {
            queue.add(new int[] {i - 2, j - 1});
        }
        if (i - 2 >= 0 && j + 1 < dp.length) {
            queue.add(new int[] {i - 2, j + 1});
        }
        if (i - 1 >= 0 && j + 2 < dp.length) {
            queue.add(new int[] {i - 1, j + 2});
        }
        if (i + 1 < dp.length && j - 2 >= 0) {
            queue.add(new int[] {i + 1, j - 2});
        }
        if (i + 2 < dp.length && j - 1 >= 0) {
            queue.add(new int[] {i +2, j - 1});
        }
        if (i + 2 < dp.length && j + 1 < dp.length) {
            queue.add(new int[] {i + 2, j + 1});
        }
        if (i + 1 < dp.length && j + 2 < dp.length) {
            queue.add(new int[] {i + 1, j + 2});
        }
        return queue;
    }
}
