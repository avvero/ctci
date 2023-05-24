package pw.avvero.leet.year2023_05;

import java.util.Arrays;

public class Problem454 {

    class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            Arrays.sort(nums3);
            Arrays.sort(nums4);
            //
            int count = 0;
            int[] counter1 = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                if (i > 0 && nums1[i] == nums1[i - 1]) {
                    counter1[i] = counter1[i - 1];
                    count += counter1[i];
                    continue;
                }
                int[] counter2 = new int[nums2.length];
                for (int j = 0; j < nums2.length; j++) {
                    if (j > 0 && nums2[j] == nums2[j - 1]) {
                        counter2[j] = counter2[j - 1];
                        counter1[i] += counter2[j];
                        count += counter2[j];
                        continue;
                    }
                    int[] counter3 = new int[nums3.length];
                    for (int k = 0; k < nums3.length; k++) {
                        if (k > 0 && nums3[k] == nums3[k - 1]) {
                            counter3[k] = counter3[k - 1];
                            counter2[j] += counter3[k];
                            counter1[i] += counter3[k];
                            count += counter3[k];
                            continue;
                        }
                        for (int l = 0; l < nums4.length; l++) {
                            if (nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0) {
                                count++;
                                counter1[i]++;
                                counter2[j]++;
                                counter3[k]++;
                            }
                        }
                    }
                }
            }
            return count;
        }
    }
}
