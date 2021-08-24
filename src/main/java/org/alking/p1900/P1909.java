package org.alking.p1900;

public class P1909 {


    public boolean canBeIncreasing(int[] nums) {
        if (nums == null || nums.length < 2) {
            return true;
        }
        int cnt = 0;
        int idx = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                cnt++;
                idx = i;
            }
        }
        if (cnt > 1) {
            return false;
        }
        if (cnt < 1) {
            return true;
        }
        if(idx == 1){
            return true;
        }
        if(idx == nums.length-1){
            return true;
        }
        // cnt == 1
        if (nums[idx] > nums[idx - 2]) {
            return true;
        }
        if(nums[idx+1] > nums[idx-1]){
            return true;
        }
        return false;
    }
}
