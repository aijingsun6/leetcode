package org.alking.strings;

public class ReverseString {

    public void reverseString(char[] s) {

        int length = s.length;
        char tmp;
        for (int i = 0; i <= length / 2; i++) {
            tmp = s[i];
            s[i] = s[length-1-i];
            s[length-1-i] = tmp;
        }

    }
}
