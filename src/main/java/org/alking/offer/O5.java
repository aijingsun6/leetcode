package org.alking.offer;

/**
 * https://leetcode-cn.com/problems/one-away-lcci/
 */
public class O5 {

    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }


    public boolean oneEditAway(String first, String second) {
        // 编辑距离
        final int ROW = first.length() + 1;
        final int COL = second.length() + 1;
        int[][] dp = new int[ROW][COL];
        for (int i = 0; i < ROW; i++) {
            dp[i] = new int[COL];
        }
        for (int i = 0; i < COL; i++) {
            dp[0][i] = i;
        }
        for (int j = 0; j < ROW; j++) {
            dp[j][0] = j;
        }
        for (int r = 0; r < first.length(); r++) {
            for (int c = 0; c < second.length(); c++) {
                int min = dp[r][c];
                min = Math.min(min, dp[r + 1][c]);
                min = Math.min(min, dp[r][c + 1]);
                dp[r + 1][c + 1] = first.charAt(r) == second.charAt(c) ? min : min + 1;
            }
        }
        return dp[first.length()][second.length()] < 2;
    }

    public boolean oneEditAway2(String first, String second) {
        int fs = first.length();
        int ss = second.length();
        if (Math.abs(fs - ss) > 1) {
            return false;
        }
        if (fs == ss) {
            int diff = 0;
            for(int idx = 0; idx < fs;idx++){
                if(first.charAt(idx) != second.charAt(idx) && ++diff > 1){
                    return false;
                }
            }
            return true;
        }
        int max = Math.min(fs,ss);
        int idx = 0;
        while (idx < max && first.charAt(idx) == second.charAt(idx)){
            idx ++;
        }

        if(fs < ss){
            return first.substring(idx,fs).equals( second.substring(idx+1,ss));
        }
        return first.substring(idx+1,fs).equals( second.substring(idx,ss));


    }

}
