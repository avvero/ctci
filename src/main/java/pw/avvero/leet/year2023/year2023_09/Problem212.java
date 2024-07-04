package pw.avvero.leet.year2023.year2023_09;

import java.util.*;

public class Problem212 {

    private static class Node {
        char chr;
        Node parent;
        int level;
        HashMap<String, int[]> places = new HashMap<>();
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
            int[] found = new int[1];
            char[] chars = word.toCharArray();
            ++n;
            Node toVisit = findPaths(root, chars, 0, visited, n);
            for (int[] place : toVisit.places.values()) {
                visited[place[0]][place[1]] = -1;
                traverse(board, place[0], place[1], visited, n, toVisit.parent, chars, toVisit.parent.level, found);
                if (found[0] == 1) {
                    result.add(word);
                } else {
                    //found[0] = 1; // dirty break
                }
            }
            if (found[0] == 1) continue;
            //
            for (int i = 0; i < board.length; i++) {
                if (found[0] == 1) break;
                for (int j = 0; j < board[i].length; j++) {
                    if (found[0] == 1) break;
                    if (chars[0] == board[i][j]) {
                        traverse(board, i, j, visited, ++n, root, chars, 0, found);
                        if (found[0] == 1) {
                            result.add(word);
                        }
                    }
                }
            }
        }
        return result;
    }

    private Node findPaths(Node node, char[] word, int wi, int[][] visited, int n) {
        if (word.length - 1 ==  wi) return node;
        for (int[] place : node.places.values()) {
            visited[place[0]][place[1]] = n;
        }
        if (word.length ==  wi) return node;
        Node child = node.children.get(word[wi]);
        if (child == null) return node;
        return findPaths(child, word, wi + 1, visited, n);
    }

    private void traverse(char[][] board, int i, int j, int[][] visited, int n, Node node, char[] word, int wi, int[] found) {
        if (found[0] == 1) return;
        if (i < 0 || i >= board.length) return;
        if (j < 0 || j >= board[i].length) return;
        if (visited[i][j] == n) return;

        Node child = node.children.get(board[i][j]);
        if (child == null) {
            child = new Node();
            child.parent = node;
            child.level = node.level + 1;
            child.chr = board[i][j];
            node.children.put(board[i][j], child);
        }
        child.places.putIfAbsent(i  + ":" + j, new int[] {i, j});

        if (board[i][j] != word[wi]) return;
        if (word.length - 1 == wi) {
            found[0] = 1;
            return;
        }
        visited[i][j] = n;
        traverse(board, i, j + 1, visited, n, child, word, wi + 1, found);
        traverse(board, i, j - 1, visited, n, child, word, wi + 1, found);
        traverse(board, i + 1, j, visited, n, child, word, wi + 1, found);
        traverse(board, i - 1, j, visited, n, child, word, wi + 1, found);
        visited[i][j] = 0;
    }
}
