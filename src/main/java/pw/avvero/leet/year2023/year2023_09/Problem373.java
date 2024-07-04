package pw.avvero.leet.year2023.year2023_09;

import java.util.*;

public class Problem373 {

    private class Entry {
        List<Integer> list;
        int sum;

        Entry (int a, int b) {
            this.list = List.of(a, b);
            this.sum = a + b;
        }
    }

    private class Cur {
        int i;
        int j;

        Cur (int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Entry> pairs = new PriorityQueue<>((a, b) -> a.sum - b.sum);

        LinkedList<Cur> cursors = new LinkedList<>();
        cursors.add(new Cur(0, 0));
        int[][] visited = new int[nums1.length][];
        for (int i = 0; i < nums1.length; i++) {
            visited[i] = new int[nums2.length];
        }

        while(!cursors.isEmpty() && pairs.size() < k) {
            Cur cur = cursors.poll();
            int i = cur.i;
            int j = cur.j;
            while (pairs.size() < k && i < nums1.length && j < nums2.length) {
                Cur peek = cursors.peek();
                if (peek != null) {
                    if (nums1[peek.i] + nums2[peek.j] < nums1[i] + nums2[j]) {
                        cursors.add(new Cur(i, j));
                        break;
                    }
                }
                if (visited[i][j] == 0) {
                    pairs.add(new Entry(nums1[i], nums2[j]));
                    visited[i][j] = 1;
                }
                if (i < nums1.length - 1 && j < nums2.length - 1) {
                    int sumi = nums1[i + 1] + nums2[j];
                    int sumj = nums1[i] + nums2[j + 1];
                    if (sumi < sumj) {
                        cursors.add(new Cur(i, j + 1));
                        i++;
                    } else {
                        cursors.add(new Cur(i + 1, j));
                        j++;
                    }
                } else if (i < nums1.length - 1) {
                    i++;
                } else {
                    j++;
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        while(result.size() < k && !pairs.isEmpty()) {
            result.add(pairs.poll().list);
        }
        return result;
    }
}
