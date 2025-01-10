package pw.avvero.leet.year2024.year2024_07;

public class Problem1493 {

    public int longestSubarray(int[] nums) {
        int max = 0;
        int i = 0, j = 0, z = 1;
        int maxSoFar = 0;
        while (j < nums.length && i < nums.length) {
            if (nums[j] == 1) {
                j++;
                maxSoFar++;
            } else {
                if (z == 1) {
                    z--;
                    j++;
                } else {
                    if (nums[i] == 0) {
                        z++;
                    } else {
                        maxSoFar--;
                    }
                    i++;
                }
            }
            max = Math.max(max, maxSoFar);
        }
        return max;
    }
}
