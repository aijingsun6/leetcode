package org.alking.p900;

public class P917 {


    private boolean isLetter(char c) {
        return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
    }

    public String reverseOnlyLetters(String S) {

        char[] array = S.toCharArray();
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (left < right && !isLetter(array[left])) {
                left += 1;
            }
            while (left < right && !isLetter(array[right])) {
                right -= 1;
            }
            if (left > right) {
                break;
            }
            char c = array[left];
            array[left] = array[right];
            array[right] = c;
            left += 1;
            right -= 1;
        }
        return String.valueOf(array);

    }
}
