package org.alking.p900;

public class P965 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null) {
            if (root.val != root.left.val) {
                return false;
            }
            if (!isUnivalTree(root.left)) {
                return false;
            }
        }
        if (root.right != null) {
            if (root.val != root.right.val) {
                return false;
            }
            if (!isUnivalTree(root.right)) {
                return false;
            }
        }
        return true;
    }

}
