package pw.avvero.leet.year2023.year2023_11;

import java.util.Arrays;
import java.util.List;

public class Problem119 {
    public List<Integer> getRow(int rowIndex) {
        Integer[] result = new Integer[rowIndex + 1];
        Arrays.fill(result, 1);
        for (int i = 2; i <= rowIndex; i++) {
            for (int j = 1; j <= result.length / 2; j++) {
                //int prev = result[i];
                result[j] = result[j] + result[j - 1];
            }
        }
        return Arrays.asList(result);
    }
}
