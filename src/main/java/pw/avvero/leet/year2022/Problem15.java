package pw.avvero.leet.year2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem15 {

    public List<List<Integer>> threeSum(int[] v) {
        Arrays.sort(v);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < v.length && v[i] <= 0; i++) {
            int j = i + 1, k = v.length - 1;
            while (j < k) {
                int sum = v[i] + v[j] + v[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    result.add(Arrays.asList(v[i], v[j], v[k]));
                    while (j < k && v[j] == v[j + 1]) {
                        j++;
                    }
                    j++;
                    while (j < k && v[k] == v[k - 1]) {
                        k--;
                    }
                    k--;
                }
            }
            while (i < v.length - 1 && v[i] == v[i + 1]) {
                ++i;
            }
        }
        return result;
    }

    // [-1,0,1,2,-1,-4]
    // [-4,-1,-1,0,1,2]
}
