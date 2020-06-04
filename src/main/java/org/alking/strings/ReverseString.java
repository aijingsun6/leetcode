package org.alking.strings;

public class ReverseString {

    public void reverseString(char[] s) {

        int head = 0;
        int tail = s.length -1;
        while (head < tail){
            char t = s[head];
            s[head] = s[tail];
            s[tail] = t;
            head += 1;
            tail -= 1;
        }

    }
}
