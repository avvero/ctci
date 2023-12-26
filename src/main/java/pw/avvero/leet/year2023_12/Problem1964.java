package pw.avvero.leet.year2023_12;

import java.util.Arrays;

public class Problem1964 {

    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int[] dp = new int[obstacles.length];
        int len = 0;
        int[] lens = new int[obstacles.length];
        int j = 0;
        for (int obstacle : obstacles) {
            int i = Arrays.binarySearch(dp, 0, len, obstacle);
            if (i < 0) {
                i = - (i + 1);
            } else if (i == 0) {
                i = len;
            }
            dp[i] = obstacle;
            if (i == len) {
                len++;
            }
            lens[j++] = len;
        }
        return lens;
    }
}
