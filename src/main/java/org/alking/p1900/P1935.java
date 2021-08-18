package org.alking.p1900;

public class P1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] broken = new boolean['z' - 'a' + 1];
        for (int i = 0; i < brokenLetters.length(); i++) {
            broken[brokenLetters.charAt(i) - 'a'] = true;
        }


        int acc = 0;
        boolean add = true;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (add) {
                    acc++;
                }
                add = true;
            } else {
                if (!check(broken, c)) {
                    add = false;
                }
            }
        }
        if (add) {
            acc++;
        }
        return acc;
    }

    private boolean check(boolean[] broken, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (broken[word.charAt(i) - 'a']) {
                return false;
            }
        }
        return true;
    }

    private boolean check(boolean[] broken, char c) {
        return !broken[c - 'a'];
    }
}
