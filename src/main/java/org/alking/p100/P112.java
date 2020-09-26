package org.alking.p100;

public class P112 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

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
