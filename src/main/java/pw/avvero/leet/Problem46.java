package pw.avvero.leet;

import java.util.ArrayList;
import java.util.List;

public class Problem46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> entry = new ArrayList();
        permute(nums, new int[6], result, entry);
        return result;
    }

    private void permute(int[] nums, int[] cache, List<List<Integer>> result, List<Integer> entry) {
        if (nums.length == entry.size()) {
            result.add(new ArrayList(entry));
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            if (cache[j] == 1) continue;
            entry.add(nums[j]);
            cache[j] = 1;
            permute(nums, cache, result, entry);
            entry.remove(entry.size() - 1);
            cache[j] = 0;
        }
    }
}
