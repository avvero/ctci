package pw.avvero.leet.year2023_05;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem454 {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int[][] nums = new int[][]{nums1, nums2, nums3, nums4};
        int[] result = new int[]{0};
        ArrayList<Integer> entry = new ArrayList<>();
        fourSumCount(nums, 0, entry, result);
        return result[0];
    }

    private void fourSumCount(int[][] nums, int n, ArrayList<Integer> entry, int[] result) {
        if (entry.size() == 4 && entry.get(0) + entry.get(1) + entry.get(2) + entry.get(3) == 0) {
            result[0]++;
        }
        if (n == nums.length) return;
        for (int i = 0; i < nums[n].length; i++) {
            entry.add(nums[n][i]);
            fourSumCount(nums, n + 1, entry, result);
            entry.remove(entry.size() - 1);
        }
    }
}
