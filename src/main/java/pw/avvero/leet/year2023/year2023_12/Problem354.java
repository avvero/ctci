package pw.avvero.leet.year2023.year2023_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem354 {
    private static class Node {
        int[] envelop;
        ArrayList<Node> nodes = new ArrayList<>();
        int level = 0;

        @Override
        public String toString() {
            return "Node{" +
                    "envelop=" + Arrays.toString(envelop) +
                    ", level=" + level +
                    '}';
        }
    }

    public int maxEnvelopes(int[][] env) {
        int[] max = new int[]{1};
        Arrays.sort(env, (a, b) -> a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]);
        Node root = new Node();
        root.envelop = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};

        for (int i = 0; i < env.length; i++) {
            put(root, env[i], max);
        }

        return max[0];
    }

    private boolean isFitInto(int[] small, int[] big) {
        return small[0] < big[0] && small[1] < big[1];
    }

    private int put(Node root, int[] envelop, int[] max) {
        if (isFitInto(envelop, root.envelop)) {
            int maxLevel = -1;
            for (Node node : search(root.nodes, 0, root.nodes.size() - 1, envelop)) {
                int level = put(node, envelop, max);
                maxLevel = Math.max(maxLevel, level);
            }
            if (maxLevel == -1) {
                Node node = new Node();
                node.level = root.level + 1;
                node.envelop = envelop;
                root.nodes.add(node);
                if (root.nodes.size() > 1) {
                    Collections.sort(root.nodes, (a, b) -> a.envelop[0] != b.envelop[0] ? a.envelop[0] - b.envelop[0] : a.envelop[1] - b.envelop[1]);
                }
                maxLevel = node.level;
            }
            max[0] = Math.max(max[0], maxLevel);
            return maxLevel;
        } else {
            return -1;
        }
    }

    private List<Node> search(ArrayList<Node> nodes, int s, int e, int[] envelop) {
        if (nodes == null || nodes.size() == 0 || s > e || s < 0 || e > nodes.size()) return Collections.emptyList();
        List<Node> result = new ArrayList<>();
        int midi = s + ((e - s) / 2);
        Node mid = nodes.get(midi);
        if (isFitInto(envelop, mid.envelop)) {
            result.add(mid);
        }

        if (envelop[0] <= mid.envelop[0] && envelop[1] <= mid.envelop[1]) {
            result.addAll(search(nodes, s, midi - 1, envelop));
        }
        result.addAll(search(nodes, midi + 1, e, envelop));
        return result;
    }
}
