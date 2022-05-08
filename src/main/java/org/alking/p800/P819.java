package org.alking.p800;

import java.util.HashMap;
import java.util.HashSet;

public class P819 {

    private static final int HASH = 31;

    private int index(char c) {
        if (c >= 'a' && c <= 'z') {
            return c - 'a';
        }
        if (c >= 'A' && c <= 'Z') {
            return c - 'A';
        }
        return -1;
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<Integer> banSet = new HashSet<>();
        for (String b : banned) {
            int sum = 0;
            for (char c : b.toCharArray()) {
                int idx = index(c);
                if (idx >= 0) {
                    sum = sum * HASH + idx;
                }
            }
            banSet.add(sum);
        }
        if (paragraph.charAt(paragraph.length() - 1) != '.') {
            paragraph = paragraph + ".";
        }
        HashMap<Integer, Integer> cnt = new HashMap<>();
        int max = 0;
        String result = "";
        int sum = -1;
        int left = -1;
        for (int i = 0; i < paragraph.length(); i++) {
            int idx = index(paragraph.charAt(i));
            if (idx < 0) {
                if (sum != -1 && !banSet.contains(sum)) {
                    int n = cnt.getOrDefault(sum, 0) + 1;
                    if (n > max) {
                        max = n;
                        result = paragraph.substring(left, i);
                    }
                    cnt.put(sum, n);
                }
                sum = -1;
                left = -1;
                continue;
            }
            if (sum < 0) {
                left = i;
                sum = idx;
            } else {
                sum = sum * HASH + idx;
            }
        }
        return result.toLowerCase();
    }


}
