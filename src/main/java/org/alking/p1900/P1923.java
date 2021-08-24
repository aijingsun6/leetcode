package org.alking.p1900;

/**
 * https://leetcode-cn.com/problems/concatenation-of-array/
 */
public class P1923 {

    public int[] getConcatenation(int[] nums) {
        final int n = nums.length;
        int[] result = new int[n << 1];
        System.arraycopy(nums,0,result,0,n);
        System.arraycopy(nums,0,result,n,n);
        return result;
    }
}
