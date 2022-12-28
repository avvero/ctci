package pw.avvero.leet;

public class Problem28 {

    // mississippi issip
    //  issi

    public int strStr(String haystack, String needle) {
        char[] source = haystack.toCharArray();
        char[] target = needle.toCharArray();
        for (int i = 0, k = 0; i < source.length && k < target.length; i++) {
            int m = i;
            while (source[i] == target[k]) {
                if (k == target.length - 1) return i - k; // 3
                if (i == source.length - 1) return -1;
                i++;
                k++;
            }
            if (m != i) {
                i = m;
            }
            k = 0;
        }
        return -1;
    }
}
