package pw.avvero.leet.year2026_02;

public class Problem707 {

    public class MyLinkedList {

        public static class Node {
            int val;
            Node prev;
            Node next;

            Node(int val, Node prev, Node next) {
                this.val = val;
                this.prev = prev;
                this.next = next;
            }
        }

        Node head = null;
        Node tail = null;
        public int size = 0;

        public MyLinkedList() {

        }

        public int get(int index) {
            if (index >= size) return -1;
            print(head);
            Node cur = head;
            while (index-- > 0) {
                cur = cur.next;
            }
            return cur.val;
        }

        public void addAtHead(int val) {
            Node prevHead = head;
            head = new Node(val, null, head);
            if (prevHead != null) {
                prevHead.prev = head;
            }
            if (tail == null) {
                tail = head;
            }
            size++;
            print(head);
        }

        public void addAtTail(int val) {
            Node prevTail = tail;
            tail = new Node(val, tail, null);
            if (prevTail != null) {
                prevTail.next = tail;
            }
            if (head == null) {
                head = tail;
            }
            size++;
            print(head);
        }

        public void addAtIndex(int index, int val) {
            if (index == 0) {
                addAtHead(val);
                return;
            }
            if (index == size) {
                addAtTail(val);
                return;
            }
            Node cur = head;
            while (index-- > 0) {
                cur = cur.next;
            }
            Node node = new Node(val, cur.prev, cur);
            //
            cur.prev.next = node;
            cur.prev = node;
            size++;
            print(head);
        }

        public void deleteAtIndex(int index) {
            if (size == 0) return;
            if (index == size) return;
            if (index == 0) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                } else {
                    tail = null;
                }
                print(head);
                return;
            }
            if (index == size - 1) {
                tail = tail.prev;
                if (tail != null) {
                    tail.next = null;
                } else {
                    head = null;
                }
                print(head);
                return;
            }
            Node cur = head;
            while (index-- > 0) {
                cur = cur.next;
            }
            if (cur.prev != null) {
                cur.prev.next = cur.next;
            }
            if (cur.next != null) {
                cur.next.prev = cur.prev;
            }
            //
            size--;
            print(head);
        }

        private void print(Node node) {
            StringBuilder sb = new StringBuilder("Nodes: ");
            Node cur = node;
            while (cur != null) {
                sb.append(cur.val).append(", ");
                cur = cur.next;
            }
            System.out.println(sb.toString());
        }
    }
}
