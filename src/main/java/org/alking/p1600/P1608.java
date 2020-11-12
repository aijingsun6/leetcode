package org.alking.p1600;

import java.util.Arrays;

public class P1608 {

    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int acc = 0;
        for(int i = nums.length-1; i >=0;i--){
            if(i > 0 && nums[i] != nums[i-1] && acc >= nums[i]){
                return acc;
            }
            acc += 1;
        }
        for(int i = nums[0];i >=0; i --){
            if(acc >= i){
                return i;
            }
        }
        return -1;
    }
}
