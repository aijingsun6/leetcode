package org.alking.tree;

public class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    TreeNode(int x) {
        val = x;
    }


    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left, right);
    }

    private int maxValue(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int max = Math.max(root.val, maxValue(root.left));
        return Math.max(max, maxValue(root.right));
    }

    private int minValue(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int min = Math.min(root.val, minValue(root.left));
        return Math.min(min, minValue(root.right));
    }

    private boolean isValidBST(TreeNode root, int v, boolean leftOrRight) {
        if (root == null) {
            return true;
        }
        if (leftOrRight && root.val >= v) {
            return false;
        }
        if (!leftOrRight && root.val <= v) {
            return false;
        }
        return isValidBST(root.left, v, leftOrRight) && isValidBST(root.right, v, leftOrRight);
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            // for  root
            return true;
        }
        boolean leftCheck = true;
        if (root.left != null) {
            leftCheck =  isValidBST(root.left,root.val,true);
        }
        boolean rightCheck = true;
        if (root.right != null ) {
            rightCheck = isValidBST(root.right,root.val,false);
        }
        if(!leftCheck || !rightCheck){
            return false;
        }

        return isValidBST(root.left) && isValidBST(root.right);
    }
}
