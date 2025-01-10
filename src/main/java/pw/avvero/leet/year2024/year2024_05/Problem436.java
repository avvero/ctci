package pw.avvero.leet.year2024.year2024_05;

import java.util.Arrays;

public class Problem436 {

    public int[] findRightInterval(int[][] intervals) {
        int[][] indexedIntervals = new int[intervals.length][3];
        for (int i = 0; i < intervals.length; i++) {
            indexedIntervals[i] = new int[]{intervals[i][0], intervals[i][1], i};
        }
        Arrays.sort(indexedIntervals, (a, b) -> a[0] - b[0]);
        int[] result = new int[indexedIntervals.length];
        for (int i = 0; i < indexedIntervals.length; i++) {
            int idx = search(indexedIntervals, indexedIntervals[i][1], 0, indexedIntervals.length - 1);
            result[indexedIntervals[i][2]] = -1;
            if (idx >= 0) {
                result[indexedIntervals[i][2]] = indexedIntervals[idx][2];
            }
        }
        return result;
    }

    private int search(int[][] intervals, int target, int s, int e) {
        if (s > e) return -1;
        if (s == e && intervals[s][0] >= target) return s;
        int m = s + (e - s) / 2;
        if (intervals[m][0] < target) {
            return search(intervals, target, m + 1, e);
        } else if (intervals[m][0] > target) {
            return search(intervals, target, s, m);
        } else {
            return m;
        }
    }

}
