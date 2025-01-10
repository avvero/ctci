package pw.avvero.leet.year2024.year2024_03;

import java.util.LinkedList;

public class Problem55 {

    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        int energy = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) return true;
            energy = Math.max(energy - 1, nums[i]);
            if (energy >= nums.length - 1) return true;
            if (energy == 0) break;
        }
        return false;
    }

}
