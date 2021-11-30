package org.alking.p400;

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

    private void decrement(String s) {
        for (char c : s.toCharArray()) {
            bucket[c - 'a']--;
        }
    }

    ArrayList<Integer> result = new ArrayList<>();
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
            } else if (bucket['f' - 'a'] > 0) {
                n = 5;
            } else if (bucket['o' - 'a'] > 0) {
                n = 1;
            } else if (bucket['r' - 'a'] > 0) {
                n = 3;
            } else if (bucket['i' - 'a'] > 0) {
                n = 9;
            } else if (bucket['s' - 'a'] > 0) {
                n = 7;
            }
            String ns = ARRAY[n];
            decrement(ns);
            count -= ns.length();
            result.add(n);
        }

        Collections.sort(result);
        StringBuilder sb = new StringBuilder();
        for (int i : result) {
            sb.append(i);
        }
        return sb.toString();
    }


    public String originalDigits2(String s) {
        int[] bucket = new int[26 + 'a'];
        for (int i = 0; i < s.length(); ++i) {
            bucket[s.charAt(i)]++;
        }
        int[] cnt = new int[10];
        cnt[0] = bucket['z'];
        cnt[2] = bucket['w'];
        cnt[4] = bucket['u'];
        cnt[6] = bucket['x'];
        cnt[8] = bucket['g'];

        cnt[3] = bucket['h'] - cnt[8];
        cnt[5] = bucket['f'] - cnt[4];
        cnt[7] = bucket['s'] - cnt[6];

        cnt[1] = bucket['o'] - cnt[0] - cnt[2] - cnt[4];

        cnt[9] = bucket['i'] - cnt[5] - cnt[6] - cnt[8];

        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < cnt[i]; ++j) {
                ans.append((char) (i + '0'));
            }
        }
        return ans.toString();
    }

}
