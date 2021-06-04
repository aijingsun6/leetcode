package org.alking.p1400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1403 {

    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length;i++){
            sum += nums[i];
        }
        List<Integer> acc = new ArrayList<>();
        int s = 0;
        for(int i = nums.length-1;i >= 0; i --){
            s += nums[i];
            acc.add(nums[i]);
            if(s*2 > sum){
                break;
            }
        }
        return acc;
    }
}
