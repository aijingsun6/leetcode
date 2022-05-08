package org.alking.p600;

import org.alking.common.TreeNode;

public class P654 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums, final int start, final int end) {
        if (start == end) {
            return new TreeNode(nums[start]);
        }

        int maxIdx = start;
        int maxValue = nums[start];
        for (int i = start; i <= end; i++) {
            if (nums[i] > maxValue) {
                maxIdx = i;
                maxValue = nums[i];
            }
        }
        TreeNode root = new TreeNode(maxValue);
        if (maxIdx > start) {
            root.left = constructMaximumBinaryTree(nums, start, maxIdx - 1);
        }
        if (end > maxIdx) {
            root.right = constructMaximumBinaryTree(nums, maxIdx + 1, end);
        }

        return root;
    }

}
