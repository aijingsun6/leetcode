package org.alking.p2000;

import java.util.Map;
import java.util.TreeMap;

public class P2055 {

    public int[] platesBetweenCandles(String s, int[][] queries) {
        final int N = s.length();
        final char[] chars = s.toCharArray();
        final int[] preSumArray = new int[N];

        /**
         *
         * **|**|***|
         * beforeArray=[-1,-1,2,2,2,5,5,5,5,9]
         * preSumArray=[0,0,0,0,0,2,2,2,2,2,5]
         */
        final int[] beforeArray = new int[N];
        int acc = 0;
        int last = -1;
        for (int i = 0; i < N; i++) {
            if (chars[i] == '|' && last < 0) {
                last = i;
            } else if (chars[i] == '|') {
                acc = acc + i - last - 1;
                last = i;
            }
            beforeArray[i] = last;
            preSumArray[i] = acc;
        }

        /**
         * **|**|***|
         * afterArray = [2,2,2,5,5,5,9,9,9,9]
         */
        final int[] afterArray = new int[N];
        last = -1;
        for (int j = N - 1; j >= 0; j--) {
            if (chars[j] == '|') {
                last = j;
            }
            afterArray[j] = last;
        }
        int[] result = new int[queries.length];
        for(int i = 0; i < queries.length;i++){
            int left = queries[i][0];
            int right = queries[i][1];
            int afterIdx = afterArray[left];
            int beforeIdx = beforeArray[right];
            if(afterIdx > -1 && beforeIdx > -1){
                result[i] = Math.max(0, preSumArray[beforeIdx] - preSumArray[afterIdx]);
            }
        }
        return result;
    }

    public int[] platesBetweenCandles2(String s, int[][] queries) {
        TreeMap<Integer, Integer> preTree = new TreeMap<>();
        int acc = 0;
        int left = 0;
        // find left
        while (left < s.length() && s.charAt(left) == '*') {
            left++;
        }
        if (left < s.length() && s.charAt(left) == '|') {
            preTree.put(left, 0);
        }
        int right = left + 1;
        while (right < s.length()) {
            while (right < s.length() && s.charAt(right) == '*') {
                right++;
            }
            if (right < s.length() && s.charAt(right) == '|') {
                acc = acc + right - left - 1;
                preTree.put(right, acc);
            }
            left = right;
            right++;
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            Map.Entry<Integer, Integer> e1 = preTree.ceilingEntry(queries[i][0]);
            Map.Entry<Integer, Integer> e2 = preTree.floorEntry(queries[i][1]);
            if (e1 != null && e2 != null) {
                result[i] = Math.max(0, e2.getValue() - e1.getValue());
            }
        }
        return result;
    }
}
