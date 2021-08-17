package org.alking.p600;

import org.alking.common.TreeNode;

public class P687 {

    public int longestUnivaluePath(TreeNode root) {

        this.result = 0;
        if (root == null) {
            return 0;
        }
        dfs(root);
        return result;
    }

    private int result = 0;

    private int dfs(TreeNode node) {
        int left = 0;
        int right = 0;
        if (node.left != null) {
            int v = dfs(node.left);
            if (node.left.val == node.val) {
                left += v;
            }
        }
        if (node.right != null) {
            int v = dfs(node.right);
            if (node.right.val == node.val) {
                right += v;
            }
        }

        int cross = 1 + left + right;
        if (cross > result) {
            result = cross;
        }
        int max = Math.max(1 + left, 1 + right);
        result = Math.max(result, max);
        return max;
    }

}
