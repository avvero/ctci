package pw.avvero.leet.year2024_09;

import java.util.Arrays;

public class Problem875 {

    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        return minEatingSpeed(piles, h, 1, piles[piles.length - 1]);
    }

    private int minEatingSpeed(int[] piles, int h, int min, int max) {
        if (min > max) return -1;
        int speed = (min + max) / 2;
        int hours = hours(piles, speed);
        if (hours <= h) {
            int next = minEatingSpeed(piles, h, min, speed - 1);
            if (next == -1) {
                return speed;
            } else {
                return next;
            }
        } else {
            return minEatingSpeed(piles, h, speed + 1, max);
        }
    }

    private int hours(int[] piles, int speed) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + speed - 1) / speed; // Деление с округлением вверх
        }
        return hours;
    }
}
