package pw.avvero.ctci.chapter4;

import pw.avvero.ctci.chapter4.BinaryTree.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumPathFinder {

    public static List<String> find(BinaryTree<Integer> tree, Integer sum) {
        return find(tree.root).get(sum);
    }

    private static Map<Integer, List<String>> find(Node<Integer> node) {
        Map<Integer, List<String>> paths = new HashMap<>();
        if (node == null) return paths;
        Map<Integer, List<String>> leftMap = null;
        if (node.left != null) {
            leftMap = find(node.left);
            leftMap.forEach((k, list) -> {
                paths.computeIfAbsent(k, key -> new ArrayList<>()).addAll(list);
                Integer s = node.value + k;
                list.forEach(v -> {
                    paths.computeIfAbsent(s, key -> new ArrayList<>()).add(v + " -> " + node.value);
                });
            });
        }
        Map<Integer, List<String>> rightMap = null;
        if (node.right != null) {
            rightMap = find(node.right);
            rightMap.forEach((k, list) -> {
                paths.computeIfAbsent(k, key -> new ArrayList<>()).addAll(list);
                Integer s = node.value + k;
                list.forEach(v -> {
                    paths.computeIfAbsent(s, key -> new ArrayList<>()).add(v + " -> " + node.value);
                });
            });
        }
//        if (leftMap != null && rightMap != null) {
//            for (Map.Entry<Integer, List<String>> le : leftMap.entrySet()) {
//                for (Map.Entry<Integer, List<String>> re : rightMap.entrySet()) {
//                    Integer s = le.getKey() + re.getKey() + node.value;
//                    for (String lev : le.getValue()) {
//                        for (String rev : re.getValue()) {
//                            paths.computeIfAbsent(s, key -> new ArrayList<>()).add(lev + " -> " + node.value + " -> " + rev);
//                        }
//                    }
//                }
//            }
//        }
        paths.computeIfAbsent(node.value, key -> new ArrayList<>()).add("" + node.value);
        return paths;
    }

}
