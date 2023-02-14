package pw.avvero.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        if (numRows == 1) return result;
        result.add(Arrays.asList(1, 1));
        if (numRows == 2) return result;

        generate(numRows - 2, result, 1);
        return result;
    }

    private void generate(int numRows, List<List<Integer>> result, int r) {
        if (numRows == 0) return;
        List<Integer> prev = result.get(r);
        List<Integer> entry = new ArrayList<>();
        entry.add(1);
        for (int i = 1; i < prev.size(); i ++) {
            entry.add(prev.get(i - 1) + prev.get(i));
        }
        entry.add(1);
        result.add(entry);
        generate(numRows - 1, result, r + 1);
    }
}
