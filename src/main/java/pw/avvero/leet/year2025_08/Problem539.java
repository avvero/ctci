package pw.avvero.leet.year2025_08;

import java.util.Arrays;
import java.util.List;

public class Problem539 {

    public int findMinDifference(List<String> timePoints) {
        int[] minutes = new int[timePoints.size() * 2];
        for (int i = 0; i < timePoints.size(); i++) {
            String[] parts = timePoints.get(i).split(":");
            int h = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            minutes[i * 2] = h * 60 + m; // 1440 - 1439
            minutes[i * 2 + 1] = (h * 60 + m) - 1440; // 1440 - 1439
        }
        Arrays.sort(minutes);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < minutes.length; i++) {
            min = Math.min(min, minutes[i] - minutes[i - 1]);
        }
        return Math.min(min, 1440 - min);
        // 21 * 60 + 43  = 1303 = 137
        // 02 * 60  + 39 = 159
        //
    }
}
