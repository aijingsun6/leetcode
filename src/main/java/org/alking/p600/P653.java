package org.alking.p600;

import org.alking.common.TreeNode;

public class P653 {

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        return findTarget(root, root, k);
    }

    public boolean findTarget(TreeNode root, TreeNode node, int k) {
        if (node == null) {
            return false;
        }

        if (node.left != null && findTarget(root, node.left, k)) {
            return true;
        }
        int v = node.val;
        if ((v << 1 != k) && findNum(root, k - v)) {
            return true;
        }
        if (node.right != null && findTarget(root, node.right, k)) {
            return true;
        }
        return false;
    }

    public boolean findNum(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (k < root.val) {
            return findNum(root.left, k);
        } else if (k > root.val) {
            return findNum(root.right, k);
        } else {
            return true;
        }
    }
}
