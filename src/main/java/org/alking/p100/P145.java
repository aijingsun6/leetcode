package org.alking.p100;

import java.util.ArrayList;
import java.util.List;

public class P145 {

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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> acc = new ArrayList<>();
        postorderTraversal(root,acc);
        return acc;

    }

    private void postorderTraversal(TreeNode root,List<Integer> acc){
        if(root == null){
            return;
        }

        postorderTraversal(root.left,acc);
        postorderTraversal(root.right,acc);
        acc.add(root.val);
    }


}
