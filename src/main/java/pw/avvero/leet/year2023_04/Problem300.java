package pw.avvero.leet.year2023_04;

public class Problem300 {

    public int lengthOfLIS(int[] nums) {
        int result = 1;
        int[] weight = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            weight[i] = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    weight[i] = Math.max(weight[i], weight[j] + 1);
                    result = Math.max(result, weight[i]);
                }
            }
        }
        return result;
    }

}
