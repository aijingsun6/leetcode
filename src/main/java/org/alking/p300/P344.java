package org.alking.p300;

public class P344 {

    public void reverseString(char[] s) {
        if (s == null || s.length < 2) {
            return;
        }
        int left = 0;
        int right = s.length - 1;
        char c1;
        char c2;
        while (left < right){
            c1 = s[left];
            c2 = s[right];
            if(c1 != c2){
                s[left] = c2;
                s[right] = c1;
            }
            left ++;
            right --;
        }
    }
}
