package org.alking.p1900;

/**
 * https://leetcode-cn.com/problems/build-array-from-permutation/
 */
public class P1920 {
    public int[] buildArray(int[] nums) {

        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length;i++){
            result[i] = nums[nums[i]];
        }
        return result;
    }

}
