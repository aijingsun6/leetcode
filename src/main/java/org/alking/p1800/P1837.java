package org.alking.p1800;

/**
 * https://leetcode-cn.com/problems/sum-of-digits-in-base-k/
 *
 */
public class P1837 {

    public int sumBase(int n, int k) {
        int acc = 0;
        while (n > 0){
            acc += (n%k);
            n = n/k;
        }
        return acc;
    }
}
