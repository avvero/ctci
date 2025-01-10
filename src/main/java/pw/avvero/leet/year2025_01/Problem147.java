package pw.avvero.leet.year2025_01;

public class Problem147 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
            this.next = null;
        }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }

        @Override
        public String toString() {
            return "{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = head.next;
        ListNode prev = head;
        while (node != null) {
            if (node.val < prev.val) {
                prev.next = node.next;
                node.next = null;
                head = insert(head, node);
            }
            prev = node;
            node = node.next;
        }
        return head;
    }

    // 4,1,3
    //
    private ListNode insert(ListNode head, ListNode newnode) {
        ListNode node = head;
        ListNode prev = null;
        while (node != null && node.val < newnode.val) {
            prev = node;
            node = node.next;
        }
        if (prev != null) {
            prev.next = newnode;
        } else {
            head = newnode;
        }
        newnode.next = node;
        return head;
    }
}
