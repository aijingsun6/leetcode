package org.alking.offer;

public class O53 {

    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        final int N = nums.length;
        // find left
        int leftPtr = 0;
        int left = 0;
        int right = N - 1;
        int mid;
        //找到第一个数字 = target
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        leftPtr = left;
        if(nums[leftPtr] != target){
            return 0;
        }
        //找到第一个数字 > target
        left = 0;
        right = N - 1;
        int rightPtr = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if(nums[left] > target){
            rightPtr = left;
        }else {
            rightPtr = left + 1;
        }
        return rightPtr - leftPtr;
    }

}
