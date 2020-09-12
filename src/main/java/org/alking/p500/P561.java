package org.alking.p500;

import java.util.Arrays;

public class P561 {

    public int arrayPairSum(int[] nums) {

        if(nums == null || nums.length < 1){
            return 0;
        }
        Arrays.sort(nums);

        int sum = 0;
        int idx = 0;
        while (idx < nums.length){
            sum += nums[idx];
            idx += 2;
        }
        return sum;
    }

}
