package org.alking.leetcode.p900;

/**
 * 满足3个条件：
 * 1. 法官的出度 = 0
 * 2. 只有一个法官
 * 3. 法官的入度 = (n -1)
 */
public class P997 {

    public int findJudge(int n, int[][] trust) {
        int[] chudu = new int[n + 1];
        int[] rudu = new int[n + 1];
        for (int[] t : trust) {
            chudu[t[0]] += 1;
            rudu[t[1]] += 1;
        }
        int result = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (chudu[i] == 0) {
                result = i;
                count++;
            }
        }
        if (count != 1) {
            return -1;
        }
        return rudu[result] == (n - 1) ? result : -1;
    }
}
