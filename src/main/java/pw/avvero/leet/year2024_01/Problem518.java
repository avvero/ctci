package pw.avvero.leet.year2024_01;

public class Problem518 {

    //    1 2 3 4 5
    // 0 0 0 0 0 0 0
    // 1 0 1 1 1 1 1
    // 2 0 1 2 2 3 3
    // 5 0 1 2 2 3 4

    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                dp[i][j] = dp[i - 1][j];
                if (coins[i - 1] > j) {
                    continue;
                }
                if (coins[i - 1] == j) {
                    dp[i][j]++;
                    continue;
                }
                int d = j - coins[i - 1];
                dp[i][j] += dp[i][d];
            }
        }
        return dp[coins.length][amount];
    }

}
