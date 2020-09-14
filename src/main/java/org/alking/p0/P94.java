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

        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> acc = new ArrayList<>();

        inorderTraversal(root, acc);
        return acc;


    }

    private void inorderTraversal(TreeNode root, List<Integer> acc) {
        if (root.left != null) {
            inorderTraversal(root.left, acc);
        }
        acc.add(root.val);
        if (root.right != null) {
            inorderTraversal(root.right, acc);
        }

    }
}
