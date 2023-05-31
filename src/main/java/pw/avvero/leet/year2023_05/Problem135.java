package pw.avvero.leet.year2023_05;

import java.util.Arrays;

public class Problem135 {

    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        int total = 0;
        for (int i = 0; i < ratings.length; i++) {
            candies[i] = candy(ratings, i, candies);
            total += candies[i];
        }
        return total;
    }

    private int candy(int[] ratings, int i, int[] candies) {
        if (candies[i] > 0) {
            return candies[i];
        }
        if (ratings[i] == 0) {
            candies[i] = 1;
            return candies[i];
        }
        candies[i] = 1;
        if (i > 0 && ratings[i - 1] < ratings[i]) {
            int nCandies = candy(ratings, i - 1, candies);
            if (candies[i] <= nCandies) {
                candies[i] = nCandies + 1;
            }
        }
        if (i < ratings.length - 1 && ratings[i + 1] < ratings[i]) {
            int nCandies = candy(ratings, i + 1, candies);
            if (candies[i] <= nCandies) {
                candies[i] = nCandies + 1;
            }
        }
        return candies[i];
    }
}
