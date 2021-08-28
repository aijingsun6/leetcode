package org.alking.mian;

import org.alking.common.TreeNode;

public class M0402 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    /**
     * [start,end]
     */
    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {

        if (start < end) {
            int mid = start + (end - start)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = sortedArrayToBST(nums, start, mid - 1);
            root.right = sortedArrayToBST(nums, mid + 1, end);
            return root;
        } else if (start == end) {
            return new TreeNode(nums[start]);
        } else {
            return null;
        }
    }
}
