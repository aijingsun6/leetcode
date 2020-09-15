package org.alking.p500;

public class P581 {

    public int findUnsortedSubarray(int[] nums) {

        if (nums == null || nums.length < 2) {
            return 0;
        }
        return findUnsortedSubarray(nums, 0, nums.length - 1);

    }

    private int findUnsortedSubarray(int[] nums, int start, int end) {

        if(start >= end){
            return 0;
        }
        int min = nums[start];
        int max = nums[end];
        for(int idx = start;idx <= end;idx++){
            int v = nums[idx];
            if(v > max){
                max = v;
            }
            if(v < min){
                min = v;
            }
        }

        // find left
        if(nums[start] == min){
            return findUnsortedSubarray(nums, start+1, end);
        }

        if(nums[end] == max){
            return findUnsortedSubarray(nums, start, end-1);
        }


        return end - start + 1;
    }
}
