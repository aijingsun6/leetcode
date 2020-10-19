package org.alking.p100;

public class P153 {

    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.min(nums[0], nums[1]);
        }

        int left = 0;
        int right = nums.length - 1;
        if(nums[left] < nums[right]){
            return nums[left];
        }
        int mid;
        while (left < right) {
            if (left + 1 == right) {
                return Math.min(nums[left], nums[right]);
            }
            mid = left + (right - left) / 2;
            if (nums[mid] > nums[left]) {
                left = mid;
                continue;
            }
            if (nums[mid] < nums[right]) {
                right = mid;
                continue;
            }
        }
        return nums[left];
    }
}
