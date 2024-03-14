package pw.avvero.leet.year2024_02;

public class Problem279 {
    public int numSquares(int n) {
        int[] dp = new int[n * 2];
        dp[1] = 1;
        for (int i = 1; i <= n; i++) {
            if (dp[i] == 1) continue;
            if (dp[i] == 0) {
                dp[i] = i;
            }
            // set perfects
            int d = i * i;
            if (d < dp.length) {
                dp[d] = 1;
            }
            for(int j = i - 1; j > 0 && j >= i - j; j--) {
                dp[i] = Math.min(dp[i], dp[j] + dp[i - j]);
            }
        }
        return dp[n];
    }
}
