package pw.avvero.leet.year2023_11;

import java.util.Arrays;
import java.util.List;

public class Problem213 {
    public int rob(int[] nums) {
        int[] path1 = new int[nums.length];
        int[] path2 = new int[nums.length];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            path1[i] = nums[i];
            if (i > 1) {
                path1[i] = Math.max(path1[i], path1[i] + path1[i - 2]);
            }
            if (i > 2) {
                path1[i] = Math.max(path1[i], path1[i] + path1[i - 3]);
            }
            max = Math.max(max, path1[i]);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            path2[i] = nums[i];
            if (i > 1) {
                path2[i] = Math.max(path2[i], path2[i] + path2[i - 2]);
            }
            if (i > 2) {
                path2[i] = Math.max(path2[i], path2[i] + path2[i - 3]);
            }
            max = Math.max(max, path2[i]);
        }
        return max;
    }
}
