package org.alking.p1400;

public class P1480 {

    public int[] runningSum(int[] nums) {

        if(nums == null || nums.length == 0){
            return new int[0];
        }

        int[] result = new int[nums.length];
        int sum = 0;
        for( int i = 0; i < nums.length;i++){
            sum += nums[i];
            result[i] = sum;
        }
        return result;

    }
}
