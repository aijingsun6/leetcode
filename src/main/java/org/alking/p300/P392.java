package org.alking.p300;

/**
 * <a href="https://leetcode-cn.com/problems/is-subsequence/">392. 判断子序列</a>
 */
public class P392 {

    public boolean isSubsequence(String s, String t) {
        int ss = s.length();
        int ts = t.length();
        if (ss > ts) {
            return false;
        }

        int idxT = 0;
        for (int idx = 0; idx < ss; idx++) {

            if (idxT >= ts) {
                return false;
            }
            char c = s.charAt(idx);
            boolean find = false;
            for (int j = idxT; j < ts; j++) {

                char ct = t.charAt(j);
                if(ct == c){
                    idxT = j + 1;
                    find = true;
                    break;
                }

            }
            if(!find){
                return false;
            }
        }
        return true;
    }
}
