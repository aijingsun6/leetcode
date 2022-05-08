package org.alking.mian;

/**
 * https://leetcode-cn.com/problems/palindrome-permutation-lcci/
 */
public class M0104 {

    public boolean canPermutePalindrome(String s) {
        int N = 'Z'+1;
        int[] bucket = new int[N];
        for (int i = 0; i < s.length(); i++) {
            bucket[s.charAt(i)]++;
        }
        int odd = 0;
        for (int i = 0; i < N; i++) {
            if (bucket[i] % 2 == 1) {
                if(++odd > 1){
                    return false;
                }
            }
        }
        return true;
    }
}
