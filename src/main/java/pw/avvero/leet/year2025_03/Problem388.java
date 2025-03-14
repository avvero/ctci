package pw.avvero.leet.year2025_03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem388 {

    public int lengthLongestPath(String input) {
        List<String> path = new LinkedList<>();
        int max = 0;
        int pathLength = 0;
        String[] entries = input.split("\n");
        for (String entry : entries) {
            int level = level(entry);
            int toRemove = path.size() - level;
            while (toRemove-- > 0) {
                pathLength = pathLength - path.get(path.size() - 1).length();
                path.remove(path.size() - 1);
            }
            String sub = entry.substring(level, entry.length());
            path.add(sub);
            pathLength = pathLength + sub.length();
            max = Math.max(max, pathLength + path.size() - 1);
        }
        return max;
    }

    private int level(String entry) {
        int l = 0;
        for (int i = 0; i < entry.length(); i++) {
            if (entry.charAt(i) == '\t') {
                l++;
            } else {
                break;
            }
        }
        return l;
    }
}
