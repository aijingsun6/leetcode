package org.alking.p800;

import org.alking.common.TreeNode;

public class P897 {


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
