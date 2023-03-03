package pw.avvero.leet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        List<String> wordDictFiltered = new ArrayList<>(wordDict.size());
        for (String word: wordDict) {
            if (!wordBreakCheck(word, wordDict)) {
                wordDictFiltered.add(word);
            }
        }
        return wordBreakCheck(s, wordDictFiltered);
    }

    private boolean wordBreakCheck(String s, List<String> wordDict) {
        for (String word: wordDict) {
            if (word == s) return false; // dirty
            if (word.length() > s.length()) continue;
            String r = s;
            if(r.startsWith(word)) {
                String rr = String.valueOf(r.toCharArray(), word.length(), r.length() - word.length());
                r = rr;
            }
            if (r.length() == 0) return true;
            if (r.length() < s.length()) {
                boolean result = wordBreakCheck(r, wordDict);
                if (result) return true;
            }
        }
        return false;
    }
}
