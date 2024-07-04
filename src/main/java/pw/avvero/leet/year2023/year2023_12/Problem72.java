package pw.avvero.leet.year2023.year2023_12;

import java.util.Arrays;

public class Problem72 {
    public int minDistance(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        int[][] dp = new int[chars1.length + 1][chars2.length + 1];
        for (int i = 0; i <= chars1.length; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= chars2.length; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= chars1.length; i++) {
            for (int j = 1; j <= chars2.length; j++) {
                dp[i][j] = Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1);
                int m = 1;
                if (chars1[i - 1] == chars2[j - 1]) {
                    m = 0;
                }
                dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + m);
            }
        }
        return dp[chars1.length][chars2.length];
    }
}
