package pw.avvero.leet.year2024.year2024_05;

public class Problem34 {

    public int[] searchRange(int[] nums, int target) {
        return searchRange(nums, target, 0, nums.length - 1);
    }

    private int[] searchRange(int[] nums, int target, int s, int e) {
        if (e < s) return new int[]{-1, -1};
        int m = s + (e - s) / 2;
        if (m < target) {
            return searchRange(nums, target, m + 1, e);
        } else if (m > target) {
            return searchRange(nums, target, s, m - 1);
        } else {
            int[] result = new int[]{m, m};
            int[] left = searchRange(nums, target, s, m - 1);
            int leftMax = Math.max(left[0], left[1]);
            int[] right = searchRange(nums, target, m + 1, e);
            int rightMax = Math.max(right[0], right[1]);
            result[0] = Math.max(result[0], leftMax);
            result[1] = Math.max(result[1], rightMax);
            return result;
        }
    }

}
