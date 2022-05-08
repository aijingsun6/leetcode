package org.alking.p1800;

public class p1863 {


    int result = 0;

    public int subsetXORSum(int[] nums) {
        result = 0;
        backtrace(nums,0,0);
        return result;
    }

    private void backtrace(int[] nums, int from, int acc) {

        if (from >= nums.length) {
            this.result += acc;
            return;
        }
        backtrace(nums,from+1,acc);
        backtrace(nums,from+1,acc^nums[from]);
    }
}
