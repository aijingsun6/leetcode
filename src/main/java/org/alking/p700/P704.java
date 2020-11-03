package org.alking.p700;

public class P704 {


    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (target < nums[left] || target > nums[right]) {
            return -1;
        }
        if (target == nums[left]) {
            return left;
        }
        if (target == nums[right]) {
            return right;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            int v = nums[mid];
            if (target < v) {
                right = mid - 1;
            } else if (target > v) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }
}
