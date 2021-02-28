package org.alking.p300;

public class P395 {

    public int longestSubstring(String s, int k) {
        int result = find(s, 0, s.length() - 1, k);
        return  result == s.length() ? 0: result;
    }

    private int find(String s, final int start, final int end, final int k) {
        if(end - start + 1 < k){
            return 0;
        }

        if(start == end){
            return k > 1 ? 0: 1;
        }
        int[] cntArr = new int['z' - 'a' + 1];
        char c;
        for (int i = start; i <= end; i++) {
            c = s.charAt(i);
            cntArr[c - 'a']++;
        }
        int max = 0;
        boolean find = false;
        int iStart = start;
        for (int i = start; i <= end; i++) {
            c = s.charAt(i);
            if (cntArr[c - 'a'] < k) {
                find = true;
                int sub = find(s, iStart, i-1, k);
                max = Math.max(max, sub);
                iStart = i + 1;
            }
        }
        if (!find) {
            return end - start + 1;
        }
        return max;
    }
}
