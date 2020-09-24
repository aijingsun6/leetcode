package org.alking.p0;

public class P34 {

    public int[] searchRange(int[] nums, int target) {
        if(nums== null || nums.length==0){
            return new int[]{-1,-1};
        }
        int left = findLeft(nums, target);
        int right = findRight(nums, target);
        return new int[]{left, right};
    }

    private int findLeft(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        if (nums[left] == target) {
            return left;
        }
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (left >= 0 &&  nums[left] == target) {
            return left;
        }
        if (left + 1 < nums.length &&  nums[left + 1] == target) {
            return left + 1;
        }
        return -1;
    }

    private int findRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (nums[right] == target) {
            return right;
        }
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (right >= 0 && nums[right] == target) {
            return right;
        }
        if (right > 0 && nums[right - 1] == target) {
            return right - 1;
        }
        return -1;
    }


}
