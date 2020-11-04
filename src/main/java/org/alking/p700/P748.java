package org.alking.p700;

import java.util.HashSet;

public class P748 {

    private int[] buildCntArray(String word) {
        int[] arr = new int['z' - 'a' + 1];
        for (char c : word.toCharArray()) {
            c = Character.toLowerCase(c);
            if (c >= 'a' && c <= 'z') {
                int idx = c - 'a';
                arr[idx] += 1;
            }
        }
        return arr;
    }


    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] arr = buildCntArray(licensePlate);
        HashSet<Integer> cs = new HashSet<>();
        for (char c : licensePlate.toCharArray()) {
            c = Character.toLowerCase(c);
            if (c >= 'a' && c <= 'z') {
                int idx = c - 'a';
                cs.add(idx);
            }
        }

        String res = null;
        for (String word : words) {
            if (res != null && word.length() >= res.length()) {
                continue;
            }
            boolean ok = true;
            int[] barr = buildCntArray(word);
            for (Integer idx : cs) {
                if (barr[idx] < arr[idx]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                if (res == null) {
                    res = word;
                } else if (word.length() < res.length()) {
                    res = word;
                }
            }
        }
        return res;

    }
}
