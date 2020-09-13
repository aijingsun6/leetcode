package org.alking.p1400;

public class P1470 {

    public int[] shuffle(int[] nums, int n) {

        if(nums == null || nums.length != n * 2){
            return null;
        }

        int[] result = new int[n * 2];
        int idx = 0;
        for(int i = 0; i < n; i ++){
            result[idx] = nums[i];
            result[idx + 1] = nums[i + n];
            idx  = idx + 2;

        }
        return result;

    }
}
