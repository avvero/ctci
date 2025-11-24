package pw.avvero.leet.year2025_09;

import java.util.ArrayList;
import java.util.List;

public class Problem592 {

    public String fractionAddition(String expression) {
        List<int[]> entries = new ArrayList<>();
        int[] entry = null;
        int maxDenominator = 1;
        for (int i = 0; i < expression.length();) {
            char c = expression.charAt(i);
            if (c == '-' || c == '+') {
                entry = new int[] {1, 0, 0};
                entries.add(entry);
                if (c == '-') {
                    entry[0] = -1;
                }
                i++;
                continue;
            }
            if (i == 0) {
                entry = new int[] {1, 0, 0};
                entries.add(entry);
            }
            while (i < expression.length() && expression.charAt(i) >= '0' && expression.charAt(i) <= '9') {
                entry[1] = expression.charAt(i) - '0';
                i++;
            }
            i++;
            while (i < expression.length() && expression.charAt(i) >= '0' && expression.charAt(i) <= '9') {
                entry[2] = expression.charAt(i) - '0';
                maxDenominator = maxd(maxDenominator, entry[2]);
                i++;
            }
        }
        for (int[] e : entries) {
            e[1] = e[1] * (maxDenominator / e[2]);
            e[2] = maxDenominator;
        }
        int[] result = new int[] {0, 0};
        for (int[] e : entries) {
            result[0] = result[0] + e[0] * e[1];
            result[1] = e[2];
        }
        if (result[0] == 0) return "0/1";
        int gcd = gcd(Math.abs(result[0]), Math.abs(result[1]));
        result[0] = result[0] / gcd;
        result[1] = result[1] / gcd;
        return "" + result[0] + "/" + result[1];
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private int maxd(int a, int b) {
        if (a == b) return a;
        if (a > b && a % b == 0) return a;
        if (b > a && b % a == 0) return b;
        return a * b;
    }
}
