package org.alking.p700;

import java.util.ArrayList;
import java.util.List;

public class P763 {


    public List<Integer> partitionLabels(String s) {
        List<Integer> acc = new ArrayList<>();
        int[] lastIdx = new int['z' - 'a' + 1];
        for (int i = 0; i < s.length(); i++) {
            lastIdx[s.charAt(i) - 'a'] = i;
        }
        int left = 0;
        int right;
        int idx;
        while (left < s.length()) {

            right = lastIdx[s.charAt(left) - 'a'];
            for (idx = left; idx < right; idx++) {
                right = Math.max(right, lastIdx[s.charAt(idx) - 'a']);
            }
            acc.add(right-left+1);
            left = right + 1;
        }

        return acc;

    }
}
