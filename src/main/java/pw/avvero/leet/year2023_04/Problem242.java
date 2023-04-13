package pw.avvero.leet.year2023_04;

public class Problem242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] chars = new char[32];
        char[] sc = s.toCharArray();
        for (int i = 0; i < sc.length; i++) {
            chars[sc[i] - 'a']++;
        }
        char[] tc = t.toCharArray();
        for (int i = 0; i < tc.length; i++) {
            chars[tc[i] - 'a']--;
            if (chars[tc[i] - 'a'] < 0) return false;
        }
        return true;
    }

}
