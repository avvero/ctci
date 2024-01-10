package pw.avvero.leet.year2024_01;

import java.util.Arrays;

public class Problem1312 {

    public int minInsertions(String s) {
        char[] chars = s.toCharArray();
        int[][] dp = new int[chars.length][chars.length];
        for (int i = 1; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                if (chars[j] == chars[j - i]) {
                    dp[i][j] = dp[i - 1][j - 1] - 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
            }
        }
        return dp[chars.length - 1][chars.length - 1];
    }

}
