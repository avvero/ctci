package pw.avvero.leet.year2025.year2025_12;

import java.util.ArrayList;
import java.util.List;

public class Problem659 {

    public boolean isPossible(int[] nums) {
        ArrayList<Integer> seqs = new ArrayList<>();
        for (int num : nums) {
            seqs.add(num);
        }
        return isPossible(seqs);
    }

    private boolean isPossible(ArrayList<Integer> seqs) {
        if (seqs.size() < 3) return false;
        ArrayList<Integer> head = new ArrayList<>();
        ArrayList<Integer> tail = new ArrayList<>();
        head.add(seqs.get(0));
        for (int i = 1; i < seqs.size(); i++) {
            if (seqs.get(i) - head.get(head.size() - 1) == 1) {
                head.add(seqs.get(i));
                if (head.size() >= 3) {
                    ArrayList<Integer> newTail = newTail(tail, seqs, i + 1);
                    if (isPossible(newTail)) {
                        return true;
                    }
                }
            } else {
                tail.add(seqs.get(i));
            }
        }
        return false;
    }

    private ArrayList<Integer> newTail(ArrayList<Integer> tail, ArrayList<Integer> seqs, int i) {
        ArrayList<Integer> newTail = new ArrayList<>();
        for (Integer val : tail) {
            newTail.add(val);
        }
        for (; i < seqs.size(); i++) {
            newTail.add(seqs.get(i));
        }
        return newTail;
    }
}
