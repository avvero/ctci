package pw.avvero.leet.year2025_08;

public class Problem556 {

    public int nextGreaterElement(int n) {
        int[] min = new int[] {-1};
        char[] chars = Integer.toString(n).toCharArray();
        char[] maxChars = "2147483647".toCharArray();
        int[] cap = new int[32];
        for (char ch : chars) {
            cap[ch - '0']++;
        }
        traverse(chars, n, cap, maxChars, new char[chars.length], 0, min);
        return min[0];
    }

    private int cmpPrefix(char[] a, char[] b, int len) {
        for (int i = 0; i < len; i++) {
            if (a[i] != b[i]) return a[i] - b[i];
        }
        return 0;
    }

    private void traverse(char[] chars, int n, int[] cap, char[] maxChars, char[] entry, int s, int[] min) {
        if (chars.length == 10 && s > 0 && cmpPrefix(entry, maxChars, s) > 0) return; // big
        if (s == chars.length) { // end
            int val = Integer.parseInt(new String(entry));
            if (val <= n) return;
            min[0] = min[0] == -1 ? val : Math.min(min[0], val);
            return;
        }
        for (char ch : chars) {
            if (cap[ch - '0'] == 0) continue;
            if (s == 0 && ch == '0') continue;
            entry[s] = ch;
            cap[ch - '0']--;
            traverse(chars, n, cap, maxChars, entry, s + 1, min);
            cap[ch - '0']++;
        }
    }
}
