package org.alking.p1900;

public class P1957 {

    public String makeFancyString(String s) {
        final int N = s.length();
        char[] array = new char[N];
        int offset = 0;
        char lastC = '0';
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            if (c != lastC) {
                array[offset++] = c;
                lastC = c;
                cnt = 1;
            } else if (cnt < 2) {
                array[offset++] = c;
                cnt++;
            } else {
                cnt++;
            }
        }
        return new String(array, 0, offset);
    }
}
