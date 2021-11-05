package org.alking.p1200;

import java.util.HashMap;

public class P1218 {


    public int longestSubsequence(int[] arr, int difference) {
        int max = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int v = arr[i];
            int c = m.getOrDefault(v-difference,0) + 1;
            m.put(v,c);
            max = Math.max(max,c);
        }
        return max;
    }


}
