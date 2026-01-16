package pw.avvero.leet.year2026_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Problem672 {

    public int flipLights(int n, int presses) {
        HashSet<String> hash = new HashSet<>();
        boolean[] bulbs = new boolean[n];
        Arrays.fill(bulbs, true);
        traverse(bulbs, presses, hash);
        return hash.size();
    }

    private void traverse(boolean[] bulbs, int presses, HashSet<String> hash) {
        if (presses == 0) {
            hash.add(Arrays.toString(bulbs));
            return;
        }
        for (int i = 1; i <= 4; i++) {
            flip(bulbs, i);
            traverse(bulbs, presses - 1, hash);
            flip(bulbs, i);
        }
    }

    private void flip(boolean[] bulbs, int n) {
        if (n == 1) {
            for (int i = 0; i < bulbs.length; i++) {
                bulbs[i] = !bulbs[i];
            }
        } else if (n == 2) {
            for (int i = 0; i < bulbs.length; i = i + 2) {
                bulbs[i] = !bulbs[i];
            }
        } else if (n == 3) {
            for (int i = 1; i < bulbs.length; i = i + 2) {
                bulbs[i] = !bulbs[i];
            }
        } else if (n == 4) {
            for (int i = 0, j = 1; i < bulbs.length && j <= bulbs.length; i++, j = 3 * i + 1) {
                bulbs[j - 1] = !bulbs[j - 1];
            }
        }
    }
}
