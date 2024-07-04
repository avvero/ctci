package pw.avvero.leet.year2023.year2023_03;

import java.util.HashSet;

public class Problem160 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private HashSet<ListNode> cache = new HashSet<>();

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headA != null && headB != null) {
            if (!cache.add(headA)) return headA;
            if (!cache.add(headB)) return headB;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }


}
