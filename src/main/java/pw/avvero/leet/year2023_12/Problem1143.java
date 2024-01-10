package pw.avvero.leet.year2023_12;

import java.util.Arrays;

public class Problem1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] chars1 = text1.toCharArray();
        char[] chars2 = text2.toCharArray();
        int[][] dp = new int[chars1.length + 1][chars2.length + 1];
        //Arrays.fill(dp[0], 1);
        for (int i = 1; i <= chars1.length; i++) {
            for (int j = 1; j <= chars2.length; j++) {
                int e = chars1[i - 1] == chars2[j - 1] ? 1 : 0;
                dp[i][j] = dp[i - 1][j - 1] + e;
                int w = Math.max(dp[i - 1][j], dp[i][j - 1]);
                dp[i][j] = Math.max(dp[i][j], w);
            }
        }
        return dp[chars1.length][chars2.length];
    }
}
