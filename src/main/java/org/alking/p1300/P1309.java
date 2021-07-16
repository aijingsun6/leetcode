package org.alking.p1300;

public class P1309 {

    public String freqAlphabets(String s) {
        final int N = s.length();
        StringBuffer sb = new StringBuffer();
        int idx = N - 1;
        char[] array = new char[2];
        while (idx >= 0) {

            char c = s.charAt(idx);
            if (c == '#') {
                array[0] = s.charAt(idx - 2);
                array[1] = s.charAt(idx - 1);
                idx = idx - 3;
                int n = Integer.valueOf(new String(array));
                sb.append((char) ('a' + n - 1));
            } else {
                idx = idx - 1;
                sb.append((char) ('a' + c - '1'));
            }

        }
        return sb.reverse().toString();
    }
}
