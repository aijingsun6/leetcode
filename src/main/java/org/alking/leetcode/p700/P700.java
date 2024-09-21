package org.alking.leetcode.p700;

import org.alking.leetcode.common.TreeNode;

public class P700 {

    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null || root.val == val) {
            return root;
        }
        if (val < root.val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }
}
