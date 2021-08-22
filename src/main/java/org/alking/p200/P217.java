package org.alking.p200;

public class P217 {

    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        int[] tmp = new int[nums.length];
        return sort(nums, 0, nums.length, tmp);
    }

    /**
     * [left,right)
     */
    private boolean sort(int[] nums, int left, int right, int[] tmp) {

        if (left < right) {
            int mid = left + (right - left) / 2;
            if(mid == left){
                return merge(nums, left, mid, right, tmp);
            }
            boolean sleft = sort(nums, left, mid, tmp);
            boolean sright = sort(nums, mid, right, tmp);
            boolean merge = merge(nums, left, mid, right, tmp);
            return sleft || sright || merge;
        }
        return false;
    }

    /**
     * [left,mid) + [mid,right)
     */
    private boolean merge(int[] nums, int left, int mid, int right, int[] tmp) {
        int i = left;
        int j = mid;
        int offset = 0;
        while (i < mid && j < right) {
            if (nums[i] < nums[j]) {
                tmp[offset++] = nums[i++];
            } else if (nums[i] > nums[j]) {
                tmp[offset++] = nums[j++];
            } else {
                return true;
            }
        }

        while (i < mid) {
            tmp[offset++] = nums[i++];
        }
        while (j < right) {
            tmp[offset++] = nums[j++];
        }
        System.arraycopy(tmp, 0, nums, left, right - left);
        return false;
    }
}
