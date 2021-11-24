package org.alking.p400;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P423 {


    public static String[] ARRAY = new String[]{
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine"
    };

    public static final int[] NUMS = new int[]{
            1, 3, 5, 7, 9
    };


    private boolean decrementWithCheck(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i] - 'a';
            if (bucket[idx] > 0) {
                bucket[idx]--;
            } else {
                for (int j = 0; j < i; j++) {
                    bucket[arr[j] - 'a']++;
                }
                return false;
            }
        }
        return true;
    }

    private void decrement(String s) {
        for (char c : s.toCharArray()) {
            bucket[c - 'a']--;
        }
    }

    ArrayDeque<Integer> result = new ArrayDeque<>();
    int[] bucket = new int[26];
    int count = 0;

    public String originalDigits(String s) {
        result.clear();
        Arrays.fill(bucket, 0);
        count = 0;
        for (char c : s.toCharArray()) {
            bucket[c - 'a']++;
            count++;
        }

        while (count > 0) {
            int n = -1;

            if (bucket['z' - 'a'] > 0) {
                n = 0;
            } else if (bucket['w' - 'a'] > 0) {
                n = 2;
            } else if (bucket['u' - 'a'] > 0) {
                n = 4;
            } else if (bucket['x' - 'a'] > 0) {
                n = 6;
            } else if (bucket['g' - 'a'] > 0) {
                n = 8;
            }
            if (n >= 0) {
                String ns = ARRAY[n];
                decrement(ns);
                count -= ns.length();
                result.addLast(n);
                continue;

            } else {
                for (int i : NUMS) {
                    String ns = ARRAY[i];
                    if(decrementWithCheck(ns)){
                        count -= ns.length();
                        result.addLast(i);
                        break;
                    }
                }

            }
        }
        ArrayList<Integer> list = new ArrayList<>(result);
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (int i : list) {
            sb.append(i);
        }
        return sb.toString();
    }


}
