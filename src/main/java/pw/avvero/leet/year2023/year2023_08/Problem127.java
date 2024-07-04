package pw.avvero.leet.year2023.year2023_08;

import java.util.*;

public class Problem127 {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashMap<String, Integer> depthMap = new HashMap<>();
        LinkedList<String> toVisit = new LinkedList<>();
        toVisit.add(beginWord);
        depthMap.put(beginWord, 1);
        for (String word : wordList) {
            depthMap.putIfAbsent(word, 0);
        }
        while (!toVisit.isEmpty()) {
            String current = toVisit.removeFirst();
            Integer currentDepth = depthMap.get(current);
            for (String word : wordList) {
                int diffs = compare(current, word);
                if (diffs <= 1) {
                    Integer wordDepth = depthMap.get(word);
                    if (wordDepth == 0 || wordDepth > currentDepth + 1) {
                        toVisit.add(word);
                        depthMap.put(word, currentDepth + 1);
                    }
                }
            }
        }
        Integer result = depthMap.get(endWord);
        return result != null ? result : 0;
    }

    private int compare(String a, String b) {
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        int diffs = 0;
        for (int i = 0; i < ac.length; i++) {
            if (ac[i] != bc[i]) {
                diffs++;
            }
        }
        return diffs;
    }

}
