package org.alking.p200;

import org.alking.common.TreeNode;

public class P235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }
        if (p.val == q.val) {
            return p;
        }
        int min = Math.min(p.val, q.val);
        int max = Math.max(p.val, q.val);
        return lowestCommonAncestor(root, min, max);
    }

    private TreeNode lowestCommonAncestor(TreeNode root, int min, int max) {

        if (root == null) {
            return null;
        }

        if (root.val == min || root.val == max) {
            return root;
        }

        if (max < root.val) {
            // 都在左边
            return lowestCommonAncestor(root.left, min, max);
        }
        if (root.val < min) {
            // 都在右边
            return lowestCommonAncestor(root.right, min, max);
        }
        // 一个在左边一个在右边
        return root;
    }

}
