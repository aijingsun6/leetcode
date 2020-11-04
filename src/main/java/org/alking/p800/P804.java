package org.alking.p800;

import java.util.HashSet;

public class P804 {

    String[] dict = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    private String trans(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            sb.append(dict[c - 'a']);
        }
        return sb.toString();
    }

    public int uniqueMorseRepresentations(String[] words) {

        HashSet<String> set = new HashSet<>();
        for(String word:words){
            set.add(trans(word));
        }
        return set.size();
    }
}
