package org.alking.p0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P94 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> acc = new ArrayList<>();
        inorderTraversal(root, acc);
        return acc;
    }

    private void inorderTraversal(TreeNode root, List<Integer> acc) {
        if(root == null){
            return;
        }
        inorderTraversal(root.left, acc);
        acc.add(root.val);
        inorderTraversal(root.right, acc);

    }
}
