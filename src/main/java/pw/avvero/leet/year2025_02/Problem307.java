package pw.avvero.leet.year2025_02;

public class Problem307 {

    public static class Node {
        int start;
        int end;
        int sum;
        Node left;
        Node right;

        Node (int start, int end, int sum) {
            this.start = start;
            this.end = end;
            this.sum = sum;
        }
    }

    private int size;
    private Node root;

    //   1 3 5
    // 0 1 4 9
    public Problem307(int[] nums) {
        size = nums.length;
        root = createTree(nums, 0, nums.length - 1);
    }

    private Node createTree(int[] nums, int s, int e) {
        if (s == e) {
            return new Node(s, e, nums[s]);
        }
        int m = s + (e - s) / 2;
        Node node = new Node(s, e, 0);
        node.left = createTree(nums, s, m);
        node.right = createTree(nums, m + 1, e);
        node.sum = node.left.sum + node.right.sum;
        return node;
    }

    public void update(int index, int val) {
        update(index, val, root);
    }

    private void update(int index, int val, Node node) {
        if (node.start == index && node.end == index) {
            node.sum = val;
            return;
        }
        int m = node.start + (node.end - node.start) / 2;
        if (index <= m) {
            update(index, val, node.left);
        } else {
            update(index, val, node.right);
        }
        node.sum = node.left.sum + node.right.sum;
    }

    public int sumRange(int left, int right) {
        return sumRange(left, right, root);
    }

    private int sumRange(int left, int right, Node node) {
        if (node.start == left && node.end == right) {
            return node.sum;
        }
        int m = node.start + (node.end - node.start) / 2;
        if (right <= m) {
            return sumRange(left, right, node.left);
        } else if (left > m) {
            return sumRange(left, right, node.right);
        }
        return sumRange(left, m, node.left) + sumRange(m + 1, right, node.right);
    }
}
