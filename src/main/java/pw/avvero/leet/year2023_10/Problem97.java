package pw.avvero.leet.year2023_10;

public class Problem97 {

    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        int t = s3.length();
        if (m + n != t) {
            return false;
        }
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                int k = i + j - 1;
                if (i > 0 && s1.charAt(i - 1) == s3.charAt(k)) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j];
                }
                if (j > 0 && s2.charAt(j - 1) == s3.charAt(k)) {
                    dp[i][j] = dp[i][j] || dp[i][j - 1];
                }
            }
        }
        return dp[m][n];
    }

    public boolean isInterleave2(String s1, String s2, String s3) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        char[] c3 = s3.toCharArray();
        int n = c1.length;
        int m = c2.length;

        if (n + m != c3.length) return false;

        boolean[][] path = new boolean[n+1][m+1];
        path[0][0] = true;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                int k = n + m - 1;
                if (i > 0 && c3[k] == c1[i - 1]) {
                    path[i][j] = path[i][j] || path[i - 1][j];
                }
                if (j > 0 && c3[k] == c2[j - 1]) {
                    path[i][j] = path[i][j] || path[i][j-1];
                }
            }
        }
        return path[n][m];
    }
}
