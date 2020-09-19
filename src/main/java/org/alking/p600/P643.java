package org.alking.p600;

public class P643 {


    public double findMaxAverage(int[] nums, int k) {

        int[] sums = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length;i++){
            sum += nums[i];
            sums[i] = sum;
        }

        if(nums.length <= k){
            return ((double) sums[nums.length-1])/nums.length;
        }

        int max = sums[k-1];
        for(int i = k; i < nums.length;i++){
            max = Math.max(max, sums[i]  - sums[i-k]);
        }
        return ((double)(max)) / k;

    }
}
