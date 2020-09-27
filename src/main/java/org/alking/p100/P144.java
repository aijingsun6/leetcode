package org.alking.p100;

import java.util.ArrayList;
import java.util.List;

public class P144 {

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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> acc = new ArrayList<>();
        dfs(root,acc);
        return acc;

    }

    private void dfs(TreeNode root, List<Integer> acc) {
        if (root == null) {
            return;
        }
        acc.add(root.val);
        dfs(root.left, acc);
        dfs(root.right, acc);
    }
}
