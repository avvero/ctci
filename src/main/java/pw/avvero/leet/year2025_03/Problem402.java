package pw.avvero.leet.year2025_03;

import java.util.LinkedList;

public class Problem402 {

    public String removeKdigits(String num, int k) {
        LinkedList<Integer> source = new LinkedList<>();
        LinkedList<Integer> dest = new LinkedList<>();
        for (char c : num.toCharArray()) {
            source.add(c - '0');
        }
        dest.add(source.removeFirst());
        while(!source.isEmpty() && k > 0) {
            Integer a = source.removeFirst();
            Integer b = dest.peekLast();
            if (a >= b) {
                dest.add(a);
            } else {
                dest.removeLast();
//                dest.add(a);
                k--;
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!dest.isEmpty()) {
            sb.append(dest.removeFirst());
        }
        return sb.length() > 0 ? sb.toString() : "0";
    }
}
