package pw.avvero.leet.year2023_11;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Problem264 {
    public int nthUglyNumber(int n) {
        if (n < 7) return n;
        HashSet<Long> numbers = new HashSet<>();
        PriorityQueue<Long> queue = new PriorityQueue<>();
        //
        add(queue, numbers, 1l);
        for (int i = 1; i < n; i++) {
            Long value = queue.poll();
            add(queue, numbers, value * 2);
            add(queue, numbers, value * 3);
            add(queue, numbers, value * 5);
        }
        return queue.poll().intValue();
    }

    private void add(PriorityQueue<Long> queue, HashSet<Long> numbers, Long value) {
        if (value < 0) return;
        if (!numbers.contains(value)) {
            numbers.add(value);
            queue.add(value);
        }
    }
}
