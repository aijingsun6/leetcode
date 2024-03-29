package org.alking.p400;

import org.alking.common.TreeNode;

public class P404 {

    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }

    private int sumOfLeftLeaves(TreeNode root, boolean left) {

        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {

            if (left) {
                return root.val;
            }
            return 0;
        }

        int sum = 0;
        if (root.left != null) {
            sum += sumOfLeftLeaves(root.left, true);
        }
        if (root.right != null) {
            sum += sumOfLeftLeaves(root.right, false);
        }
        return sum;
    }
}
