package org.alking.p500;

import org.alking.common.TreeNode;

public class P563 {


    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        res = 0;
        dfs(root);
        return res;
    }

    private int res = 0;

    private int dfs(TreeNode root) {
        int left = 0;
        if(root.left != null){
            left = dfs(root.left);
        }
        int right = 0;
        if(root.right != null){
            right = dfs(root.right);
        }
        res += Math.abs(left -right);
        return root.val + left + right;
    }

}
