package pw.avvero.leet.year2026_02;

public class Problem725 {

      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = size(head);
        int n = size / k;
        int r = size % k;
        //
        ListNode[] result = new ListNode[k];
        int i = 0;
        //
        ListNode node = head;
        while (node != null) {
            int nc = n;

            while (nc-- > 0) {
                ListNode nextNode = node.next;
                ListNode entryNode = result[i];
                if (entryNode == null) {
                    entryNode = node;
                    result[i] = node;
                } else {
                    entryNode.next = node;
                    entryNode = entryNode.next;
                }
                node.next = null;
                node = nextNode;
            }
            if (r-- > 0) {
                ListNode nextNode = node.next;
                ListNode entryNode = result[i];
                if (entryNode == null) {
                    entryNode = node;
                    result[i] = node;
                } else {
                    entryNode.next = node;
                    entryNode = entryNode.next;
                }
                node.next = null;
                node = nextNode;
            }
            i++;
        }
        return result;
    }

    private int size(ListNode node) {
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }
}
