package pw.avvero.leet.year2025_04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem438 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] pchars = new int[36];
        int[] pcounter = new int[36];
        for (int i = 0; i < p.length(); i++) {
            pchars[p.charAt(i) - 'a'] = 1;
            pcounter[p.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int ws = i - p.length(); // window start
            if (ws >= 0 && pchars[s.charAt(ws) - 'a'] > 0) {
                pcounter[s.charAt(ws) - 'a']++;
            }
            //
            if (pchars[c - 'a'] == 0) continue;
            pcounter[c - 'a']--;
            // check pcounter
            boolean match = true;
            for (int j = 0; j < pcounter.length; j++) {
                if (pcounter[j] != 0) {
                    match = false;
                    break;
                }
            }
            if (match) {
                result.add(ws + 1);
            }
        }
        return result;
    }
}
