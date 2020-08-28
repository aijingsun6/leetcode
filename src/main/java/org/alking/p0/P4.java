package org.alking.p0;

public class P4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null && nums2 == null) {
            return 0;
        }
        if (nums1 == null || nums1.length == 0) {

            return findMedianSortedArrays(nums2);
        }
        if (nums2 == null || nums2.length == 0) {
            return findMedianSortedArrays(nums1);
        }

        int idx = 0;
        int idx1 = 0;
        int idx2 = 0;
        int[] arr = new int[nums1.length + nums2.length];
        int v1;
        int v2;
        int min;
        while (idx1 < nums1.length && idx2 < nums2.length) {
            v1 = nums1[idx1];
            v2 = nums2[idx2];
            if (v1 < v2) {
                min = v1;
                idx1 += 1;
            } else {
                min = v2;
                idx2 += 1;
            }
            arr[idx] = min;
            idx += 1;
        }
        if (idx1 == nums1.length) {
            System.arraycopy(nums2, idx2, arr, idx, nums2.length - idx2);
        } else {
            System.arraycopy(nums1, idx1, arr, idx, nums1.length - idx1);
        }
        return findMedianSortedArrays(arr);
    }

    private double findMedianSortedArrays(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            double d = nums[0] + nums[1];
            return d / 2;
        }

        boolean odd = nums.length % 2 == 1;

        int target = nums.length / 2;
        if (odd) {
            return nums[target];
        }
        double d = nums[target - 1] + nums[target];
        return d / 2;
    }
}
