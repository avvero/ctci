package pw.avvero.leet.year2024_12;

public class Problem43 {

    public String multiply(String num1, String num2) {
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        int[] r = new int[Math.max(n1.length, n2.length) * 2];
        for (int j = n2.length - 1; j >= 0; j--) {
            for (int i = n1.length - 1; i >= 0; i--) {
                int ro = r.length - 1 - (n1.length - 1 - i) - (n2.length - 1 - j);
                int d = r[ro] + (n1[i] - '0') * (n2[j] - '0');
                r[ro - 1] = d / 10;
                r[ro] = d % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean tzero = true;
        for (int i = 0; i < r.length; i++) {
            if (!tzero || r[i] > 0) {
                sb.append(r[i]);
                tzero = false;
            }
        }
        return sb.toString();
    }
}
