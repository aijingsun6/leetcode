package org.alking.p800;

public class P897 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public TreeNode increasingBST(TreeNode root) {
        dummy = new TreeNode(0);
        tail = dummy;
        dfs(root);
        return dummy.right;
    }

    TreeNode dummy = new TreeNode(0);
    TreeNode tail = dummy;
    private void dfs(TreeNode root) {
        if (root.left != null) {
            dfs(root.left);
        }
        root.left = null;
        tail.right = root;
        tail = root;
        if (root.right != null) {
            dfs(root.right);
        }
    }
}
