package pw.avvero.leet.year2023_05;

import java.util.Arrays;

public class Problem135 {

    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
        int undistributed = 1;
        int s = 1;
        int sNext = 1;
        while (undistributed > 0) {
            for (int i = 0; i < ratings.length; i++) {
                if (ratings[i] < s) continue;
                if (ratings[i] > s) {
                    undistributed++;
                    sNext = Math.min(s + 1, ratings[i]);
                } else {
                    if (i > 0 && ratings[i - 1] < ratings[i] && candies[i - 1] >= candies[i]) {
                        candies[i] = candies[i - 1] + 1;
                    }
                    if (i < ratings.length - 1 && ratings[i + 1] < ratings[i] && candies[i + 1] >= candies[i]) {
                        candies[i] = candies[i + 1] + 1;
                    }
                }
            }
            s = sNext;
            undistributed--;
        }
        int count = 0;
        for (int candy : candies) {
            count += candy;
        }
        return count;
    }
}
