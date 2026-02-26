package pw.avvero.leet.year2026_02;

import java.util.Arrays;
import java.util.HashMap;

public class Problem698 {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            sum += num;
            //
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        if (sum % k > 0) return false;
        int avg = sum / k;
        //
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            if (num > avg) return false;
            if (map.get(num) == 0) continue;
            //
            map.put(num, map.get(num) - 1);
            int cur = avg - num;
            while (cur > 0) {
                int cls = closest(map, cur);
                if (cls == -1) return false;
                //
                map.put(cls, map.get(cls) - 1);
                cur -= cls;
            }
        }
        return true;
    }

    private int closest(HashMap<Integer, Integer> map, int val) {
        while (val > 0) {
            if (map.get(val) != null && map.get(val) > 0) return val;
            val--;
        }
        return -1;
    }
}
