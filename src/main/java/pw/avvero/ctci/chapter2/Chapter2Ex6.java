package pw.avvero.ctci.chapter2;

import java.util.HashMap;
import java.util.Map;

public class Chapter2Ex6 {

    public static Node<String> find(Node<String> list) {
        Map<String, Node<String>> buffer = new HashMap<>();
        Node<String> current = list;
        do {
            if (buffer.putIfAbsent(current.getValue(), current) != null) {
                return current;
            }
            current = current.getNext();
        } while (current != null);
        return list;
    }

    public static Node<String> find2(Node<String> list) {
        return list;
    }
}
