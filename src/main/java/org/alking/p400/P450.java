package org.alking.p400;

import org.alking.common.TreeNode;

public class P450 {

    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // hit node
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left != null) {
                root.left = deleteMax(root.left);
                root.val = maxNode.val;
            } else {
                root.right = deleteMin(root.right);
                root.val = minNode.val;
            }
        }

        return root;

    }


    private TreeNode maxNode;

    private TreeNode deleteMax(TreeNode root) {
        if (root.right == null) {
            // root is max
            maxNode = root;
            return root.left;
        }
        root.right = deleteMax(root.right);
        return root;
    }


    private TreeNode minNode;

    private TreeNode deleteMin(TreeNode root) {

        if (root.left == null) {
            // root is min
            minNode = root;
            return root.right;
        }

        root.left = deleteMin(root.left);
        return root;
    }
}
