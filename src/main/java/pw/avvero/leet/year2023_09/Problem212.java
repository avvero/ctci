package pw.avvero.leet.year2023_09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Problem212 {

    private static class Node {
        HashMap<Character, Node> children = new HashMap<>();
    }

    public List<String> findWords(char[][] board, String[] words) {
        Node root = new Node();

        int[][] visited = new int[board.length][];
        for (int i = 0; i < board.length; i++) {
            visited[i] = new int[board[i].length];
        }
        int n = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                traverse(board, i, j, visited, ++n, root);
            }
        }
        List<String> result = new ArrayList<>();
        for (String word: words) {
            if (find(root, word.toCharArray(), 0)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean find(Node node, char[] word, int i) {
        if (i == word.length) return true;
        if (node == null || node.children.isEmpty()) return false;
        Node child = node.children.get(word[i]);
        if (child == null) return false;
        return find(child, word, i + 1);
    }

    private void traverse(char[][] board, int i, int j, int[][] visited, int n, Node node) {
        if (i < 0 || i >= board.length) return;
        if (j < 0 || j >= board[i].length) return;
        if (visited[i][j] == n) return;
        visited[i][j] = n;
        Node child = node.children.get(board[i][j]);
        if (child == null) {
            child = new Node();
            node.children.put(board[i][j], child);
        }
        traverse(board, i, j + 1, visited, n, child);
        traverse(board, i, j - 1, visited, n, child);
        traverse(board, i + 1, j, visited, n, child);
        traverse(board, i - 1, j, visited, n, child);
        visited[i][j] = 0;
    }

}
