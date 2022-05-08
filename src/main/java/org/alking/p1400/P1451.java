package org.alking.p1400;

import java.util.Arrays;
import java.util.Comparator;

public class P1451 {

    public String arrangeWords(String text) {

        String[] arr = text.split(" ");
        arr[0] = arr[0].toLowerCase();
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int s1 = o1.length();
                int s2 = o2.length();
                return s1 - s2;
            }
        });

        String f = arr[0];
        char[] cs = arr[0].toCharArray();
        cs[0] = Character.toUpperCase(cs[0]);
        arr[0] = new String(cs);

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            sb.append(" ").append(arr[i]);
        }
        return sb.toString();
    }
}
