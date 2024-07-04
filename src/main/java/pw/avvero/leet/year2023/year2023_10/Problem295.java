package pw.avvero.leet.year2023.year2023_10;

import java.util.PriorityQueue;

public class Problem295 {

    public static class MedianFinder {

        private PriorityQueue<Integer> left = new PriorityQueue<>((a, b) -> b - a);
        private PriorityQueue<Integer> right = new PriorityQueue<>();

        public MedianFinder() {

        }

        public void addNum(int num) {
            if (left.isEmpty() && right.isEmpty()) {
                left.add(num);
                return;
            }
            PriorityQueue<Integer> order = new PriorityQueue<>((a, b) -> b - a);
            order.add(num);

            Integer leftEntry = left.poll();
            if (leftEntry != null) {
                order.add(leftEntry);
            }
            Integer rightEntry = right.poll();
            if (rightEntry != null) {
                order.add(rightEntry);
            }
            if (left.size() > right.size()) {
                order.add(left.poll());
            }
            if (order.size() == 2) {
                right.add(order.poll());
                left.add(order.poll());
            } else if (order.size() == 3) {
                right.add(order.poll());
                left.add(order.poll());
                left.add(order.poll());
            } else if (order.size() == 4) {
                right.add(order.poll());
                right.add(order.poll());
                left.add(order.poll());
                left.add(order.poll());
            }
        }

        public double findMedian() {
            if (left.size() > right.size()) {
                return left.peek();
            } else {
                return (double) (left.peek() + right.peek()) / 2;
            }
        }
    }
}
