package pw.avvero.leet.year2025_06;

public class Problem494 {

    public int findTargetSumWays(int[] nums, int target) {
        int[] result = new int[] {0};
        traverse(nums, 0, target, result);
        return result[0];
    }

    private void traverse(int[] nums, int s, int target, int[] result) {
        if (s == nums.length && target == 0) { // last
            result[0]++;
        }
        for (int i = s; i < nums.length; i++) {
            for (int j = 0; j < 2; j++) {
                int a = j == 1 ? nums[i] : -nums[i];
                traverse(nums, i + 1, target - a, result);
            }
        }
    }
}
