package org.alking.p200;

public class P208 {

    public static class Trie {

        private final Trie[] children = new Trie['z' - 'a' + 1];

        private boolean leaf = false;

        public Trie() {
        }

        public void insert(String word) {
            if (word == null || word.isEmpty()) {
                return;
            }
            int size = word.length();
            Trie t = this;
            for (int i = 0; i < size; i++) {
                int idx = word.charAt(i) - 'a';
                Trie tmp = t.children[idx];
                if (t.children[idx] == null) {
                    t.children[idx] = new Trie();
                }
                t = t.children[idx];
            }
            t.leaf = true;
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            Trie t = this;
            int size = word.length();
            for (int i = 0; i < size; i++) {
                int idx = word.charAt(i) - 'a';
                t = t.children[idx];
                if (t == null) {
                    return false;
                }
            }
            return t.leaf;
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            Trie t = this;
            int size = prefix.length();
            for (int i = 0; i < size; i++) {
                int idx = prefix.charAt(i) - 'a';
                t = t.children[idx];
                if (t == null) {
                    return false;
                }
            }
            return true;
        }
    }
}
