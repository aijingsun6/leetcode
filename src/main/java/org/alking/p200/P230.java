package org.alking.p200;

public class P230 {

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


    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        count = 0;
        target = k;
        dfs(root);
        return res;
    }

    private int res = 0;
    private int count = 0;
    private int target = 0;

    private void dfs(TreeNode root) {
        if (root.left != null) {
            dfs(root.left);
        }
        count += 1;
        if (count == target) {
            res = root.val;
        }
        if (root.right != null) {
            dfs(root.right);
        }
    }
}
