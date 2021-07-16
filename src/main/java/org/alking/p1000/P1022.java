package org.alking.p1000;

import org.alking.common.TreeNode;

public class P1022 {

    private int result = 0;

    public int sumRootToLeaf(TreeNode root) {
        this.result = 0;
        sumRootToLeaf(root, 0);
        return this.result;
    }

    private void sumRootToLeaf(TreeNode root, int acc) {
        if(root == null){
            return;
        }
        // root != null
        acc = acc*2 + root.val;
        if (root.left == null && root.right == null) {
            this.result += acc;
            return;
        }
        if (root.left != null) {
            sumRootToLeaf(root.left,acc);
        }
        if(root.right != null){
            sumRootToLeaf(root.right,acc);
        }
    }
}
