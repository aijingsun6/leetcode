package org.alking.lcp;

/**
 * https://leetcode-cn.com/problems/guess-numbers/
 */
public class LCP01 {
    public int game(int[] guess, int[] answer) {
        int acc = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                acc++;
            }
        }
        return acc;

    }
}
