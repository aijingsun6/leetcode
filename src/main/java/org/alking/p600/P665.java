package org.alking.p600;

public class P665 {

    public boolean checkPossibility(int[] nums) {

        int len = nums.length;
        if(len<=2) return true;
        int low = 0;
        int high = len-1;

        while(low<high&&nums[low]<=nums[low+1])low++;
        while(low<high&&nums[high]>=nums[high-1]) high--;

        if(low >= high){
            return true;
        }

        if(low + 1 < high){
            return false;
        }

        if(low == 0 || high == len-1){
            return true;
        }

        return nums[low] <= nums[high+1] && nums[low-1] <= nums[high];


    }
}
