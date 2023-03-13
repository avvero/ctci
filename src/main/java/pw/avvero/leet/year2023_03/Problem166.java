package pw.avvero.leet.year2023_03;

import java.util.HashMap;
import java.util.HashSet;

public class Problem166 {

    HashMap<Integer, Integer> cache = new HashMap<>();

    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        String sign = "";
        if (denominator < 0 && numerator < 0) {
            numerator = Math.abs(numerator);
            denominator = Math.abs(denominator);
        }
        if (denominator < 0 || numerator < 0) {
            sign = "-";
            numerator = Math.abs(numerator);
            denominator = Math.abs(denominator);
        }
        char[] result = new char[1000];
        int[] index = new int[]{-1, 0};
        if (numerator < denominator) {
            tail(numerator * 10, denominator, result, 0, index);
            return sign + "0." +  toString(result, index);
        } else {
            int r = numerator / denominator;
            int mod = numerator % denominator;
            if (mod == 0) {
                return sign + String.valueOf(r);
            } else {
                tail(mod * 10, denominator, result, 0, index);
                return sign + String.valueOf(r) + "." + toString(result, index);
            }
        }
    }

    private String toString(char[] result, int[] index) {
        if (index[0] == -1) {
            char[] full = new char[index[1] + 1];
            System.arraycopy(result, 0, full, 0, index[1] + 1);
            return new String(full);
        } else {
            char[] part = new char[index[1] + 1 + 2];
            part[part.length - 1] = ')';
            part[index[0]] = '(';
            if (index[0] == 0) {
                System.arraycopy(result, 0, part, 1, index[1] + 1);
            } else {
                //System.arraycopy(result, 0, part, 1, index[1] + 1);
                System.arraycopy(result, 0, part, 0, index[0]);
                System.arraycopy(result, index[0], part, index[0] + 1, index[1] + 1 - index[0]);
            }
            return new String(part);
        }
    }

    private void tail(int num, int den, char[]result, int i, int[] index) {
        if (cache.get(num) != null) {
            index[0] = cache.get(num);
            return;
        } else {
            cache.put(num, i);
        }
        index[1] = i;
        if (num < den) {
            result[i] = '0';
            tail(num * 10, den, result, ++i, index);
        } else {
            int r = num / den;
            int mod = num % den;
            if (mod == 0) {
                result[i] = (char)(r + '0');
            } else {
                result[i] = (char)(r + '0');
                tail(mod * 10, den, result, ++i, index);
            }
        }
    }

}
