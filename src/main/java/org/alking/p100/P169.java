package org.alking.p100;

/**
 * https://leetcode-cn.com/problems/majority-element/
 */
public class P169 {

    public int majorityElement(int[] nums) {
        //摩尔投票法
        int maj = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            int v = nums[i];
            if (v == maj) {
                count += 1;
            } else if (count > 0) {
                count--;
            } else {
                maj = v;
                count = 1;
            }


        }
        return maj;
    }
}
