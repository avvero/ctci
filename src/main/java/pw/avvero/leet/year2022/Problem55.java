package pw.avvero.leet.year2022;

import java.util.ArrayList;
import java.util.List;

public class Problem55 {
    public boolean canJump(int[] nums) {
        int i = 0;
        int p = nums[i];
        for (; i < nums.length && p >= 1; ++i, --p) {
            if (nums[i] == 0) continue;
            if (nums[i] > p) {
                p = nums[i];
            }
        }
        return i + p >= nums.length - 1;
    }
}
