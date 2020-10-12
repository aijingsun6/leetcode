package org.alking.p500;

public class P530 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }
        this.prev = -1;
        this.result = Integer.MAX_VALUE;

        dfs(root);

        return result;
    }

    private Integer prev;

    private int result;

    private void dfs(TreeNode root) {
        if (root.left != null) {
            dfs(root.left);
        }

        if (prev < 0) {
            prev = root.val;
        } else {
            int diff = root.val - prev;
            this.result = Math.min(this.result, diff);
            this.prev = root.val;
        }

        if (root.right != null) {
            dfs(root.right);
        }
    }
}
