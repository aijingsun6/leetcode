package org.alking.p200;

public class P211 {

    public static class WordDictionary {

        private static final int SIZE = 'z' - 'a' + 1;

        private WordDictionary[] dict = null;

        private boolean leaf = false;

        public WordDictionary() {

        }

        public void addWord(String word) {
            WordDictionary wd = this;
            for (int i = 0; i < word.length(); i++) {
                int idx = word.charAt(i) - 'a';
                if (wd.dict == null) {
                    wd.dict = new WordDictionary[SIZE];
                }
                if (wd.dict[idx] == null) {
                    wd.dict[idx] = new WordDictionary();
                }
                wd = wd.dict[idx];
            }
            wd.leaf = true;

        }

        public boolean search(String word) {
            if (word == null || word.isEmpty()) {
                return false;
            }

            return search(this, word, 0);
        }

        private boolean search(WordDictionary wordDictionary, String word, int idx) {

            if (idx == word.length()) {
                return wordDictionary.leaf;
            }

            if (wordDictionary.dict == null) {
                return false;
            }
            char c = word.charAt(idx);
            if (Character.isLetter(c)) {
                WordDictionary wd = wordDictionary.dict[c - 'a'];
                if (wd == null) {
                    return false;
                }
                return search(wd, word, idx + 1);

            } else if (c == '.') {

                for (WordDictionary wd : wordDictionary.dict) {
                    if (wd == null) {
                        continue;
                    }
                    if (search(wd, word, idx + 1)) {
                        return true;
                    }
                }

            }
            return false;

        }
    }
}
