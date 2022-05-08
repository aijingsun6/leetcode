package org.alking.p0;

import org.alking.common.TreeNode;

public class P99 {

    private TreeNode prev;

    private TreeNode[][] acc;

    public void recoverTree(TreeNode root) {

        if (root == null) {
            return;
        }
        prev = null;
        acc = new TreeNode[2][];
        preorder(root);

        if (acc[1] != null) {
            int tmp = acc[1][1].val;
            acc[1][1].val = acc[0][0].val;
            acc[0][0].val = tmp;
        } else if (acc[0] != null) {
            int tmp = acc[0][1].val;
            acc[0][1].val = acc[0][0].val;
            acc[0][0].val = tmp;
        }
    }


    /**
     * 前序遍历
     */
    private void preorder(TreeNode node) {

        if (node.left != null) {
            preorder(node.left);
        }
        if (prev != null) {
            if (acc[0] == null && node.val < prev.val) {
                acc[0] = new TreeNode[]{prev, node};
            } else if (acc[1] == null && node.val < prev.val) {
                acc[1] = new TreeNode[]{prev, node};
            }
        }
        prev = node;
        if (node.right != null) {
            preorder(node.right);
        }
    }
}
