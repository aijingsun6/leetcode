package org.alking.p100;

import org.alking.common.TreeNode;

public class P114 {

    public void flatten(TreeNode root) {

        if (root == null) {
            return;
        }
        tail = null;
        preorder(root);

    }

    private TreeNode tail;

    private void preorder(TreeNode node) {

        final TreeNode left = node.left;
        final TreeNode right = node.right;

        if (tail != null) {
            tail.right = node;
        }
        tail = node;

        if (left != null) {
            preorder(left);
        }

        if (right != null) {
            preorder(right);
        }
        tail.left = null;
        node.left = null;
    }
}
