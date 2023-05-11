package pw.avvero.leet.year2023_04;

import java.util.Iterator;
import java.util.List;

public class Problem347 {
    public int[] topKFrequent(int[] nums, int k) {
        int[] freq = new int[20000];
        int[] result = new int[k];
        for (int i = 0; i < nums.length; i++) {
            int num = 10000 + nums[i];
            freq[num]++;
            push(result, freq, num);
        }
        return result;
    }

    // 1,2,3
    // 3,
    private void push(int[] result, int[] freq, int num) {
        for (int i = 0; i < result.length; i++) {
            if (result[i] == num - 10000) return;
            if (freq[result[i] + 10000] < freq[num]) {
                int old = result[i];
                result[i] = num - 10000;
                for (int j = i + 1; j < result.length; j++) {
                    int nextOld = result[j];
                    result[j] = old;
                    old = nextOld;
                    if (old == num - 10000) {
                        return;
                    }
                }
                return;
            }
        }
    }
}
