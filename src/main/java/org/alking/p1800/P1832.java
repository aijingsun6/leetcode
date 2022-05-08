package org.alking.p1800;

/**
 * https://leetcode-cn.com/problems/check-if-the-sentence-is-pangram/
 */
public class P1832 {

    public boolean checkIfPangram(String sentence) {
        int[] bucket = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            bucket[sentence.charAt(i) - 'a']++;
        }

        for (int v : bucket) {
            if (v < 1) {
                return false;
            }
        }
        return true;
    }
}
