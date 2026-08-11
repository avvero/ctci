package pw.avvero.leet.year2026_02;

import java.util.ArrayList;
import java.util.List;

public class Problem842 {

    // 1 1 0 1 1 1 1
    //
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num.length(); i++) {
            traverse(num, 0, i, result, new ArrayList<>());
        }
        return result;
    }

    private void traverse(String num, int a, int b, List<Integer> result, List<Integer> entry) {
        if (result.size() > 0) return;
        //
        if (num.charAt(a) == '0' && a < b) return; // leading zero
        //
        Integer val = Integer.valueOf(num.substring(a, b + 1));
        if (entry.size() < 2) {
            entry.add(val);
        } else {
            if (val == entry.get(entry.size() - 1) + entry.get(entry.size() - 2)) {
                entry.add(val);
            } else {
                return; // wrong way
            }
        }
        //
        if (b == num.length() - 1 && result.size() == 0 && entry.size() >= 3) {
            result.addAll(entry);
            return;
        }
        //
        for (int i = b + 1; i < num.length(); i++) {
            traverse(num, b + 1, i, result, entry);
        }
        if (entry.size() > 0) {
            entry.remove(entry.size() - 1);
        }
    }
}
