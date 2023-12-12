package pw.avvero.leet.year2023_12;

import java.util.Arrays;

public class Problem516 {
    public int longestPalindromeSubseq(String s) {
        char[] chars = s.toCharArray();
        int[][] dp = new int[s.length()][s.length()];
        int max = 1;
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], 1);
        }
        for (int i = 0; i < dp.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                dp[i][i + 1] = 2;
                max = 2;
            }
        }
        for (int diff = 2; diff < dp.length; diff++) {
            for (int i = 0; i < dp.length - diff; i++) {
                int j = i + diff;
                if (chars[i] == chars[j]) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                    max = Math.max(max, dp[i][j]);
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }

        return max;
    }
}
