package org.alking.p700;

public class P709 {


    public String toLowerCase(String str) {
        int gap = 'z' - 'Z';
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ('A' <= c && c <= 'Z') {
                chars[i] = (char) (c + gap);
            }
        }
        return new String(chars);
    }
}
