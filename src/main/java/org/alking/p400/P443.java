package org.alking.p400;

public class P443 {

    private int appendChar(char[] chars, int offset, char c, int count, int[] array) {
        chars[offset++] = c;
        if (count > 1) {
            int cset = 0;
            while (count > 0) {
                array[cset++] = count % 10;
                count = count / 10;
            }
            for (int i = cset-1; i >= 0; i--) {
                chars[offset++] = (char) ('0' + array[i]);
            }
        }
        return offset;
    }

    public int compress(char[] chars) {
        int offset = 0;
        int start = -1;
        char last = 0;
        int count = 0;
        int[] array = new int[10];
        for (int i = 0; i < chars.length; i++) {
            if (start == -1) {
                start = i;
                last = chars[i];
            } else if (chars[i] != last) {
                count = i - start;
                offset = appendChar(chars, offset, last, count, array);
                start = i;
                last = chars[i];
            }
        }
        count = chars.length - start;
        offset = appendChar(chars, offset, last, count, array);
        return offset;
    }
}
