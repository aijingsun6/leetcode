package org.alking.p100;

import org.alking.common.TreeNode;

public class P112 {

    public boolean hasPathSum(TreeNode root, int sum) {

        if (root == null) {
            return false;
        }
        return dfs(root, sum);
    }

    private boolean dfs(TreeNode root, int left) {

        int v = root.val;

        if (root.left == null && root.right == null) {

            if (v == left) {
                return true;
            }
            return false;

        }

        left = left - v;
        if (root.left != null && dfs(root.left, left)) {
            return true;
        }
        if (root.right != null && dfs(root.right, left)) {
            return true;
        }
        return false;
    }

}
