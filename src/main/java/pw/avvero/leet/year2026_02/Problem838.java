package pw.avvero.leet.year2026_02;

public class Problem838 {

    // .L.R...LR..L..
    //
    // LL.RR.LLRRLL..
    // .L
    // R.
    // R.L
    // RL - non
    // LR - non
    // L. - non
    // .R - non
    public String pushDominoes(String dominoes) {
        char[] chars = dominoes.toCharArray();
        int i = 0;
        while (i < chars.length) {
            if (chars[i] == '.') {
                i++;
            } else if (chars[i] == 'L') {
                int j = i - 1;
                while(j >= 0 && chars[j] == '.') {
                    chars[j] = 'L';
                    j--;
                }
                i++;
            } else if (chars[i] == 'R') {
                int j = i + 1;
                while (j < chars.length && chars[j] == '.') {
                    j++;
                }
                if (j < chars.length && chars[j] == 'L') {
                    replace(chars, i + 1, j - 1, '.');
                    i = j + 1;
                } else {
                    replace(chars, i + 1, Math.min(j - 1, chars.length - 1), 'R');
                    i = j;
                }
            }
        }
        return new String(chars);
    }

    private void replace(char[] chars, int a, int b, char c) {
        for (int i = a; i <= b; i++) {
            chars[i] = c;
        }
    }
}
