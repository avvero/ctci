package pw.avvero.leet.year2023_09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Problem212 {

    private static class Node {
        int[] place = new int[]{0, 0};
        HashMap<Character, Node> children = new HashMap<>();
    }
    public List<String> findWords(char[][] board, String[] words) {
        Node root = new Node();

        int[][] visited = new int[board.length][];
        for (int i = 0; i < board.length; i++) {
            visited[i] = new int[board[i].length];
        }
        int n = 0;
        List<String> result = new ArrayList<>();
        for (String word: words) {
            char[] chars = word.toCharArray();
            int[] start = findPath(root, chars, 0);
            for (int i = start[0]; i < board.length; i++) {
                for (int j = start[0]; j < board[i].length; j++) {
                    if (chars[0] == board[i][j]) {
                        int[] found = new int[1];
                        traverse(board, i, j, visited, ++n, root, chars, 0, found);
                        if (found[0] == 1) {
                            result.add(word);
                            i = board.length;
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }

    private int[] findPath(Node node, char[] word, int i) {
        Node child = node.children.get(word[i]);
        if (child == null) return node.place;
        return findPath(child, word, i + 1);
    }

    private void traverse(char[][] board, int i, int j, int[][] visited, int n, Node node, char[] word, int wi, int[] found) {
        if (found[0] == 1) return;
        if (i < 0 || i >= board.length) return;
        if (j < 0 || j >= board[i].length) return;
        if (visited[i][j] == n) return;
        if (board[i][j] != word[wi]) return;
        if (word.length - 1 == wi) {
            found[0] = 1;
            return;
        }
        visited[i][j] = n;
        Node child = node.children.get(board[i][j]);
        if (child == null) {
            child = new Node();
            node.children.put(board[i][j], child);
            node.place = new int[] {i, j};
        }
        traverse(board, i, j + 1, visited, n, child, word, wi + 1, found);
        traverse(board, i, j - 1, visited, n, child, word, wi + 1, found);
        traverse(board, i + 1, j, visited, n, child, word, wi + 1, found);
        traverse(board, i - 1, j, visited, n, child, word, wi + 1, found);
        visited[i][j] = 0;
    }

}
