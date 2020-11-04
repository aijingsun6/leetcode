package org.alking.p700;

public class P783 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int minDiffInBST(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        if (root.left != null) {
            min = Math.min(min, root.val - findMax(root.left));
            min = Math.min(min, minDiffInBST(root.left));
        }
        if (root.right != null) {
            min = Math.min(min, findMin(root.right) - root.val);
            min = Math.min(min, minDiffInBST(root.right));
        }
        return min;
    }

    private int findMax(TreeNode root) {
        int res = root.val;
        while (root != null) {
            res = Math.max(res, root.val);
            root = root.right;
        }
        return res;
    }

    private int findMin(TreeNode root) {
        int res = root.val;
        while (root != null) {
            res = Math.min(res, root.val);
            root = root.left;
        }
        return res;
    }
}
