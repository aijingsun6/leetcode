package org.alking.p100;

public class P129 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int sum = 0;

    public int sumNumbers(TreeNode root) {

        if (root == null) {
            return 0;
        }
        sum = 0;
        dfs(root,0);
        return sum;
    }

    private void dfs(TreeNode root, int acc) {

        int v = root.val;
        acc = acc * 10 + v;
        if (root.left == null && root.right == null) {
            sum += acc;
            return;
        }

        if (root.left != null) {
            dfs(root.left, acc);
        }
        if (root.right != null) {
            dfs(root.right, acc);
        }
    }

}
