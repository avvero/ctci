package pw.avvero.leet.year2024_07;

public class Problem643 {

    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int i = 0, j = i + k - 1;
        while (j < nums.length) {
            if (i != 0) {
                double sumSoFar = sum - nums[i - 1] + nums[j];
                sum = Math.max(sum, sumSoFar);
            }
            i++;
            j++;
        }
        return sum / k;
    }
}
