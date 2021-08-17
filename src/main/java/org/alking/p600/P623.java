package org.alking.p600;

import org.alking.common.TreeNode;

public class P623 {

    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        return addOneRow(root, 1, true, val, depth);
    }

    private TreeNode addOneRow(TreeNode root, final int depthAcc, final boolean left, final int val, final int depth) {

        if (depthAcc == depth) {
            TreeNode add = new TreeNode(val);

            if (left) {
                add.left = root;
            } else {
                add.right = root;
            }
            return add;
        }

        if(root == null){
            if(depthAcc < depth){
                return null;
            }
            return new TreeNode(val);
        }


        root.left = addOneRow(root.left, depthAcc + 1, true, val, depth);
        root.right = addOneRow(root.right, depthAcc + 1, false, val, depth);
        return root;
    }

}
