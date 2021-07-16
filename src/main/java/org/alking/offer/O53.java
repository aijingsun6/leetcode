package org.alking.offer;


import java.util.function.IntPredicate;

public class O53 {

    private int partition(int[] nums, IntPredicate predicate) {
        int left = 0;
        int right = nums.length;
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (predicate.test(nums[mid])) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int leftPtr = partition(nums, (v) -> v < target);
        int rightPtr = partition(nums, (v) -> v <= target);
        return rightPtr - leftPtr;
    }

}
