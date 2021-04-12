package org.alking.p200;

import java.util.Arrays;

public class P283 {

    public void moveZeroes(int[] nums) {

        if (nums == null || nums.length < 2) {
            return;
        }

        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[idx++] = nums[i];
            }
        }
        Arrays.fill(nums,idx,nums.length,0);

    }
}
