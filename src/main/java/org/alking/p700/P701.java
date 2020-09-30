package org.alking.p700;

public class P701 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode prev = root;
        TreeNode head = root;
        while (head != null) {
            if (val < head.val) {
                prev = head;
                head = head.left;
            } else {
                prev = head;
                head = head.right;
            }
        }
        // root = null
        if (val < prev.val) {
            prev.left = new TreeNode(val);
        } else {
            prev.right = new TreeNode(val);
        }
        return root;
    }
}
