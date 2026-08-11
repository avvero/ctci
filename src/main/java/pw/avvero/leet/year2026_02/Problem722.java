package pw.avvero.leet.year2026_02;

import java.util.Arrays;
import java.util.List;

public class Problem722 {

    public List<String> removeComments(String[] source) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < source.length; i++) {
            sb.append(source[i]);
            if (i < source.length - 1) {
                sb.append("\n");
            }
        }
        String big = sb.toString();
        StringBuilder result = new StringBuilder();
        //
        for (int i = 0; i < big.length(); i++) {
            if (big.charAt(i) == '/' && big.charAt(i + 1) == '/') { // skip line
                while (big.charAt(i) != '\n') {
                    i++;
                }
                continue;
            }
            if (big.charAt(i) == '/' && big.charAt(i + 1) == '*') {
                i+=3;
                while (big.charAt(i - 1) != '*' && big.charAt(i) != '/') {
                    i++;
                    //
                }
                continue;
            }
            result.append(big.charAt(i));
        }
        //
        return Arrays.asList(result.toString().split("\n"));
    }
}
