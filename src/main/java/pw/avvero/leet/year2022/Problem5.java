package pw.avvero.leet.year2022;

public class Problem5 {
    public String longestPalindrome(String s) {
        int[][] dp = new int[s.length()][2];
        char[] chars = s.toCharArray();
        int[] max = dp[0];
        for (int i = 1; i < chars.length; i++) {
            dp[i] = new int[]{i, i};
            if (chars[i] == chars[i - 1]) {
                dp[i] = new int[]{i - 1, i};
            }
            if (isPalindrom(chars, dp[i - 1][0], i)) {
                dp[i] = new int[]{dp[i - 1][0], i};
            }
            if (i > 1 && isPalindrom(chars, dp[i - 1][0] - 1, i)) {
                dp[i] = max(dp[i], new int[]{dp[i - 1][0] - 1, i});
            }
            if (i > 1 && isPalindrom(chars, dp[i - 2][0], i)) {
                dp[i] = max(dp[i], new int[]{dp[i - 2][0], i});
            }
            //
            max = max(dp[i], max);
        }
        return s.substring(max[0], max[1] + 1);
    }

    private int[] max(int[] a, int b[]) {
        if (a[1] - a[0] > b[1] - b[0]) {
            return a;
        } else {
            return b;
        }
    }

    private boolean isPalindrom(char[] chars, int i, int j) {
        if (i < 0 || j == chars.length) return false;
        while (j > i) {
            if (chars[i] != chars[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
