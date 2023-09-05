package pw.avvero.leet.year2023_09;

import java.util.LinkedList;

public class Problem211 {

    static class WordDictionary {

        private static class Node {
            boolean word = false;
            Node[] children = new Node[26];
        }

        Node root = new Node();

        public WordDictionary() {

        }

        public void addWord(String word) {
            addWord(word.toCharArray(), 0, root);
        }

        private void addWord(char[] word, int index, Node node) {
            if (index == word.length) {
                node.word = true;
                return;
            }
            int charIndex = word[index] - 'a';
            Node child = node.children[charIndex];
            if (child == null) {
                child = new Node();
                node.children[charIndex] = child;
            }
            addWord(word, index + 1, child);
        }

        public boolean search(String word) {
            return search(word.toCharArray(), 0, root);
        }

        private boolean search(char[] word, int index, Node node) {
            if (node == null) return false;
            if (word.length == index) {
                return node.word;
            }
            int charIndex = word[index] - 'a';
            //if (charIndex < 0) return false;
            Node child = node.children[charIndex];
            return search(word, index + 1, child);
        }
    }


}
