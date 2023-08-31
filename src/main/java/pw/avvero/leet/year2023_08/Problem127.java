package pw.avvero.leet.year2023_08;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem127 {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dictionary = new HashSet<>();
        for (String word : wordList) {
            dictionary.add(word);
        }
        int result = ladderLength(beginWord, endWord, dictionary);
        return result > -1 ? result : 0;
    }

    private int ladderLength(String beginWord, String endWord, Set<String> dictionary) {
        if (beginWord.equals(endWord)) return 1;
        if (!dictionary.contains(endWord)) return -1;
        int length = -1;
        for (String word : dictionary) {
            int diffs = compare(beginWord, word);
            if (diffs <= 1) {
                Set<String> subDictionary = new HashSet<>(dictionary);
                subDictionary.remove(word);
                int lengthSoFar = ladderLength(word, endWord, subDictionary);
                if (lengthSoFar > -1) {
                    length = length == -1 ? lengthSoFar + 1 : Math.min(length, lengthSoFar + 1);
                }
            }
        }
        return length;
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
