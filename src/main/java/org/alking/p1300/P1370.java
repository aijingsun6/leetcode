package org.alking.p1300;

public class P1370 {


    public String sortString(String s) {

        if (s == null || s.length() == 0) {
            return s;
        }

        int total = s.length();
        int acc = 0;
        int[] arr = new int['z' - 'a' + 1];
        for (int i = 0; i < total; i++) {
            char c = s.charAt(i);
            arr[c - 'a'] += 1;
        }

        StringBuilder sb = new StringBuilder();
        boolean inc = true;
        while (acc < total) {
            if (inc) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i]-- > 0) {
                        sb.append((char) ('a' + i));
                        acc += 1;
                    }
                }
            } else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    if (arr[i]-- > 0) {
                        sb.append((char) ('a' + i));
                        acc += 1;
                    }
                }
            }
            inc = !inc;
        }
        return sb.toString();
    }
}
