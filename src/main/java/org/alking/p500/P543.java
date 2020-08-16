package org.alking.p500;

/**
 * <a href="https://leetcode-cn.com/problems/diameter-of-binary-tree/">543. 二叉树的直径</a>
 */
public class P543 {


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int depth(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 0;
        }

        int leftDepth = 0;
        int rightDept = 0;
        if (root.left != null) {
            leftDepth = depth(root.left);
        }
        if (root.right != null) {
            rightDept = depth(root.right);
        }
        return 1 + Math.max(leftDepth, rightDept);

    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        int depth = depth(root);
        int maxLeft = diameterOfBinaryTree(root.left);
        int maxRight = diameterOfBinaryTree(root.right);
        if (root.left == null || root.right == null) {
            return Math.max(depth, Math.max(maxLeft, maxRight));
        }
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        return Math.max(leftDepth + rightDepth + 2, Math.max(maxLeft, maxRight));
    }


}
