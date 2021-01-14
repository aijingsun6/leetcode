package org.alking.p900;

import org.alking.common.TreeNode;

public class P938 {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        sum = 0;
        dfs(root, low, high);
        return sum;
    }

    private int sum = 0;

    public void dfs(TreeNode root, int low, int high) {
        if(root == null){
            return;
        }
        int value = root.val;
        if (value < low) {
            dfs(root.right, low, high);
            return;
        }
        if (value > high) {
            dfs(root.left, low, high);
            return;
        }
        sum += value;
        dfs(root.left, low, high);
        dfs(root.right, low, high);
    }
}
